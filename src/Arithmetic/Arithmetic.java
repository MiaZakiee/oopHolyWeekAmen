package Arithmetic;

public class Arithmetic <X extends Number, Y extends Number> {
    private final X numA;
    private final Y numB;

    public Arithmetic (X numA, Y numB) {
        if (!(numA instanceof Number) || !(numB instanceof Number)) {
            throw new IllegalArgumentException("Invalid input!");
        }

        this.numA = numA;
        this.numB = numB;
    }

    public Number add() {
        return (isFloat() ? numA.doubleValue() + numB.doubleValue() : numA.intValue() + numB.intValue());
    }

    public Number subtract() {
        return (isFloat() ? numA.doubleValue() - numB.doubleValue() : numA.intValue() - numB.intValue());
    }

    public Number multiply() {
        return (isFloat() ? numA.doubleValue() * numB.doubleValue() : numA.intValue() * numB.intValue());
    }

    public Number divide() {
        if (numB.equals(0)) {
            throw new ArithmeticException("Cannot Divide with Zero");
        }
        return numA.doubleValue() / numB.doubleValue();
    }

    public Number getMin() {
        return (numA.doubleValue() < numB.doubleValue() ? numA : numB);
    }

    public Number getMax() {
        return (numA.doubleValue() > numB.doubleValue() ? numA : numB);
    }

    private boolean isFloat () {
        return (numA instanceof Float || numA instanceof Double || numB instanceof Float || numB instanceof Double);
    }

    public void display () {
        System.out.println("A: " + numA + " B: " + numB);
    }

}
