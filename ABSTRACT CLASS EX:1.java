abstract class shape
{
public int x, y;
public abstract void printArea();
}
class Rectangle extends shape
{
public void printArea()
{
System.out.println(&quot;Area of Rectangle is &quot; + x * y);
}
}
class Triangle extends shape
{
public void printArea()
{

System.out.println(&quot;Area of Triangle is &quot; + (x * y) / 2);
}
}
class Circle extends shape
{
public void printArea()
{
System.out.println(&quot;Area of Circle is &quot; + (22 * x * x) / 7);
}
}
public class Abstex
{
/**
* @param args the command line arguments
*/
public static void main(String[] args)
{
// TODO code application logic here
Rectangle r = new Rectangle();
r.x = 10;
r.y = 20;
r.printArea();
System.out.println(&quot;-------------------------------------&quot;);
Triangle t = new Triangle();
t.x = 30;
t.y = 35;
t.printArea();
System.out.println(&quot;-------------------------------------&quot;);
Circle c = new Circle();
c.x = 2;
c.printArea();

System.out.println(&quot;-------------------------------------&quot;);
}
