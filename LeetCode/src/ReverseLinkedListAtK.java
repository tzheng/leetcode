
public class ReverseLinkedListAtK {
	static class Node {
		int value;
		Node next;
		
		public Node(int value, Node n) {
			this.value = value;
			next = n;
		}
		
	}
	public static void toString(Node head) {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.value + " -> ");
			curr = curr.next;
		}
		System.out.println();
	}
	public static Node reverseLL(Node head) {
		if (head == null || head.next == null) return head;
		
		Node remain = reverseLL(head.next);
		head.next.next = head;
		head.next = null;
		return remain;
	}
	
	public static Node reverse(Node head, int k) {
		if (head == null) return null;
		Node curr = head;
		int i = 0;
		//got the segement that need to reverst, 1->2  3_4_5;
		while (curr != null) {
			i++;
			if (i>=k) break;
			curr = curr.next;
		}
		if (i<k) 
			return head;
		
		Node prev = null;
		Node next;
		curr = head;
		i = k;
		while (curr != null && i>0) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			i--;
		}
		
		head.next = reverse(curr, k); // 2-1 - =  reverse(3-4-5);
		return prev; //!important
	}
	
	public static void main(String[] args) {
		Node head = new Node(5, null);
		head = new Node(4, head);
		head = new Node(3, head);
		head = new Node(2, head);
		head = new Node(1, head);
		
		toString(head);
		toString(reverse(head,3));
	}
}
