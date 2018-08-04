package linkedList;

 class Node{
	int data;
	Node next=null;
	Node(int d){
		this.data = d;
	}
	
	void append(int d) {
		Node end = new Node(d);
		Node n = this;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void retrieve() {
		Node n = this;
		while(n.next != null) {
			System.out.print(n.data + "->");
			n = n.next;
		}
		System.out.println(n.data);
		
	}
	
}


public class LinkedList_01 {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.append(4);
		head.retrieve();
		
	}

}
