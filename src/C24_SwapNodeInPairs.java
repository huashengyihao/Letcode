
public class C24_SwapNodeInPairs {
	
	// Definition for singly-linked list.
	public class ListNode {
	    int val;
	    ListNode next;
	    public ListNode(int x) { val = x; }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C24_SwapNodeInPairs instance = new C24_SwapNodeInPairs();
		ListNode node1 = instance.new ListNode(1);
		ListNode node2 = instance.new ListNode(2);
		ListNode node3 = instance.new ListNode(3);
//		ListNode node4 = instance.new ListNode(4);
		node1.next = node2;
		node2.next = node3;
//		node3.next = node4;
		ListNode indexNode = instance.swapPairs(node1);
		while (indexNode != null) {
			System.out.println(indexNode.val);
			indexNode = indexNode.next;
		}
	}

	public ListNode swapPairs(ListNode head) {
        ListNode rtnNode = new ListNode(0);
        ListNode preNode = null;
        ListNode nextNode = null;
        ListNode prePreNode = null;
        
        if (head == null || head.next == null) {
        	return head;
        }
        rtnNode.next = head;
        prePreNode = rtnNode;
        while (prePreNode.next != null) {
        	preNode = prePreNode.next;
        	nextNode = preNode.next;
        	if (nextNode != null) {
        		preNode.next = nextNode.next;
        		nextNode.next = preNode;
        		prePreNode.next = nextNode;
            	prePreNode = prePreNode.next.next;
        	} else {
        		break;
        	}
        }
        
        return rtnNode.next;
    }
}
