import java.io.*;
interface Area
{
final static float pi=3.14F;
float compute(float x, float y);
}
class Rectangle implements Area
{
public float compute(float x, float y)
{
return(x*y);
}
}
class Circle implements Area
{
public float compute(float x, float y)
{
return(pi*x*x);

}
}
class inter
{
public static void main(String args[])
{
Rectangle rect=new Rectangle(); // Object to class ‘Rectangle’
Circle cir=new Circle(); // Object to class ‘Circle’
System.out.println(&quot;Area of Rectangle =&quot;+ rect.compute(10,20));
System.out.println(&quot;Area of Circle =&quot;+ cir.compute(10,0));
}
}
