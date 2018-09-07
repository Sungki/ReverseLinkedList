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
public class Node {
    public int value;
    public Node next;
    
    Node(int value, Node next) {
        this.next = next;
        this.value = value;
    }
}
