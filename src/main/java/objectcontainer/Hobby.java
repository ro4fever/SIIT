package objectcontainer;


public class Hobby extends Address {

    private String name;
    private int frequency;

    public Hobby (String hobbyName, int inputFrequency, String address) {
        super(address);
        this.name = hobbyName;
        this.frequency = inputFrequency;
    }

    @Override
    public String toString() {
        return "Person's Hobby {" +
                "name = '" + name + '\'' +
                ", frequency = " + frequency +
                '}';
    }


}
