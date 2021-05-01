package collectionimplementation;

public class SingleLinkedList {
	private int size;
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	
	public Node head=null;
	public Node tail=null;
	
	public void add(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			size++;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			size++;
		}
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		String str="";
		Node node=head;
		while(node!=null) {
			str+=node.data+", ";
			node=node.next;
		}
		return "["+str+"]";
	}
	
	public static void main(String[] args) {
		SingleLinkedList list=new SingleLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(30);
		list.add(40);
		System.out.println(list.size());
	}
	
	

}
