package Linked_List_1;

import java.util.Scanner;

public class LinkedListUse {

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
		// Node<Integer> n1=new Node<>(10);
		// System.out.println(n1.data);
		// System.out.println(n1.next);
		//Node<Integer> head=createLinkedList();
		Node<Integer> head=takeInput2();
		printNode(head);
		increment(head);
		printNode(head);
		head=insert(head, 69, 0);
		printNode(head);
	}

	public static void printNode(Node<Integer> head){

		while (head!=null) {
			System.out.print(head.data+" ");
			head=head.next;

		}
		System.out.println();
		// System.out.println(head.data);
		// System.out.println(head.next.data);
		// System.out.println(head.next.next.data);
	}
	public static void increment(Node<Integer> head){
		Node<Integer> temp=head;
		while (temp!=null) {
			temp.data++;
			temp=temp.next;
		}
	}

	// public static Node<Integer> takeInput(){
	// 	Scanner s =new Scanner(System.in);
	// 	int data=s.nextInt();
	// 	Node<Integer> head=null;
	// 	while (data != -1) {
	// 		Node<Integer> currentNode=new Node<Integer>(data);
	// 		if (head==null) {
	// 			//Make this node as head node
	// 			head=currentNode;
	// 		} else {
	// 			Node<Integer> tail=head;
	// 			while (tail.next !=null) {
	// 				tail=tail.next;
	// 			}
	// 			//Now tail will refer to last Node
	// 			//Connect current node after last node
	// 			tail.next=currentNode;
	// 		}

	// 		data =s.nextInt();
	// 	}
	// 	s.close();
	// 	return head;
	// }

	public static Node<Integer> takeInput2(){
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
}
