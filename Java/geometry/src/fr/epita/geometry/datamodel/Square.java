package fr.epita.geometry.datamodel;

public class Square implements Shape{


    private double side;

    // define aggregation between hinh chu nhat va hinh vuong
    private Rectangle rectangle;
    //constructor

    public Square(double side) {
        this.side = side;
        this.rectangle=new Rectangle(side,side);

    }

    // setter and getter

    public double getSide() {
        return this.rectangle.getHeight();
    }

    public void setSide(double side) {
        this.rectangle.setHeight(side);
    }

    //Calculate Perimeter and area ( define rieng do Retangle and Square la common point là cạnh
    public double calculateArea(){

        return this.rectangle.calculateArea();

    }

    public double calculatePerimeter(){

        return this.rectangle.calculatePerimeter();

    }
}
