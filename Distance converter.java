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
System.out.println("Enter a distance in meters, e.g 100: ");
meters = keyboard.nextDouble();

// Check for input greater than zero
while(meters <=0)
{
String error = "Please enter a num greater than zero";
System.out.println(error);
meters = keyboard.nextDouble();
}

// Menu options
System.out.println("\nEnter 1-4 from the menu options: ");
System.out.println("\n1. Convert to kilometers\n2. Convert to inches\n" +
";3. Convert to feet\n4. End");
num = keyboard.nextInt();

// num entered by the user
while(num <= 0 || num >= 5)
{
String invalid = "Invalid option entered. Please use 1 through 4";
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
System.out.println(+ meters + " meters equals to " +km+ " kilometers");
}
public static void dpInches(double meters)
{
double in;
in = meters * 39.37;
System.out.println(meters + " meters equals to " + in + " inches.");
}
public static void dpFeet(double meters)
{
double ft;
ft = meters * 3.281;
System.out.println(meters + " meters equals to " + ft + " feet.");

}
}
