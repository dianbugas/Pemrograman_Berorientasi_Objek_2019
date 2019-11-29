package com.linkedlist;

import java.util.LinkedList;

public class linkedlist6 {
    public static void main(String []args){
        LinkedList<String> staff = new LinkedList<String>();
        staff.addFirst("herry");
        staff.addLast("diana");
        staff.addFirst("tom");
        System.out.println(staff.removeLast());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeLast());
    }
}
