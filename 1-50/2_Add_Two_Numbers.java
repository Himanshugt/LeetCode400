// Problem link: https://leetcode.com/problems/add-two-numbers/



/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head=new ListNode(); 
        ListNode dummy=new ListNode();
        
        //check is used to keep track of carry
        boolean check=false;
        
        ListNode cNode1=l1;
        ListNode cNode2=l2;
        
        //Used to check if head got its value or not
        boolean assignHead=true;
        
        while(cNode1!=null && cNode2!=null){
            int sum=cNode1.val+cNode2.val;
            if(check){
                sum+=1;
            }
            
            if(sum>=10){
                check=true;
            }else{
                check=false;
            }
            
            if(assignHead){
                dummy.val=sum%10;
                dummy.next=null;
                head=dummy;
                assignHead=false;
            }
            else{
                ListNode temp=new ListNode(sum%10);
                dummy.next=temp;
                dummy=temp;
            }
            
            cNode1=cNode1.next;
            cNode2=cNode2.next;
        }
        
        //Code to check if any of the numbers have more digits than the other number
        if(cNode1==null && cNode2==null){
            if(check){
                ListNode temp=new ListNode(1);
                dummy.next=temp;
                check=false;
            }           
        }
        else if(cNode1!=null){
            while(cNode1!=null){
                int sum=cNode1.val;
                
                if(check){
                    sum+=1;
                }

                if(sum>=10){
                    check=true;
                }else{
                    check=false;
                }
                
                ListNode temp=new ListNode(sum%10);
                dummy.next=temp;
                dummy=temp;

                cNode1=cNode1.next;
            }
        }
        else{
            while(cNode2!=null){
                int sum=cNode2.val;
                
                if(check){
                    sum+=1;
                }

                if(sum>=10){
                    check=true;
                }else{
                    check=false;
                }
                
                ListNode temp=new ListNode(sum%10);
                dummy.next=temp;
                dummy=temp;

                cNode2=cNode2.next;
            }
        }
        
        //Code to check if carry is left from the last sum evaluated in the above if else statements
        if(check){
            ListNode temp=new ListNode(1);
            dummy.next=temp;
            check=false;
        }
        return head;
    }
}