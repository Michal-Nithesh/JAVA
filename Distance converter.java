Package Code: For Distance converter
package MyPack;
import java.util.Scanner;

public class DConverter {

public DConverter(){
// Variable declarations
int num;//num entered by user
double meters;

// Scanner object for keyboard input
Scanner keyboard = new Scanner(System.in);

// Ask user for meters
System.out.print(&quot;Enter a distance in meters, e.g 100: &quot;);
meters = keyboard.nextDouble();

// Check for input greater than zero
while(meters &lt;=0)
{
String error = &quot;Please enter a num greater than zero&quot;;
System.out.println(error);
meters = keyboard.nextDouble();
}

// Menu options
System.out.print(&quot;\nEnter 1-4 from the menu options: &quot;);
System.out.println(&quot;\n1. Convert to kilometers\n2. Convert to inches\n&quot; +
&quot;3. Convert to feet\n4. End&quot;);
num = keyboard.nextInt();

// num entered by the user
while(num &lt;=0 || num&gt;=5)
{
String invalid = &quot;Invalid option entered. Please use 1 through 4&quot;;
System.out.println(invalid);
meters = keyboard.nextDouble();
}
switch (num)

{

case 1:
dpKilometers(meters);

break;

case 2:
dpInches(meters);
break;

case 3:
dpFeet(meters);
break;
case 4:
System.exit(0);
}
}
public static void dpKilometers(double meters)
{
double km;
km = meters * .001;
System.out.println(+ meters + &quot; meters equals to &quot; +km+ &quot; kilometers&quot;);
}
public static void dpInches(double meters)
{
double in;
in = meters * 39.37;
System.out.println(meters + &quot; meters equals to &quot; + in + &quot; inches.&quot;);
}
public static void dpFeet(double meters)
{
double ft;
ft = meters * 3.281;
System.out.println(meters + &quot; meters equals to &quot; + ft + &quot; feet.&quot;);

}
}
