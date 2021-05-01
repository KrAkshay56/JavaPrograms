package collectionimplementation;

public class MyLinkedList {

	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
		}
	}
	public void display() {
		Node n=head;
		while(n!=null) {
			System.out.print(n.data+",");
			n=n.next;
		}
	}
	public static void main(String[] args) {
		MyLinkedList list=new MyLinkedList();
		list.head=new Node(100);
		Node second=new Node(200);
		Node third=new Node(300);
		
		list.head.next=second;
		second.next=third;
		list.display();
	}


}


