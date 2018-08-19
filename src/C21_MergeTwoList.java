
public class C21_MergeTwoList {
	
	// Definition for singly-linked list.
	public class ListNode {
	    int val;
	    ListNode next;
	    public ListNode(int x) { val = x; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode mergeHead = new ListNode(-1);
        ListNode mergeIndex = mergeHead;
        ListNode headL1 = l1;
        ListNode headL2 = l2;
        
        while (headL1 != null && headL2 != null) {
        	if (headL1.val <= headL2.val) {
        		mergeIndex.next = headL1;
        		headL1 = headL1.next;
        	} else {
        		mergeIndex.next = headL2;
        		headL2 = headL2.next;
        	}
        	mergeIndex = mergeIndex.next;
        }
        if (headL1 != null) {
        	mergeIndex.next = headL1;
        } else if (headL2 != null) {
        	mergeIndex.next = headL2;
        }
        
        return mergeHead.next;
    }
}
