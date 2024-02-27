package Linked_List_2;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail;

	DoubleNode(){

	}

	DoubleNode(Node<Integer> head,Node<Integer> tail){
		this.head=head;
		this.tail=tail;
	}
}

public class printRecursively {
	
	public static Node<Integer> createLinkedList(){

		Node<Integer> n1=new Node<Integer>(10);
		Node<Integer> n2=new Node<Integer>(20);
		Node<Integer> n3=new Node<Integer>(30);
		Node<Integer> n4=new Node<Integer>(40); 
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		return n1;

	}
	public static void main(String[] args) {
		
		Node<Integer> head1=takeInput2();
		//printNode(head);
		//printR(head1);
		System.out.println();
		Node<Integer> head2=takeInput2();
		Node<Integer> newHead=MergeLL(head1, head2);
		System.out.println();
		printR(newHead);
		//printR(insertR(head, 69, 7));
		//System.out.println(DeleteR(head, 2));
		//Node<Integer> result=DeleteR(head, 3);
		//printR(result);
		// Node<Integer> result=ReverseR(head);
		//printR(result);
		// DoubleNode ans= ReverseRBetter(head);
		// printR(ans.head);
		//Node<Integer> result=ReverseRBetter2(head);
		//printR(result);
		// increment(head);
		// printNode(head);
		// head=insert(head, 69, 0);
		// printNode(head);
	}

	public static void printR(Node<Integer> head){

		if (head==null) {
			return;
		}
		System.out.print(head.data+" ");
		printR(head.next);

	}

	public static void printNode(Node<Integer> head){

		while (head!=null) {
			System.out.print(head.data+" ");
			head=head.next;

		}
		System.out.println();
	
	}

	public static void increment(Node<Integer> head){
		Node<Integer> temp=head;
		while (temp!=null) {
			temp.data++;
			temp=temp.next;
		}
	}

	public static Node<Integer> takeInput2(){
		System.out.println("Enter the Linked List: ");
		Scanner s =new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null,tail=null;
		while (data != -1) {
			Node<Integer> currentNode=new Node<Integer>(data);
			if (head==null) {
				//Make this node as head node
				head=currentNode;
				tail=currentNode;
			} else {
				// Node<Integer> tail=head;
				// while (tail.next !=null) {
				// 	tail=tail.next;
				//}
				//Now tail will refer to last Node
				//Connect current node after last node
				
				tail.next=currentNode;
				tail=currentNode;//tail=tail.next;
			}

			data =s.nextInt();
		}
		s.close();
		return head;
	}

	public static Node<Integer> insert(Node<Integer> head,int elem,int pos){
		Node<Integer> nodeToBeInserted=new Node<Integer>(elem);
		if (pos==0) {
			nodeToBeInserted.next=head;
			//head=nodeToBeInserted;
			return nodeToBeInserted;
		}else{

			int count=0;
			Node<Integer> prev=head;
			while (count<pos-1 && prev!=null) {
				count++;
				prev=prev.next;
			}
			if (prev!=null) {
				
				nodeToBeInserted.next=prev.next;
				prev.next=nodeToBeInserted;
			}
			return head;
		}
	}

	public static Node<Integer> insertR(Node<Integer> head,int elem,int pos){

		if (head==null && pos>0) {
			return head;
		}
		if (pos==0) {
			Node<Integer> newNode=new Node<Integer>(elem);
			newNode.next=head;
			return newNode; 
		}else{

			Node<Integer> smallerHead=insertR(head.next, elem, pos-1);
			head.next=smallerHead;
			return head;
		}

	}

	public static int returnLength(Node<Integer> head){
		int length = 0;
		while (head != null) {
			length++;
			head = head.next;
		}

		return length;

	}

	public static Node<Integer> DeleteR(Node<Integer> head,int pos){

		if (pos>=returnLength(head)) {
			return head;
		}
		if (pos==0) {
			return head.next;
		}else{
			head.next=DeleteR(head.next, pos-1);
			return head;
		}

	}

	public static Node<Integer> ReverseR(Node<Integer> head){
		if (head==null || head.next==null) {
			return head;
		}
		Node<Integer> smallHead=ReverseR(head.next);
		Node<Integer> tail=smallHead;
		while (tail.next != null) {
			tail=tail.next;
		}
		tail.next=head;
		head.next=null;

		return smallHead;
		
	}

	public static DoubleNode ReverseRBetter(Node<Integer> head){

		DoubleNode ans;
		if (head==null || head.next==null) {
			ans = new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}

		DoubleNode smallAns=ReverseRBetter(head.next);
		smallAns.tail.next=head;
		head.next=null;

		ans=new DoubleNode();
		ans.head=smallAns.head;
		ans.tail=head;

		return ans;
	}

	public static Node<Integer> ReverseRBetter2(Node<Integer> head){

		if (head==null || head.next==null) {
			return head;
		}
		Node<Integer> smallHead=ReverseRBetter2(head.next);
		Node<Integer> reversedTail=head.next;
		reversedTail.next=head;
		head.next=null;
		return smallHead;
	}

	public static Node<Integer> MergeLL(Node<Integer> head1, Node<Integer> head2){

		if (head1==null) {
			return head2;
		}
		if (head2==null) {
			return head1;
		}

		Node<Integer> t1=head1,t2=head2;
		Node<Integer> head=null,tail=null;
		
		if (t1.data<=t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}else{
			head=t2;
			tail=t2;
			t2=t2.next;
		}

		while (t1 != null && t2 != null) {
			if (t1.data<=t2.data) {
				tail.next=t1;
				tail=t2;
				t1=t1.next;
			}else{
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}

		if (t1 !=null) {
			tail.next=t1;
		} else {
			tail.next=t2;
		}
		
		return head;
		
	}
}
