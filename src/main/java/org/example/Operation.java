package org.example;

class Operation {
    private final int number1;
    private final int number2;
    private final OperationType operationType;

    public Operation(int number1, int number2, OperationType operationType) {
        this.number1 = number1;
        this.number2 = number2;
        this.operationType = operationType;
    }

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public OperationType getOperationType() {
        return operationType;
    }
}