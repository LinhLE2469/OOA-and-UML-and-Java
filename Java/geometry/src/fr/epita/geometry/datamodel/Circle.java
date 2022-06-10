package fr.epita.geometry.datamodel;

public class Circle implements Shape{

   private double radius;

   //constructor accept require value

    public Circle(double radius) {
        this.radius = radius;
    }

    // generate then getter a setter

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //CalculateAREA and Perimeter

    public double calculateArea(){
        return this.radius* this.radius* Math.PI;


    }
    public double calculatePerimeter(){
        return Math.PI * 2 * this.radius;

    }


}
