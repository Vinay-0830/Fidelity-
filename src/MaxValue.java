public class MaxValue {
    private byte number;
    public MaxValue(byte number) {
        this.number = number;
    }

    public void displayValue() {
        System.out.print("Value of the number: "+number);
        number=Byte.MAX_VALUE;
        System.out.println("Largest value stored in the signed byte: "+number);
    }

    public static void main(String[] args) {
        MaxValue maxValue = new MaxValue((byte) .125);
        maxValue.displayValue();

    }
}
