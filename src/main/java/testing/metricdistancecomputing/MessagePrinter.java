package testing.metricdistancecomputing;


public class MessagePrinter {

    public void printScaleFormat() {
        System.out.println("Please select the scale format you want: \n" +
                "'1' for millimeters\n" +
                "'2' for centimeters\n" +
                "'3' for decimeters\n" +
                "'4' for meters\n" +
                "'5' for kilometers\n" +
                "------------------------------------------------------------------\n" +
                "'q' to exit\n");
    }

    public void printInputValue() {
        System.out.println("Please input the number of " + ScaleFormat.getScale() + "\n");
    }

    public void printSelectOperation() {
        System.out.println("Please select the operation you want\n" +
                "'+' for addition\n" +
                "'-' for subtraction\n" +
                "------------------------------------------------------------------\n" +
                        " or select 'q' to exit\n");
    }

    public void printResultSelection() {
        System.out.println("Please select:\n" +
                "'n' to add a new value\n" +
                "'r' to proceed to computation\n" +
                "------------------------------------------------------------------\n" +
                " or select 'q' to exit\n");
    }

    public void printWrongFormat() {
        System.out.println("The selected format is wrong.\n");
    }

    public void printWrongOperation() {
        System.out.println("The selected operation is wrong.\n");
    }

    public void printWrongSelection() {
        System.out.println("Please enter the correct choice.\n");
    }

    public void printResult() {
        System.out.println("The result is: " + Calculator.calculateResult() + " mm.\n");
    }


}
