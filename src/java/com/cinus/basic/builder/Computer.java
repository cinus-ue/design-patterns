package com.cinus.basic.builder;

public class Computer {
    private String memory;
    private String storage;
    private String display;
    private String os;
    private String model;

    private Computer(Builder builder) {
        this.memory = builder.memory;
        this.storage = builder.storage;
        this.display = builder.display;
        this.os = builder.os;
        this.model = builder.model;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("memory='").append(memory).append('\'');
        sb.append(", storage='").append(storage).append('\'');
        sb.append(", display='").append(display).append('\'');
        sb.append(", os='").append(os).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder {

        private String memory;
        private String storage;
        private String display;
        private String os;
        private String model;

        public Builder(String model) {
            if (model == null) {
                throw new IllegalArgumentException("model can not be null");
            }
            this.model = model;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder display(String display) {
            this.display = display;
            return this;
        }

        public Builder os(String os) {
            this.os = os;
            return this;
        }


        public Computer build() {
            return new Computer(this);
        }
    }
}
