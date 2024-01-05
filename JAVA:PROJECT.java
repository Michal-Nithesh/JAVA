Package Code: For Currency converter
package MyPack1; // creating a package “MyPack1”
import java.util.Scanner;
public class currency
{
public currency()
{
char us_dollar_sym = 36;
char rupee_sym = 163;
char yen_sym = 165;
char euro_sym = 8364;
String us_dollar = &quot;Dollars&quot;;
String rupee = &quot;Rupees&quot;;
String yen = &quot;Yen&quot;;
String euro = &quot;Euros&quot;;
double rate = 0;
// Interface
System.out.println(&quot;Welcome to the Currency Converter Program \n&quot;);
System.out.println(&quot;Use the following codes to input your currency choices: \n 1 - US
dollars \n 2 - Euros \n 3 - Indian Rupees \n 4 - Japanese Yen \n&quot;);
System.out.println(&quot;Please choose the input currency:&quot;);
Scanner in = new Scanner(System.in);
int choice = in.nextInt();

String inType = null;
switch(choice) {
case 1: inType = &quot;US Dollars &gt;&gt; &quot; + us_dollar_sym; break;

case 2: inType = &quot;Euros &gt;&gt; &quot; + euro_sym; break;
case 3: inType = &quot;Indian Rupees &gt;&gt; &quot; + rupee_sym; break;
case 4: inType = &quot;Japanese Yen &gt;&gt; &quot; + yen_sym; break;
default:
System.out.println(&quot;Please restart the program &amp; enter a number from the list.&quot;);
return;
}

System.out.println(&quot;Please choose the output currency&quot;);
int output = in.nextInt();

System.out.printf(&quot;Now enter the input in &quot; + inType);
double input = in.nextDouble();

if (choice == output)
System.out.println(&quot;Same currency no need to convert&quot;);

if (choice == 1 &amp;&amp; output == 2)
{
double dollar_euro_rate = 83;
rate = input * dollar_euro_rate;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + dollar_euro_rate + &quot;
Dollars to %s =
%.2f\n&quot;, (char)us_dollar_sym, euro, rate);
}
else if (choice == 1 &amp;&amp; output == 3){
double dollar_rupee_rate = 66.82;
rate = input * dollar_rupee_rate;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + dollar_rupee_rate + &quot;
Dollars to %s
= %.2f\n&quot;, (char)us_dollar_sym, rupee, rate);

}
else if (choice == 1 &amp;&amp; output == 4){
double dollar_yen_rate = 109.12;
rate = input * dollar_yen_rate;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + dollar_yen_rate + &quot; Dollars
to %s =
%.2f\n&quot;, (char)us_dollar_sym, yen, rate);
}
if (choice == 2 &amp;&amp; output == 1)
{
double euro_dollar_rate = 1.20;
rate = input * euro_dollar_rate;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + euro_dollar_rate + &quot; Euros
to %s =
%.2f\n&quot;, (char)euro_sym, us_dollar, rate);
}
else if (choice == 2 &amp;&amp; output == 3)
{
double euro_rupee_rate = 80.03;
rate = input * euro_rupee_rate;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + euro_rupee_rate + &quot; Euros
to %s =
%.2f\n&quot;, (char)euro_sym, rupee, rate);
}
else if (choice == 2 &amp;&amp; output == 4)
{
double euro_yen_rate = 130.69;
rate = input * euro_yen_rate;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + euro_yen_rate + &quot; Euros to
%s =
%.2f\n&quot;, (char)euro_sym, yen, rate);

}
if (choice == 3 &amp;&amp; output == 1)
{
double rupee_dollar_rate = 0.015;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + rupee_dollar_rate + &quot;
Pounds to %s
= %.2f\n&quot;, (char)rupee_sym, us_dollar, rate);
}
else if (choice == 3 &amp;&amp; output == 2)
{
double rupee_euro_rate = 0.012;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + rupee_euro_rate + &quot; Pounds
to %s =
%.2f\n&quot;, (char)rupee_sym, euro, rate);
}
else if (choice == 3 &amp;&amp; output == 4)
{
double rupee_yen_rate = 1.641;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + rupee_yen_rate + &quot; Pounds
to %s =
%.2f\n&quot;, (char)rupee_sym, yen, rate);
}
if (choice == 4 &amp;&amp; output == 1)
{
double yen_dollar_rate = 0.0092;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + yen_dollar_rate + &quot; Yen to
%s =
%.2f\n&quot;, (char)yen_sym, us_dollar, rate);
}
else if (choice == 4 &amp;&amp; output == 2)
{

double yen_euro_rate = 0.0077;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + yen_euro_rate + &quot; Yen to
%s =
%.2f\n&quot;, (char)yen_sym, euro, rate);
}
else if (choice == 4 &amp;&amp; output == 3)
{
double yen_rupee_rate = 0.61;
System.out.printf( &quot;%s&quot; + input + &quot; at a conversion rate of &quot; + yen_rupee_rate + &quot; Yen to
%s =
%.2f\n&quot;, (char)yen_sym, rupee, rate);
}
System.out.println(&quot;Thank you for using the currency converter&quot;);
}
}

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
