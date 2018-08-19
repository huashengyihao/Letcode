
public class C19_RemoveNthNodeFromEndofList {
	
	 // Definition for singly-linked list.
	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	 
	public ListNode tmpHead = new ListNode(-1);
	public int count = 0;
	public int[] statusArr = new int[9999];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C19_RemoveNthNodeFromEndofList instance = new C19_RemoveNthNodeFromEndofList();
		ListNode node1 = instance.new ListNode(1);
//		ListNode node2 = instance.new ListNode(2);
//		ListNode node3 = instance.new ListNode(3);
//		ListNode node4 = instance.new ListNode(4);
//		ListNode node5 = instance.new ListNode(5);
//		node1.next = node2;
//		node2.next = node3;
//		node3.next = node4;
//		node4.next = node5;
		ListNode node = instance.removeNthFromEnd(node1, 1);
		
		while(node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	// case 1:
//	public ListNode iter(ListNode head, int n) {
//		if (head == null) {
//			count++;
//			return null;
//		}
//		removeNthFromEnd(head.next, n);
//		if (count <= n) {
//			head.next = tmpHead.next;
//			tmpHead.next = head;
//		} else if (count == n + 1) {
//			head.next = tmpHead.next.next;
//		}
//		count++;
//		return head;
//	}
	
	// case2:
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0); dummy.next = head;
		ListNode node1 = dummy;
		ListNode node2 = dummy;
		
		for (int i = 1; i <= n + 1; i++) {
			node1 = node1.next;
		}
		while (node1 != null) {
			node1 = node1.next;
			node2 = node2.next;
		}
		node2.next = node2.next.next;
		return dummy.next;
    }
}
