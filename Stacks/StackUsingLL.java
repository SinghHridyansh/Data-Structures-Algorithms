package Stacks;



public class StackUsingLL<T> {
	
	private Node<T> head;
	private int size;

	public StackUsingLL(){
		head=null;
		size=0;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size==0;
	}

	public void push(T elem){
		Node<T> newNode=new Node<T>(elem);
		newNode.next=head;
		head=newNode;
		size++;
	}

	public T top(){
		if (head==null) {
			throw new StackOverflowError();
		}
		return head.data;
	}

	public T pop(){
		if (head==null) {
			throw new StackOverflowError();
		}

		T temp = head.data;
		head= head.next;
		size--;

		return temp;
	}
}
