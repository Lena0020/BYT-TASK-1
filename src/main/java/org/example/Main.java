package org.example;

public class Main {
    public static void main(String[] args) {
        // create handlers
        AdditionHandler additionHandler = new AdditionHandler();
        SubtractionHandler subtractionHandler = new SubtractionHandler();
        MultiplicationHandler multiplicationHandler = new MultiplicationHandler();
        DivisionHandler divisionHandler = new DivisionHandler();

        // set up the chain of responsibility
        additionHandler.setNextHandler(subtractionHandler);
        subtractionHandler.setNextHandler(multiplicationHandler);
        multiplicationHandler.setNextHandler(divisionHandler);

        // create an operation
        Operation operation = new Operation(10, 5, OperationType.MULTIPLY);

        // perform the operation using the chain of responsibility
        additionHandler.performOperation(operation);
    }
}