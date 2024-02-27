package BinaryTrees1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeUse {
	
	
	public static void printTree(BinaryTreeNode<Integer> root){
		//To-do
		//print the root's data
		//call printTree recursively on the left side and then on the right side
		if (root==null) {
			return;
		}
		
		System.out.println(root.data);
		printTree(root.left);
		printTree(root.right);
	}
	
	public static void printTreeBetter(BinaryTreeNode<Integer> root){
		if (root==null) {
			return;
		}

		System.out.print(root.data+":");
		if (root.left!=null) {
			System.out.print("L"+root.left.data);
		}
		if (root.left!=null && root.right!=null) {
			System.out.print(",");
		}
		if (root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTreeBetter(root.left);
		printTreeBetter(root.right);
	}
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("Enter Root data :");
		Scanner sc =new Scanner(System.in);
		int rootData=sc.nextInt();

		if (rootData==-1) {
			sc.close();	
			return null;
		}

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeTreeInput();
		BinaryTreeNode<Integer> rightChild=takeTreeInput();
		root.left=leftChild;
		root.right=rightChild;
		
		sc.close();
		return root;
	}

	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if (isRoot) {
			System.out.println("Enter Root data :");
		} else {
			if (isLeft) {
				System.out.println("Enter left child of "+parentData);
			}else{
				System.out.println("Enter right child of "+parentData);
			}
		}
		Scanner sc =new Scanner(System.in);
		int rootData=sc.nextInt();

		if (rootData==-1) {
			sc.close();
			return null;
		}

		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightChild=takeTreeInputBetter(false,rootData,false);
		root.left=leftChild;
		root.right=rightChild;
		sc.close();
		return root;
	}

	public static BinaryTreeNode<Integer> takeTreeInputLevelWise(){
		//take root input
		//insert it into the queue
		//while queue is not empty 
		//--take the first element out
		//--ask for it's left
		//----if left!=1
		//----attach it to this element on the left side & push left to the queue(push element's node inside the )
		//--Do the same thing for it's right side as well
		//return root

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter root data:");
		int rootData=sc.nextInt();

		if (rootData==-1) {
			sc.close();
			return null;
		}

		BinaryTreeNode<Integer> root =new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
		pendingChildren.add(root);

		while (!pendingChildren.isEmpty()) {
			BinaryTreeNode<Integer> front=pendingChildren.poll();
			System.out.println("Enter left child of:"+front.data);
			int left=sc.nextInt();
			if (left!=-1) {
				BinaryTreeNode<Integer> leftChild =new BinaryTreeNode<Integer>(left);
				front.left=leftChild;
				pendingChildren.add(leftChild);
			}

			System.out.println("Enter right child of:"+front.data);
			int right=sc.nextInt();
			if (right!=-1) {
				BinaryTreeNode<Integer> rightChild =new BinaryTreeNode<Integer>(right);
				front.right=rightChild;
				pendingChildren.add(rightChild);
			}
		}
		sc.close();
		return root;

	}

	public static void printTreeLevelwise(BinaryTreeNode<Integer> root){
		//Add root to the queue
		//While queue is not wmpty
			//Take out first node -> a
			//Print for a
			//Check a's children
				//if they are not null then add to the queue
		if (root == null) {
			return;
		}		

		Queue<BinaryTreeNode<Integer>> MainQueue= new LinkedList<BinaryTreeNode<Integer>>();
		MainQueue.add(root);

		while (!MainQueue.isEmpty()) {
			BinaryTreeNode<Integer> firstNode=MainQueue.poll();
			System.out.print(firstNode.data+":");

			if (firstNode.left!=null) {
				System.out.print("L:"+firstNode.left.data+",");
				MainQueue.add(firstNode.left);
			}

			if (firstNode.right!=null) {
				System.out.print("R:"+firstNode.right.data);
				MainQueue.add(firstNode.right);
			}

			System.out.println();

		}
	}

	public static int numNodes(BinaryTreeNode<Integer> root){
		if (root==null) {
			return 0;
		}

		int leftNodeCount=numNodes(root.left);
		int rightNodeCount=numNodes(root.right);

		return 1+leftNodeCount+rightNodeCount;
	}

	public static int TreeSum(BinaryTreeNode<Integer> root){
		//To-do
		//print the root's data
		//call printTree recursively on the left side and then on the right side
		if (root==null) {
			return 0;
		}
		


		return root.data+TreeSum(root.left)+TreeSum(root.right);
	}
	
	public static int LargestOfAll(BinaryTreeNode<Integer> root){

		if (root==null) {
			return -1;
		}

		int largestLeft=LargestOfAll(root.left);
		int largestrigth=LargestOfAll(root.right);

		return Math.max(root.data, Math.max(largestLeft, largestrigth));

	}

	public static int LargerThanX(BinaryTreeNode<Integer> root,int X){
		if (root==null) {
			return 0;
		}

		int count =0;

		if (root.data>X) {
			count++;
		}

		count+=LargerThanX(root.left, X);
		count+=LargerThanX(root.right, X);

		return count;
	}
	public static int height(BinaryTreeNode<Integer> root) {
		//Your code goes here
		if (root==null) {
			return 0;
		}

		int heightRight=height(root.left);
		int heightLeft=height(root.right);

		if (heightRight>heightLeft) {
			return 1+heightRight;
		}else{
			return 1+heightLeft;
		}

	}

	public static int numberOfLeaves(BinaryTreeNode<Integer> root){
		if (root.data==null) {
			return 0;
		}
		if (root.right==null && root.left==null ) {
			return 1;
		}

		return numberOfLeaves(root.right)+numberOfLeaves(root.left);
	}

	public static void elementsAtK(BinaryTreeNode<Integer> root,int k){
		if (root==null) {
			return;
		}

		if (k==0) {
			System.out.print(root.data+" ");
			return;
		}

		elementsAtK(root.right, k-1);
		elementsAtK(root.left, k-1);

	}

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if (root==null) {
			return false;
		}

		if (root.data==x) {
			return true;
		}

		boolean leftS=isNodePresent(root.left, x);
		boolean rightS=isNodePresent(root.right, x);

		return leftS||rightS;
	}
	public static void main(String[] args) {
		// BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(1);//intializing and asssigning the value to the root node.
		
		// BinaryTreeNode<Integer> rootLeft=new BinaryTreeNode<Integer>(2);//intializing and assigning the value to the left child node of the root. 
		// BinaryTreeNode<Integer> rootright=new BinaryTreeNode<Integer>(3);//intializing and assigning the value to the right child node of the root.

		// root.left=rootLeft;//making the connection of the child left node to the root 
		// root.right=rootright;//making the connection of the child right node to the root
		
		// BinaryTreeNode<Integer> twoRight=new BinaryTreeNode<Integer>(4);
		// BinaryTreeNode<Integer> threeLeft=new BinaryTreeNode<Integer>(5);
		
		// rootLeft.right=twoRight;
		// rootright.left=threeLeft;

		// BinaryTreeNode<Integer> root=takeTreeInput();
		//BinaryTreeNode<Integer> root=takeTreeInputBetter(true,0,true);
		BinaryTreeNode<Integer> root=takeTreeInputLevelWise();
		//printTreeBetter(root);
		printTreeLevelwise(root);
		System.out.println();
		//printTree(root);
		int X=2;
		int k=2;
		System.out.println("Sum of the tree is "+TreeSum(root));
		System.out.println("Length of the tree is "+numNodes(root));
		System.out.println("Largest number of the tree is "+LargestOfAll(root));
		System.out.println("Number of nodes larger than "+X+" are "+LargerThanX(root, X));
		System.out.println("Height of the tree is "+height(root));
		System.out.println("Number of leaves on this tree is/are "+numberOfLeaves(root));
		System.out.println("Elements at depth "+k+" are :");
		elementsAtK(root, k);
		int newX=3;
		System.out.println(isNodePresent(root, newX));
	}
}
