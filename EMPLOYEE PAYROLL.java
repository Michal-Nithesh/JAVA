import java.util.Scanner;
class Employee
{
int id;
String name, address, mail, mno;
Scanner get = new Scanner(System.in);
Employee()
{
System.out.println(&quot;Enter Name of the Employee:&quot;);
name = get.nextLine();
System.out.println(&quot;Enter mailid of the Employee:&quot;);
mail = get.nextLine();
System.out.println(&quot;Enter Address of the Employee:&quot;);
address = get.nextLine();
System.out.println(&quot;Enter mobile no. of the Employee:&quot;);
mno = get.nextLine();

System.out.println(&quot;Enter id:&quot;);
id = get.nextInt();
}
void display()
{
System.out.println(&quot;Employee Name: &quot;+name);
System.out.println(&quot;ID: &quot;+id);
System.out.println(&quot;Mail Id: &quot;+mail);
System.out.println(&quot;Address: &quot;+address);
System.out.println(&quot;Mobile No.: &quot;+mno);
}
}
class Programmer extends Employee
{
float grosssalary, netsalary;
float bpay;
Programmer()
{
System.out.println(&quot;Enter Basic Pay:&quot;);
bpay = get.nextFloat();
grosssalary=(0.97f*bpay)+(0.10f*bpay)+(0.12f*bpay)+(0.001f*bpay)+bpay;
netsalary= (0.97f*bpay)+(0.10f*bpay)+bpay;
}
void display()
{
System.out.println(&quot;==============================&quot;+&quot;\n&quot;+&quot;Programmer&quot;+&quot;\n&quot;+&quot;===
===========================&quot;+&quot;\n&quot;);
super.display();
System.out.println(&quot;Gross Salary: &quot;+grosssalary);
System.out.println(&quot;Net Salary: &quot;+netsalary);
}

}
class AssistantProfessor extends Employee
{
float grosssalary, netsalary;
float bpay;
AssistantProfessor()
{
System.out.println(&quot;Enter Basic Pay:&quot;);
bpay = get.nextFloat();
grosssalary= (0.97f*bpay)+(0.10f*bpay)+(0.12f*bpay) + (0.001f*bpay)+bpay;
netsalary= (0.97f*bpay)+(0.10f*bpay)+bpay;
}
void display()
{
System.out.println(&quot;==============================&quot;+&quot;\n&quot;+&quot;Assistant
Professor&quot;+&quot;\n&quot;+&quot;==============================&quot;+&quot;\n&quot;);
super.display();
System.out.println(&quot;Gross Salary: &quot;+grosssalary);
System.out.println(&quot;Net Salary: &quot;+netsalary);
}
}
class AssociateProfessor extends Employee
{
float grosssalary, netsalary;
float bpay;
AssociateProfessor()
{
System.out.println(&quot;Enter Basic Pay:&quot;);
bpay = get.nextFloat();
grosssalary=(0.97f*bpay)+(0.10f*bpay)+(0.12f*bpay)+ 0.001f*bpay)+bpay;
netsalary= (0.97f*bpay)+(0.10f*bpay)+bpay;

}
void display()
{
System.out.println(&quot;==============================&quot;+&quot;\n&quot;+&quot;Associate
Professor&quot;+&quot;\n&quot;+&quot;==============================&quot;+&quot;\n&quot;);
super.display();
System.out.println(&quot;Gross Salary: &quot;+grosssalary);
System.out.println(&quot;Net Salary: &quot;+netsalary);
}
}
class Professor extends Employee
{
float grosssalary, netsalary;
float bpay;
Professor()
{
System.out.println(&quot;Enter Basic Pay:&quot;);
bpay = get.nextFloat();
grosssalary=(0.97f*bpay)+(0.10f*bpay)+(0.12f*bpay)+(0.001f*bpay)+bpay;
netsalary= (0.97f*bpay)+(0.10f*bpay)+bpay;
}
void display()
{
System.out.println(&quot;==============================&quot;+&quot;\n&quot;+&quot;Professor&quot;+&quot;\n&quot;+&quot;=====
=========================&quot;+&quot;\n&quot;);
super.display();
System.out.println(&quot;Gross Salary: &quot;+grosssalary);
System.out.println(&quot;Net Salary: &quot;+netsalary);
}
}
class Employees

{
public static void main(String args[])
{
System.out.println(&quot;================================&quot;+&quot;\n&quot;+&quot;Enter Professor
Details&quot;+&quot;\n&quot;+&quot;================================&quot;+&quot;\n&quot;);
Professor ob1 = new Professor();
ob1.display();
AssociateProfessor ob2 = new AssociateProfessor();
System.out.println(&quot;================================&quot;+&quot;\n&quot;+&quot;Enter Associate
Professor Details&quot;+&quot;\n&quot;+&quot;================================&quot;+&quot;\n&quot;);
ob2.display();
AssistantProfessor ob3 = new AssistantProfessor();
System.out.println(&quot;================================&quot;+&quot;\n&quot;+&quot;Enter Assistant
Professor Details&quot;+&quot;\n&quot;+&quot;================================&quot;+&quot;\n&quot;);
ob3.display();
Programmer ob4 = new Programmer();
System.out.println(&quot;================================&quot;+&quot;\n&quot;+&quot;Enter
Programmer Details&quot;+&quot;\n&quot;+&quot;================================&quot;+&quot;\n&quot;);
ob4.display();
}
}
