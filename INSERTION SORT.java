import java.util.Scanner;
public class CodesCracker
{
public static void main(String[] args)
{
int n, i, j, element;
Scanner scan = new Scanner(System.in);
System.out.print(&quot;Enter the Size of Array: &quot;);
n = scan.nextInt();
int[] arr = new int[n];
System.out.print(&quot;Enter &quot; +n+ &quot; Elements: &quot;);
for(i=0; i&lt;n; i++)
arr[i] = scan.nextInt();
for(i=1; i&lt;n; i++)
{
element = arr[i];
for(j=(i-1); j&gt;=0 &amp;&amp; arr[j]&gt;element; j--)
arr[j+1] = arr[j];

arr[j+1] = element;
}
System.out.println(&quot;\nThe new sorted array is: &quot;);
for(i=0; i&lt;n; i++)
System.out.print(arr[i]+ &quot; &quot;);
}
}
