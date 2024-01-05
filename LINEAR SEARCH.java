import java.util.Scanner;
class LinearSearchExample2
{
public static void main(String args[])
{
int c, n, search, array[];
Scanner in = new Scanner(System.in);
System.out.println(&quot;Enter number of elements&quot;);
n = in.nextInt();
array = new int[n];
System.out.println(&quot;Enter those &quot; + n + &quot; elements&quot;);
for (c = 0; c &lt; n; c++)
array[c] = in.nextInt();
System.out.println(&quot;Enter value to find&quot;);
search = in.nextInt();
for (c = 0; c &lt; n; c++)

{
if (array[c] == search) /* Searching element is present */
{
System.out.println(search + &quot; is present at location &quot; + (c + 1) + &quot;.&quot;);
break;
}
}
if (c == n) /* Element to search isn&#39;t present */
System.out.println(search + &quot; isn&#39;t present in array.&quot;);
}
}
