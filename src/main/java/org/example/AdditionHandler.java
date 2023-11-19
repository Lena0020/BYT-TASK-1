package org.example;

class AdditionHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void performOperation(Operation operation) {
        if (operation.getOperationType() == OperationType.ADD) {
            int result = operation.getNumber1() + operation.getNumber2();
            System.out.println("Addition Result: " + result);
        } else if (nextHandler != null) {
            nextHandler.performOperation(operation);
        }
    }
}
