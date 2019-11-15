package edu.wit.cs.comp1050;

//TODO: document this class
public class TriangleObject extends GeometricObject {
   
   //Create variables: side1 side2, side3


   /**
    * Constructs a triangle given three sides
    * 
    * @param side1 length of side1
    * @param side2 length of side2
    * @param side3 length of side3
    */   
   public TriangleObject(double side1, double side2, double side3) {
  //set the sides to given values, only if they are greater than 0. 

   }
   
   /**
    * Constructs a triangle
    */
   public TriangleObject() {
        //set the color and filled value to default
   }

   /** If given a valid length, set the value for side
    * 
    * @param side1
    */
     public void setSide1(double side1) {

      }

     /** If given a valid length, set the value for side
      * 
      * @param side2
      */
     public void setSide2(double side2) {

      }
   
     /** If given a valid length, set the value for side
      * 
      * @param side3
      */
     public void setSide3(double side3) {

      }

      
   public double getSide1() {
      return 0.;
   }

   public double getSide2() {
      return 0.;
   }

   public double getSide3() {
      return 0.;
   }

   @Override 
   // Override method findArea in GeometricObject 
   public double getArea() {
      return 0.;
   }

   @Override 
   // Override method findPerimeter in GeometricObject
   public double getPerimeter() {
      return 0.;

   }

   //Add another method here. 
}
   
   
