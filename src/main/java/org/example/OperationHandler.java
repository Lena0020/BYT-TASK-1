package org.example;

interface OperationHandler {
    void setNextHandler(OperationHandler nextHandler);
    void performOperation(Operation operation);
}