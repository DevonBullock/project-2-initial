package com.csc205.project2;

public class Pyramid extends Shape{

    private double length;
    private double width;
    private double height;
    private double slantheight;

    public Pyramid() {
        super();
        this.height = 0.0;
        this.length = 0.0;
        this.width = 0.0;
        this.slantheight = 0.0;
    }

    public Pyramid(double h, double l, double w, double sh) {
        super();
        this.height = h;
        this.length = l;
        this.width = w;
        this.slantheight = sh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getSlantheight() {
        return slantheight;
    }

    public void setSlantheight(double slantheight) {
        this.slantheight = slantheight;
    }

    public double surfaceArea() {
        return ((1/2*((2*length)+(2*width))*slantheight)+((1/2*((2*length)+(2*width))*slantheight)+(length*width)));
    }

    public double volume() {
        return ((length*width*height)/3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("length=").append(length);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", slant height=").append(slantheight);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
