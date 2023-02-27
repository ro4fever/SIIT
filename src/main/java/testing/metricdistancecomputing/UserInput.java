package testing.metricdistancecomputing;


import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class UserInput {

    MessagePrinter printer = new MessagePrinter();

    Scanner scan = new Scanner(System.in);

    char selection = '0';

    public void inputScaleFormat() {
        selection = scan.nextLine().charAt(0);
        switch (selection) {
            case '1':
                ScaleFormat.setScale("millimeters");
                break;
            case '2':
                ScaleFormat.setScale("centimeters");
                break;
            case '3':
                ScaleFormat.setScale("decimeters");
                break;
            case '4':
                ScaleFormat.setScale("meters");
                break;
            case '5':
                ScaleFormat.setScale("kilometers");
                break;
            case 'q':
                return;
            default:
                printer.printWrongFormat();
        }
    }

    public void inputValue() {
        int value = parseInt(scan.nextLine());
        ScaleFormat.setMultiplier();
        Calculator.setValue(value);
        Calculator.addToList();
    }

    public void selectOperation() {
        selection = scan.nextLine().charAt(0);
        switch (selection) {
            case '+':
                Calculator.setOperation('+');
                break;
            case '-':
                Calculator.setOperation('-');
                break;
            case 'q':
                break;
            default:
                printer.printWrongOperation();
        }
    }

    public void selectResult() {
        selection = scan.nextLine().charAt(0);
        switch (selection) {
            case 'r':
                printer.printResult();
                Calculator.emptyList();
                startSelection();
            case 'n':
                continueSelection();
            case 'q':
                return;
            default:
                printer.printWrongSelection();
        }
    }

    public void startSelection() {

        printer.printScaleFormat();
        inputScaleFormat();
        if (selection != 'q') {
            printer.printInputValue();
            inputValue();
            printer.printSelectOperation();
            selectOperation();
        } if (selection != 'q') {
            printer.printScaleFormat();
            inputScaleFormat();
        } if (selection != 'q') {
            printer.printInputValue();
            inputValue();
            printer.printResultSelection();
            selectResult();
        }
    }

    public void continueSelection() {
        if (selection != 'q') {
            printer.printSelectOperation();
            selectOperation();
        }
        if (selection != 'q') {
            printer.printScaleFormat();
            inputScaleFormat();
            printer.printInputValue();
            inputValue();
            printer.printResultSelection();
            selectResult();
        }
    }
}
