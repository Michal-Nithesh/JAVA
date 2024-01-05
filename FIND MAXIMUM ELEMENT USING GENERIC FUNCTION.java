public class MainClass
{
// determines the largest of three Comparable objects
public static &lt;T extends Comparable&lt;T&gt;&gt; T maximum(T x, T y, T z) {
T max = x; // assume x is initially the largest
if (y.compareTo(max) &gt; 0)
max = y; // y is the largest so far
if (z.compareTo(max) &gt; 0)
max = z; // z is the largest
return max; // returns the largest object
} // end method maximum
public static void main(String args[])
{
System.out.printf(&quot;Maximum of %d, %d and %d is %d\n\n&quot;, 3, 4, 5, maximum(3, 4, 5));
System.out.printf(&quot;Maximum of %.1f, %.1f and %.1f is %.1f\n\n&quot;, 6.6, 8.8, 7.7,
maximum(6.6,
8.8, 7.7));
System.out.printf(&quot;Maximum of %s, %s and %s is %s\n&quot;, &quot;pear&quot;, &quot;apple&quot;, &quot;orange&quot;,
maximum(

&quot;pear&quot;, &quot;apple&quot;, &quot;orange&quot;));
}
}
