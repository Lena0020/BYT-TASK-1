package org.example;

class DivisionHandler implements OperationHandler {
    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        // division is the last operation, so no next handler is set
    }

    @Override
    public void performOperation(Operation operation) {
        if (operation.getOperationType() == OperationType.DIVIDE) {
            if (operation.getNumber2() != 0) {
                double result = (double) operation.getNumber1() / operation.getNumber2();
                System.out.println("Division Result: " + result);
            } else {
                System.out.println("Cannot divide by zero!");
            }
        }
    }
}