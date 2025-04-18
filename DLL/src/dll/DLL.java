// Java program for the above approach
package dll;

import java.io.*;

class node {

    node prev;
    int data;
    node next;

    node(int value) // A constructor is called here
    {
        prev = null; // By default previous pointer is
        // pointed to NULL
        data = value; // value is assigned to the data
        next = null; // By default next pointer is pointed
        // to NULL
    }
}

class DLL {

    static node head
            = null; // declaring an empty doubly linked list

    static void insert_at_head(int value) {
        node n = new node(value);
        n.next = head;

        if (head != null) {
            head.prev = n;
        }
        head = n;
    }

    static void insert_at_tail(int value) {
        if (head == null) {
            insert_at_head(value);
            return;
        }
        node n = new node(value);
        node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;
    }

    static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        insert_at_tail(1);
        insert_at_tail(2);
        insert_at_tail(3);
        insert_at_tail(4);
        insert_at_tail(5);

        
        System.out.print("After insertion at tail: ");
        display(head);

        System.out.print("After insertion at head: ");
        insert_at_head(0);

        display(head);
    }
}

// This code is contributed by lokesh.
