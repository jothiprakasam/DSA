package LinkedList;
//import java.util.Iterator;
class Linkedlist {
	Node head;
	Linkedlist(){
		this.head=null;
	}
	void display() {
		Node curr = head;
		while(curr!=null) {
			
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	void insert(int value) {
		Node newNode = new Node(value);
		if(head==null)
			head=newNode;
		else {
			Node curr = head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next = newNode;
		}
	}
}
class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}
public class Linked_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
		ll.insert(0);
		ll.insert(1);
		ll.insert(2);
		ll.insert(3);
		
		ll.display();
	}

}
