package com.linkedlist;

import java.util.LinkedList;

public class linkedlist5 {
    public static void main(String []args){
        LinkedList<String> staff1 = new LinkedList<String>();
        staff1.addFirst("herry");
        staff1.addFirst("diana");
        staff1.addFirst("tom");
        System.out.println(staff1.removeFirst());
        System.out.println(staff1.removeFirst());
        System.out.println(staff1.removeFirst());
        System.out.println("////////////////");
        LinkedList<String> staff = new LinkedList<String>();
        staff.addFirst("herry");
        staff.addFirst("diana");
        staff.addFirst("tom");
        System.out.println(staff.removeLast());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeLast());
        System.out.println("////////////////");
        LinkedList<String> staff2 = new LinkedList<String>();
        staff2.addFirst("herry");
        staff2.addLast("diana");
        staff2.addFirst("tom");
        System.out.println(staff2.removeLast());
        System.out.println(staff2.removeFirst());
        System.out.println(staff2.removeLast());

    }
}

