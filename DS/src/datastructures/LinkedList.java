package datastructures;

public class LinkedList {
		//Insertion at the end
	Node head;
	//Method 1
public void insert(int data) {
		Node n1=new Node();
		n1.data=data;
		n1.next=null;
		if (head==null) {
			head=n1;
		}
		else { 
			Node n=head; // storing head in n
			while(n.next!=null){ // iterating till the last node
				n=n.next; //putting the address if the adding node in the last node that is n
			}
			n.next=n1; // making the temporary node n as the real node to be added
		
			}
		} 
	
	// Adding an element at the begining
	
	public void insertatStart(int data){
		Node n2=new Node();
		n2.data=data;
		n2.next=null;
		n2.next=head; // putting n2 address in the head node
		head= n2; // making the n2 as the head
	} 
	// Inserting at any location
	public void insertatAnyLocation(int data, int index) {
		Node n3= new Node();
		n3.data=data;
		n3.next=null;
		Node n= head; //dummy node
		for(int i=0; i<index-1;i++) { // traversal
			n=n.next;   
		}
		n3.next=n.next;
		n.next=n3;
	}
	
	//Deletion
	public void delete(int index) {
		if(index==0) {
			head=head.next;
		}
		else {
			Node n= head;
			Node n= null;
			n.next;
			
		}
	}
	
	
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.next);
	
	}
}
