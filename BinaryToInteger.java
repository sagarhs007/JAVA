class ListNode{
    int val;
    ListNode next;
    ListNode(int val){ this.val = val; }
}
public class BinaryToInteger {
    public static int binaryToInteger(ListNode head){
        int result = 0;
        ListNode current = head;
        while(current != null){
            result = result*2 + current.val;
            current = current.next;
        }
        return result;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(0);
        head.next.next = new ListNode(1);
        int integerValue = binaryToInteger(head);
        System.out.println(integerValue);
    }
}
