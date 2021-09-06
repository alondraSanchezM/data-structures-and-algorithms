public class Queue {
    int SIZE = 5;
    int items[] = new int[SIZE];
    int head, top;
  
    Queue() {
      head = -1;
      top = -1;
    }
  
    boolean isFull() {
      if (head == 0 && top == SIZE - 1) {
        return true;
      }
      return false;
    }
  
    boolean isEmpty() {
      if (head == -1)
        return true;
      else
        return false;
    }
  
    void enQueue(int element) {
  
      if (isFull()) {
        System.out.println("Queue is full");
      }
      else {
        if (head == -1) {
          head = 0;
        }
  
        top++;
        // insert element at the top
        items[top] = element;
        System.out.println("Insert " + element);
      }
    }
  
    int deQueue() {
      int element;
  
      if (isEmpty()) {
        System.out.println("Queue is empty");
        return (-1);
      }
      else {
        element = items[head];
  
        if (head >= top) {
          head = -1;
          top = -1;
        }
        else {
          // mark next element as the head
          head++;
        }
        System.out.println( element + " Deleted");
        return (element);
      }
    }
  
    void peek() {
      int i;
      if (isEmpty()) {
        System.out.println("Empty Queue");
      }
      else {
        System.out.println("Items -> ");
        for (i = head; i <= top; i++)
          System.out.print(items[i] + "  ");
      }
    }  
}