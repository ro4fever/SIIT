package testing.metricdistancecomputing;


public class ScaleFormat {

    static MessagePrinter printer;
    private static int multiplier;

    private static String scale;

    public static void setScale(String inputScale) {
        scale = inputScale;
    }

    public static void setMultiplier() {
        switch (scale) {
            case "millimeters":
                multiplier = 1;
                break;
            case "centimeters":
                multiplier = 10;
                break;
            case "decimeters":
                multiplier = 100;
                break;
            case "meters":
                multiplier = 1000;
                break;
            case "kilometers":
                multiplier = 1000000;
                break;
            default:
                printer.printWrongFormat();
        }
    }

    public static int getMultiplier() {
        return multiplier;
    }

    public static String getScale() {
        return scale;
    }
}
