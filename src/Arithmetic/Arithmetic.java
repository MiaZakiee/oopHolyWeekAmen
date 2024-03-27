package Arithmetic;

import java.util.*;

public class Arithmetic <X extends Number, Y extends Number> {
    private X numA;
    private Y numB;
    List<String> validDataTypes = List.of("java.lang.Integer",
                                        "java.lang.Float",
                                        "java.lang.Double",
                                        "java.lang.Long",
                                        "java.lang.Short");

    public Arithmetic (X numA, Y numB) {
        try {
            String dataTypeA = ((Object) numA).getClass().getName();
            String dataTypeB = ((Object) numB).getClass().getName();
            if (!validDataTypes.contains(dataTypeA) || !validDataTypes.contains(dataTypeB)) {
                throw new IllegalArgumentException();
            }

            this.numA = numA;
            this.numB = numB;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data type(s) used.");
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T add() {
        if (numA instanceof Float || numA instanceof Double || numB instanceof Float || numB instanceof Double) {
            return (T) ((Number) (numA.floatValue() + numB.floatValue()));
        } else {
            return (T) ((Number) (numA.intValue() + numB.intValue()));
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T subtract() {
        if (numA instanceof Float || numA instanceof Double || numB instanceof Float || numB instanceof Double) {
            return (T) ((Number) (numA.floatValue() - numB.floatValue()));
        } else {
            return (T) ((Number) (numA.intValue() - numB.intValue()));
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T multiply() {
        if (numA instanceof Float || numA instanceof Double || numB instanceof Float || numB instanceof Double) {
            return (T) ((Number) (numA.floatValue() * numB.floatValue()));
        } else {
            return (T) ((Number) (numA.intValue() * numB.intValue()));
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T divide() {
        try {
            return (T) ((Number) (numA.floatValue() / numB.floatValue()));
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Invalid Operation");
        }
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T getMin() {
        return (T) (numA.floatValue() < numB.floatValue() ? numA : numB);
    }

    @SuppressWarnings("unchecked")
    public <T extends Number> T getMax() {
        return (T) (numA.floatValue() > numB.floatValue() ? numA : numB);
    }

    public void display () {
        System.out.println("A: " + numA + " B: " + numB);
    }

}
