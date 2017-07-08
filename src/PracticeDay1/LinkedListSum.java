package PracticeDay1;

/**
 * @author: chaudharimehul
 * @date:	Jul 8, 2017
 * 
 * Found on LeetCode.
 * Please visit www.leetCode.com for more information
 * Numbers are stored in Linked list node in reverse order
 * Add numbers from two linked list and create new linked list having sum of digit of these two.
 */
public class LinkedListSum {

	Node head;
	
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}

	LinkedListSum(){
	
	}
	
	LinkedListSum(Node head){
		this.head = head;
	}
	
	void add(int data){
		if(head == null){
			head = new Node(data);
		}else{
			
			Node currentNode = head;
			
			while(currentNode.next != null){
				currentNode = currentNode.next;
			}
			
			currentNode.next = new Node(data);
		}
	}
	
	Node sum(Node head1, Node head2){
		
		Node head = null;
		Node node = null;
		Node prevNode = null;
		
		int sum = 0;
		int carry = 0;
		
		Node node1 = head1;
		Node node2 = head2;
		
		while(node1 != null){
			
			sum = node1.data + node2.data + carry;
			
			if(sum >= 10){
				carry = sum/10;
				sum = sum - 10;
			}else{
				carry = 0;
			}
			
			node = new Node(sum);
			
			if(head == null){
				head = node;
			}
			
			if(prevNode != null){
				prevNode.next = node;
			}
			
			prevNode = node;
			
			node1 = node1.next;
			node2 = node2.next;
		}
				
		if(carry != 0){
			node = new Node(carry);
			
			if(prevNode != null){
				prevNode.next = node;
			}
		}
		return head;
	}
	
	void print(){
		Node node = head;
		
		while(node != null){
			System.out.print(" --> " + node.data);
			node = node.next;
		}
		System.out.println("");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListSum list1 = new LinkedListSum();
		LinkedListSum list2 = new LinkedListSum();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		list2.add(8);
		list2.add(8);
		list2.add(8);
		list2.add(8);

		list1.print();						
		list2.print();
		
		Node head3 = list1.sum(list1.head, list2.head); 
		
		LinkedListSum list3 = new LinkedListSum(head3);
		
		list3.print();
		
	}

}
