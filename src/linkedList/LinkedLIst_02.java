package linkedList;

class Linkedlist{
	Node header;
	
	static class Node{
		int data;
		Node next = null;
	} 
	Linkedlist(){
		header = new Node();
		
	}
	
	void append(int d) {
		Node end = new Node();
		end.data = d;
		Node n = header;
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void delete(int d) {
		Node n = header;
		while(n.next != null) {
			if(n.next.data ==d) {
				n.next = n.next.next;
			}else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = header.next;
		while (n.next != null) {
			System.out.print(n.data +"->");
			n = n.next;
		}
		System.out.println(n.data);
	}
	
	Node get(int d) {
		Node n = header;
		while(n.next != null) {
			if(n.data==d) return n;
			
			n = n.next;
		}
		
		return n =null;
	}
}


public class LinkedLIst_02 {

	public static void main(String[] args) {
		Linkedlist ll = new Linkedlist();
		ll.append(1);
		ll.append(3);
		ll.append(2);
		ll.append(3);
		ll.retrieve();
		
		deleteNode(ll.get(3));
		ll.retrieve();
	}
	
	private static boolean deleteNode(linkedList.Linkedlist.Node node) {
		
		if(node == null || node.next == null) return false;
		
		linkedList.Linkedlist.Node next = node.next;
		node.data = next.data;
		node.next = next.next;
		return true;
	}
	
}
