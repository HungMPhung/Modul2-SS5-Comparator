package com.codegym;

public class Shape {
    private String color = "blue";
    private boolean fill = true;

    public Shape() {
    }

    public Shape(String color, boolean fill){
        this.color = color;
        this.fill = fill;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString(){
        return "A Shape a color of " + getColor() +  " and " + (isFill()? "filled" : "not filled");
    }
}
