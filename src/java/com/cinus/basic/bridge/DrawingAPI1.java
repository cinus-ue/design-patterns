package com.cinus.basic.bridge;

public class DrawingAPI1 implements DrawingAPI {
    @Override
    public void drawCircle(final double x, final double y, final double radius) {
        System.out.printf("API1.circle at %f:%f radius %f%n", x, y, radius);
    }
}