/**
 * @(#)LinkedList.java
 *
 *
 * @author 
 * @version 1.00 2021/8/12
 */

public class LL {
   public static class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
		next=null;
	}
   }
	public static class LinkedList{
		Node head;
		Node tail;
		int size;
		void addLast(int value){
			Node temp=new Node(value);
			
			if(size==0){
				
				head=tail=temp;
				size++;
			}else{
				tail.next=temp;
				tail=temp;
				size++;
			}
			
		}
		void printList(){
			Node tem=head;
			while(tem!=null){
				System.out.println(tem.data);
				tem=tem.next;
			}
			System.out.println("Size is:"+size);
		}
	}

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addLast(5);
        ll.addLast(10);
        ll.addLast(52);
        ll.addLast(12);
        ll.printList();
    }
}
