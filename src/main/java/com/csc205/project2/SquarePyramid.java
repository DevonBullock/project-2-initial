package com.csc205.project2;

public class SquarePyramid extends Shape{

    private double basewidth;
    private double height;

    public SquarePyramid() {
        super();
        this.height = 0.0;
        this.basewidth = 0.0;
    }

    public SquarePyramid(double h, double bw) {
        super();
        this.height = h;
        this.basewidth = bw;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBasewidth() {
        return basewidth;
    }

    public void setBasewidth(double basewidth) {
        this.basewidth = basewidth;
    }



    public double slantheight() {
        return (Math.sqrt(Math.pow(height,2)+Math.pow((basewidth/2),2)));
    }


    public double surfaceArea() {
        return ((2*basewidth*slantheight()))+(Math.pow(basewidth,2));
    }

    public double volume() {
        return (( Math.pow(basewidth,2)*height)/3);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SquarePyramid {");
        sb.append("basewidth=").append(basewidth);
        sb.append(", height=").append(height);
        sb.append(", slant height=").append(slantheight());
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
