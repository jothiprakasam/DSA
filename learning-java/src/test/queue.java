package test;

//Oueue Implementaion functions
class funcs{
	static Boolean isEmpty(int[] q,int front,int rear) {
		if(front ==-1 && rear==-1)
			return true;
		return false;
	}
	
	static void Enqueue(int[] q,int front,int rear,int val) {
		if(isEmpty(q,front,rear)==true) {
			front++; rear++;
			q[front]=val;
			}
		else {
			q[++rear]=q[front];
		    q[front]=val;
		}
	}
	
	static void Dequeue(int[] q,int front,int rear) {
		q[rear--]=0;
	}
	
	static void  printq(int[] queue) {
		for(int a:queue)
			System.out.print(a+" ");
	}
}

public class queue extends funcs{
	public static void main(String args[]) {
	int n = 5;
	int[] queue= new int[n];
	int front =-1;
	int rear=-1;
	funcs.Enqueue(queue,front,rear,5);
	funcs.printq(queue);
	funcs.Enqueue(queue,front,rear,6);
	funcs.printq(queue);
	//funcs.Dequeue(queue, front, rear);
	//funcs.printq(queue);


}
}