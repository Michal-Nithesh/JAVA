import java.io.*;
import java.util.*;
abstract class Shape
{
abstract void numberOfSides();
}
class Trapezoid extends Shape
{
void numberOfSides()
{
System.out.println(&quot; Trapezoidal has four sides&quot;);
}
}
class Triangle extends Shape
{
void numberOfSides()
{
System.out.println(&quot;Triangle has three sides&quot;);

}
}
class Hexagon extends Shape
{
void numberOfSides()
{
System.out.println(&quot;Hexagon has six sides&quot;);
}
}
class ShapeDemo
{
public static void main(String args[ ])
{
Trapezoid t=new Trapezoid();
Triangle r=new Triangle();
Hexagon h=new Hexagon();
Shape s;
s=t;
s.numberOfSides();
s=r;
s.numberOfSides();
s=h;
s.numberOfSides();
}
}
