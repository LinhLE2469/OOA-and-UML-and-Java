package fr.epita.geometry.datamodel;

import jdk.jshell.spi.SPIResolutionException;

public class Triangle implements Shape{

   private double base;
   private double height;
   private double sideA;
   private double sideB;

   //Constructor
    public Triangle(double base, double height, double sideA, double sideB) {
      this.base = base;
      this.height = height;
      this.sideA = sideA;
      this.sideB = sideB;
    }

   // setter and getter
    public double getBase() {
     return base;
    }

    public void setBase(double base) {
     this.base = base;
    }

    public double getHeight() {
     return height;
    }

    public void setHeight(double height) {
     this.height = height;
    }

    public double getSideA() {
     return sideA;
    }

    public void setSideA(double sideA) {
     this.sideA = sideA;
    }

    public double getSideB() {
     return sideB;
    }

    public void setSideB(double sideB) {
     this.sideB = sideB;
    }

    //Calculate Perimeter and area
    public double calculateArea(){

     return this.base + this.sideA + this.sideB;


    }

    public double calculatePerimeter(){

     return this.base * this.height/2;

    }
}
