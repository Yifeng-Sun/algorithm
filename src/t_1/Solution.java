package t_1;


public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param S ListNode类 val表示权值，next指向下一个元素
     * @return ListNode类
     */
    public static ListNode solve (ListNode S) {
        // write code here
        //find the biggest
        int reg = 0;
        ListNode currentNode = S;
        while(true){
            if(currentNode.val > reg) {
                reg = currentNode.val;
            }
            if(currentNode.next == null){
                break;
            }else{
                currentNode = currentNode.next;
            }

        }
        System.out.println(reg);

        ListNode current = S;
        ListNode prev = null;
        if (current.val == reg){
            //do nothing
        }else{
            while(true){
                prev = current;
                current = current.next;
                if(current.val == reg){ // yudaolezuidade
                    prev.next = null;
                    ListNode tmp = current;
                    while(true){
                        if(tmp.next == null){
                            tmp.next = S;
                            break;
                        }else{
                            tmp = tmp.next;
                        }
                    }
                    break;
                }
            }
        }

        System.out.println(current.val);
        System.out.println(current.next.val);
        System.out.println(current.next.next.val);
        System.out.println(current.next.next.next.val);
        System.out.println(current.next.next.next.next.val);

        ListNode toReturn = current;
        int second = current.next.val;
        int end = 0;
        while(true){
            if(current.next != null){
                current = current.next;
            }else{
                end = current.val;
                break;
            }
        }
        if(end > second){
            current = toReturn;
            current.next.val = end;
            while(true){
                if(current.next != null){
                    current = current.next;
                }else{
                    current.val = second;
                    break;
                }
            }
        }




        return toReturn;

    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode();
        ListNode l2 = new ListNode();
        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        ListNode l5 = new ListNode();

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;

        l1.val = 5;
        l2.val = 2;
        l3.val = 4;
        l4.val = 1;
        l5.val = 3;

        ListNode current = Solution.solve(l1);

        System.out.println(current.val);
        System.out.println(current.next.val);
        System.out.println(current.next.next.val);
        System.out.println(current.next.next.next.val);
        System.out.println(current.next.next.next.next.val);

    }
}