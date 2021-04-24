package lc.q142;

/**
 * Definition for singly-linked list.
 * */
class ListNode {
    int val;
    ListNode next;

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Solution {
	public ListNode detectCycle(ListNode head) {
		ListNode fast = head;
		ListNode slow = head;
		do{
			slow = slow.next;
			fast = fast.next.next;
		}while(fast!=slow && slow != null);
		if(slow == null){
			return null;
		}
		fast = head;
		while(fast!=slow){
			fast = fast.next;
			slow = slow.next;
		}
		return fast;

	}

	public static void main(String[] args) {
		ListNode h = new ListNode(1,new ListNode(2,new ListNode(3,null)));
		h.next.next.next = h;
		Solution solution = new Solution();
		solution.detectCycle(h);
	}
}
