class SelectionSort
{
void sort(int array[])
{
int n = array.length;
for (int i = 0; i &lt; n-1; i++)
{
int min_element = i;
for (int j = i+1; j &lt; n; j++)
if (array[j] &lt; array[min_element])
min_element = j;
int temp = array[min_element];
array[min_element] = array[i];
array[i] = temp;
}
}
void printarrayay(int array[])
{

int n = array.length;
for (int i=0; i&lt;n; ++i)
System.out.print(array[i]+&quot; &quot;);
System.out.println();
}
public static void main(String args[])
{
SelectionSort ob = new SelectionSort();
int array[] = {15, 10, 99, 53, 36};
ob.sort(array);
System.out.println(&quot;Sorted arrayay&quot;);
ob.printarrayay(array);
}
}
