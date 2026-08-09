package LinkedList;

import java.util.Iterator;
public class LL_Generic{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> ll = new LL<>();
		ll.insert(2);
		ll.insert(9);
		System.out.println(ll.getHead());
	}

}

class LL<T>{
	class Node<T>{
		T data;
		Node<T> next;
		Node(T data){
			this.data=data;
			this.next=null;
		}
	}
	public Node<T> head;
	LL(){
		this.head=null;
	}
	public T getHead() {
		return head.data;
	}
	void insert(T value){
		Node<T> newNode = new Node<>(value);
		if(head==null)
			head=newNode;
		else {
			Node<T> curr = head;
			while(curr.next!=null) {
				curr=curr.next;
			}
			curr.next=newNode;
		}
	}
}