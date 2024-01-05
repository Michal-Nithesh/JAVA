import java.util.*;
//Stack class
class Stack {
int top;
int maxsize = 5;
int[] stack_arry = new int[maxsize];
Stack()
{ initially top = -1
top = -1;
}
boolean isEmpty(){
return (top &lt; 0);
}
boolean push (int val)
{
if(top == maxsize-1)
{
System.out.println(&quot;Stack Overflow !!&quot;);
return false;
}
else {
top++;

stack_arry[top]=val;
return true;
}
}
boolean pop () { //pop () method
if (top == -1) {
System.out.println(&quot;Stack Underflow !!&quot;);
return false;
}
else {
System.out.println(&quot;\nItem popped: &quot; + stack_arry[top--]);
return true;
}
}
void display () { //print the stack elements
System.out.println(&quot;Printing stack elements .....&quot;);
for(int i = top; i&gt;=0;i--) {
System.out.print(stack_arry[i] + &quot; &quot;);
}
}
}
public class Main {
public static void main(String[] args) {
//define a stack object
Stack stck = new Stack();
System.out.println(&quot;Initial Stack Empty : &quot; + stck.isEmpty());
//push elements
stck.push(10);
stck.push(20);
stck.push(30);
stck.push(40);
System.out.println(&quot;After Push Operation...&quot;);
//print the elements
stck.display();
//pop two elements from stack
stck.pop();
stck.pop();
System.out.println(&quot;After Pop Operation...&quot;);
stck.display();
}
}
