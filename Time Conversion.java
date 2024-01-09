Package Code: For Time Conversion
package MyPack;
import java.util.Scanner;
public class TConverter
{
public TConverter()
{

String hr = "Hours";
String min = "Minutes";
String sec = "Seconds";
double time = 0, rate=0;
// Interface
System.out.println("Welcome to the Time Converter Program \n");
System.out.println("Use the following codes to input your Time choices: \n 1 - Hours \n 2 -
Minutes \n 3 - Seconds \n");
System.out.println("Please choose the input time format:");
Scanner in = new Scanner(System.in);
int choice = in.nextInt();
String inType = null;
switch(choice) {
case 1: inType = "Hours >>" ; break;
case 2: inType = "Minutes >>" ; break;
case 3: inType = "Seconds >>" ; break;
default:
System.out.println("Please restart the program &amp; enter a number from the list.");
return;
}

System.out.println("Please choose the output time format");
int output = in.nextInt();
System.out.println("Now enter the input in " + inType);
double input = in.nextDouble();
if (choice == output)
System.out.println("Same time format no need to convert");
if (choice == 1 && output == 2)
{
double hrs_min_rate = 60;
rate = input * hrs_min_rate;
System.out.println(input+ " Hours converted to "+rate+" Minutes");
}
else if (choice == 1 && output == 3){
double hrs_sec_rate = 3600;
rate = input * hrs_sec_rate;
System.out.println(input+ " Hours converted to "+rate+" seconds");
}
if (choice == 2 && output == 1)
{
double min_hrs_rate = 0.01667;
rate = input * min_hrs_rate;
System.out.println(input+ " Minutes converted to "+rate+" Hours";);
}
else if (choice == 2 && output == 3)
{
double min_sec_rate = 60;
rate = input * min_sec_rate;
System.out.println(input+ " Minutes converted to "+rate+" Seconds");
}
if (choice == 3 && output == 1)
{

double sec_hrs_rate = 0.0002778;
rate = input * sec_hrs_rate;
System.out.println(input+ " Seconds converted to "+rate+" Hours");
}
else if (choice == 3 && output == 2)
{
double sec_min_rate = 0.01667;
rate = input * sec_min_rate;
System.out.println(input+ " Seconds converted to "+rate+" Minutes");
}
System.out.println("Thank you for using the Time converter");
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
