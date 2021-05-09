package com.cinus.basic.Interpreter;

public class InterpretResult<T> {

    public InterpretResult(ResultType type, T value) {
        this.type = type;
        this.value = value;
    }

    private ResultType type;

    private T value;

    public ResultType getType() {
        return type;
    }

    public void setType(ResultType type) {
        this.type = type;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InterpretResult{");
        sb.append("type=").append(type);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
