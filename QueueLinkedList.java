
package QueueLinkedLIst;

public class QueueLinkedList {
   
    node front;
    node rear;
    
    class node{
        int data;
        node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
        
    }
    
  
        
    
    
    public void enqueue(int data){
        
        node n=new node(data);
        
        
        if(rear==null){
            front=rear=n;
        }
        
        rear.next=n;
        rear=n;
    }
    
    
    public void dequeue(){
        node n1;
        
        if(front==null){
            System.out.println("List is Empty");
        }
        
        n1=front;
        front=front.next;
        
    }
    
    boolean isempty(){
        return front==null;
    }
    
    
     public void display(){
            node M=front;
            
           while(M!=null){
               System.out.println(M.data+"");
               M=M.next;
               
           }
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
    
    
    

    public static void main(String[] args) {
        
        QueueLinkedList qlist=new QueueLinkedList();
        
        qlist.enqueue(2);
        
        qlist.enqueue(5);
        
        qlist.enqueue(9);
        
        qlist.enqueue(51);
        
        qlist.display();
        
        
        qlist.dequeue();
        qlist.display();
        
        qlist.isempty();
        qlist.display();
    }
    
}
