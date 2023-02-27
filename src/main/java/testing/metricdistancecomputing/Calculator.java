package testing.metricdistancecomputing;


import java.util.LinkedList;
import java.util.List;
public class Calculator {

    private static char operation;

    private static int result;

    private static int value;

    private static List<Integer> list = new LinkedList<>();
    public static void setOperation(char inputOperation) {
        operation = inputOperation;
    }

    public static void setValue(int inputValue) {
        value = inputValue;
    }

    public static int calculateResult() {
        result = 0;
        for(int i : list) result += i;
        return result;
    }

    public static void emptyList() {
        list.clear();
    }

    public static void addToList() {
        if (operation == '-') {
            list.add(-(int) (value * ScaleFormat.getMultiplier()));
        } else list.add(value * ScaleFormat.getMultiplier());
    }

    public static int calculateTest(int value1, int value2, char operation) {
        if (operation == '+') {
            return value1 + value2;
        } else if (operation == '-') {
            return value1 - value2;
        } else return 0;
    }
}
