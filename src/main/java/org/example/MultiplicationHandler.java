package org.example;

class MultiplicationHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void performOperation(Operation operation) {
        if (operation.getOperationType() == OperationType.MULTIPLY) {
            int result = operation.getNumber1() * operation.getNumber2();
            System.out.println("Multiplication Result: " + result);
        } else if (nextHandler != null) {
            nextHandler.performOperation(operation);
        }
    }
}