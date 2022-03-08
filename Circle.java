//circle class in module 1 assignment

package Inheritance_Programs;

public class Circle extends TwoDShape
{
//toString redefinition
   public final double Pi = 3.14;
   private double radius;
   public Circle(double radius)
   {
      radius = 4;
   }
   public double getArea()
   {
      //formulas and toString for circle area
      
      
      //pi*r^2=circle area
      double r = Math.pow(radius,2);
      double a = Pi*r;
      
      return r;
   }

}