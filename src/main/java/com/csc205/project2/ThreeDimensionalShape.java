package com.csc205.project2;

public interface ThreeDimensionalShape {
    public default double surfaceArea() {
        return 0.0;
    }
    public default double volume() {
        return 0.0;
    }
}
