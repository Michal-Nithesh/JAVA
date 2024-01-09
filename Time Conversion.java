Package Code: For Time Conversion
package MyPack;
import java.util.Scanner;
public class TConverter
{
public TConverter()
{

String hr = &quot;Hours&quot;;
String min = &quot;Minutes&quot;;
String sec = &quot;Seconds&quot;;
double time = 0, rate=0;
// Interface
System.out.println(&quot;Welcome to the Time Converter Program \n&quot;);
System.out.println(&quot;Use the following codes to input your Time choices: \n 1 - Hours \n 2 -
Minutes \n 3 - Seconds \n&quot;);
System.out.println(&quot;Please choose the input time format:&quot;);
Scanner in = new Scanner(System.in);
int choice = in.nextInt();
String inType = null;
switch(choice) {
case 1: inType = &quot;Hours &gt;&gt; &quot; ; break;
case 2: inType = &quot;Minutes &gt;&gt; &quot;; break;
case 3: inType = &quot;Seconds &gt;&gt; &quot;; break;
default:
System.out.println(&quot;Please restart the program &amp; enter a number from the list.&quot;);
return;
}

System.out.println(&quot;Please choose the output time format&quot;);
int output = in.nextInt();
System.out.printf(&quot;Now enter the input in &quot; + inType);
double input = in.nextDouble();
if (choice == output)
System.out.println(&quot;Same time format no need to convert&quot;);
if (choice == 1 &amp;&amp; output == 2)
{
double hrs_min_rate = 60;
rate = input * hrs_min_rate;
System.out.printf(input+ &quot; Hours converted to &quot;+rate+&quot; Minutes&quot;);
}
else if (choice == 1 &amp;&amp; output == 3){
double hrs_sec_rate = 3600;
rate = input * hrs_sec_rate;
System.out.printf(input+ &quot; Hours converted to &quot;+rate+&quot; seconds&quot;);
}
if (choice == 2 &amp;&amp; output == 1)
{
double min_hrs_rate = 0.01667;
rate = input * min_hrs_rate;
System.out.printf(input+ &quot; Minutes converted to &quot;+rate+&quot; Hours&quot;);
}
else if (choice == 2 &amp;&amp; output == 3)
{
double min_sec_rate = 60;
rate = input * min_sec_rate;
System.out.printf(input+ &quot; Minutes converted to &quot;+rate+&quot; Seconds&quot;);
}
if (choice == 3 &amp;&amp; output == 1)
{

double sec_hrs_rate = 0.0002778;
rate = input * sec_hrs_rate;
System.out.printf(input+ &quot; Seconds converted to &quot;+rate+&quot; Hours&quot;);
}
else if (choice == 3 &amp;&amp; output == 2)
{
double sec_min_rate = 0.01667;
rate = input * sec_min_rate;
System.out.printf(input+ &quot; Seconds converted to &quot;+rate+&quot; Minutes&quot;); }
System.out.println(&quot;Thank you for using the Time converter&quot;);
}
}
Using Package:
import MyPack.*;
public class Ex{
public static void main(String args[]){
currency c=new currency();
DConverter dc=new DConverter();
TConverter tc=new TConverter();
}
}
