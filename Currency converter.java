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
