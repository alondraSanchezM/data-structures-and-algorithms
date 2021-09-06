class StackNQueueTest{
    public static void main (String[] args){
        Stack stack = new Stack(3);
 
        stack.push(1);     
        stack.push(2);      
 
        stack.pop();        
        stack.pop();        
 
        stack.push(3);     
 
        System.out.println("-----------------STACK-----------------");
        System.out.println("The top element is " + stack.peek());
        System.out.println("The stack size is " + stack.size());

        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
 
        stack.pop();       

        //--------------------------------------
        System.out.println("-----------------QUEUE-----------------");
        
        Queue q = new Queue();
    
        q.deQueue();
    
        for(int i = 1; i < 4; i ++) {
            q.enQueue(i);
        }
        q.enQueue(4);
    
        q.peek();
    
        q.deQueue();
    }
}