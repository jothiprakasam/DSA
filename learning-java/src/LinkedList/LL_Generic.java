package LinkedList;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.NoSuchElementException;

//Driver code
public class LL_Generic{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL<Integer> ll = new LL<>();
		ll.insert(2);
		ll.insert(9);
		//Iterator<Integer> it = ll.iterator();
		for(int num: ll) {
			System.out.println(num);
		}
	}
}

//Linked list custom collection
class LL<T> implements Iterable<T>{
	static class Node<T>{
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
	// iterator
	@Override 
	public Iterator<T> iterator(){
		return new LinkedListIterator<T>(head);
	}
	
}

//iterator for the linked list 
class LinkedListIterator<T> implements Iterator<T>{
	LL.Node<T> current;
	LinkedListIterator(LL.Node<T> head){
		this.current=head;
	}
	@Override
	public boolean hasNext() {
	return current!=null;
	}
	@Override
	public T next() {
		if(!hasNext()) throw new NoSuchElementException();
		T data = current.data;
		current = current.next;
		return data;
	}
}

