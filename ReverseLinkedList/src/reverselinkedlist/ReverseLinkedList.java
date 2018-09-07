/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverselinkedlist;

/**
 *
 * @author cstuser
 */
public class ReverseLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Node head = new Node(11, new Node(3,new Node(52, new Node(10,null))));
//        printLinkList(head);
        Node headOfReversed = reverse(head);
        printLinkList(headOfReversed);
    }
    
    public static void printLinkList(Node head) {
        Node p = head;
        while(p != null) {
            System.out.print(p.value + ", ");
            p = p.next;
        }
        System.out.println("");
    }
    
    public static Node reverse(Node head) {
        if(head.next == null || head.next == null){
            return head;
        }
        Node headNext = head.next;
        Node headReverseOfRest = reverse(head.next);
        
        headNext.next = head;
        head.next = null;
        return headReverseOfRest;
    }
}
