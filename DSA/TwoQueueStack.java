public class TwoQueueStack {
    LinearQueue q1 = new LinearQueue(5); 
    LinearQueue q2 = new LinearQueue(5); 
    LinearQueue q3 = new LinearQueue(5);
    void push(int data){
        q2.enqueue(data);
        while (!q1.isEmpty()){
            q2.enqueue(q1.dequeue());
        }

        q3 = q1; 
        q1 = q2; 
        q2 = q3;        
    }

    int pop(){
        return q1.dequeue(); 
    }

    void enqueue(int data){

    }

    int dequeue(){

        return 1; 
    }
}
