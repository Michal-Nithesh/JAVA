import java.util.Scanner;
class Main {
int binarySearch(int array[], int element, int low, int high) {
while (low &lt;= high) {
int mid = low + (high - low) / 2;
if (array[mid] == element)
return mid;
if (array[mid] &lt; element)
low = mid + 1;
else
high = mid - 1;
}
return -1;
}
public static void main(String args[])
{
Main obj = new Main();

int[] array = { 3, 4, 5, 6, 7, 8, 9 };
int n = array.length;
Scanner input = new Scanner(System.in);
System.out.println(&quot;Enter element to be searched:&quot;);
int element = input.nextInt();
input.close();
int result = obj.binarySearch(array, element, 0, n - 1);
if (result == -1)
System.out.println(&quot;Not found&quot;);
else
System.out.println(&quot;Element found at index &quot; + result);
}
}
