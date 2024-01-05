class Queue
{
private static int front, rear, capacity;
private static int queue[];
Queue(int size) {
front = rear = 0;
capacity = size;
queue = new int[capacity];
}
// insert an element into the queue
static void queueEnqueue(int item) {
// check if the queue is full
if (capacity == rear) {
System.out.printf(&quot;\nQueue is full\n&quot;);
return;
}
// insert element at the rear
else {
queue[rear] = item;
rear++;
}
return;
}
//remove an element from the queue
static void queueDequeue() {
// check if queue is empty
if (front == rear) {

System.out.printf(&quot;\nQueue is empty\n&quot;);
return;
}
else {
for (int i = 0; i &lt; rear - 1; i++) {
queue[i] = queue[i + 1];
}
// set queue[rear] to 0
if (rear &lt; capacity)
queue[rear] = 0;
// decrement rear
rear--;
}
return;
}
// print queue elements
static void queueDisplay()
{
int i;
if (front == rear) {
System.out.printf(&quot;Queue is Empty\n&quot;);
return;
}
// traverse front to rear and print elements
for (i = front; i &lt; rear; i++) {
System.out.printf(&quot; %d , &quot;, queue[i]);
}
return;
}
// print front of queue
static void queueFront()
{
if (front == rear) {
System.out.printf(&quot;Queue is Empty\n&quot;);
return;
}
System.out.printf(&quot;\nFront Element of the queue: %d&quot;, queue[front]);
return;
}
}

public class QueueArrayImplementation {
public static void main(String[] args) {
Queue q = new Queue(4);
System.out.println(&quot;Initial Queue:&quot;);
q.queueDisplay();
q.queueEnqueue(10);
q.queueEnqueue(30);
q.queueEnqueue(50);
q.queueEnqueue(70);
System.out.println(&quot;Queue after Enqueue Operation:&quot;);
q.queueDisplay();
q.queueFront();
q.queueEnqueue(90);
q.queueDisplay();
q.queueDequeue();
q.queueDequeue();
System.out.printf(&quot;\nQueue after two dequeue operations:&quot;);
q.queueDisplay();
q.queueFront();
}
}
