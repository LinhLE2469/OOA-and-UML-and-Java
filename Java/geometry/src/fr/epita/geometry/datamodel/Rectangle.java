package fr.epita.geometry.datamodel;

public class Rectangle implements Shape{
    private double width;
    private double height;

  // constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // getter and setter


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculatePerimeter() {
        return 0;
    }

    @Override
    public double calculateArea() {
        return 0;
    }
}
