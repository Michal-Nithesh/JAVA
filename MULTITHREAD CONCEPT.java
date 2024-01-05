import java.util.*;
class even implements Runnable {
public int x;
public even(int x) {
this.x = x;
}
public void run() {
System.out.println(&quot;Thread Name:Even Thread and &quot; + x + &quot;is even Number and Square of &quot; + x
+ &quot; is: &quot; + x * x);
}
}
class odd implements Runnable {
public int x;
public odd(int x) {
this.x = x;
}

public void run() {
System.out.println(&quot;Thread Name:ODD Thread and &quot; + x + &quot; is odd number and Cube of &quot; + x +
&quot; is: &quot; + x * x * x);
}
}
class A extends Thread {
public String tname;
public Random r;
public Thread t1, t2;
public A(String s) {
tname = s;
}
public void run() { int num = 0;
r = new Random();
try {
for (int i = 0; i &lt; 50; i++) {
num = r.nextInt(100);
System.out.println(&quot;Main Thread and Generated Number is &quot; + num);
if (num % 2 == 0) {
t1 = new Thread(new even(num));
t1.start();
} else {
t2 = new Thread(new odd(num));
t2.start();
}
Thread.sleep(1000);
System.out.println(&quot;--------------------------------------&quot;);
}
}
catch (Exception ex)
{

System.out.println(ex.getMessage());
}
}
}
public class Mthread
{
public static void main(String[] args)
{
A a = new A(&quot;One&quot;);
a.start();
}
}
