package com.customeLinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(23);
//        list.insertFirst(12);
//        list.insertFirst(4);
//        list.insertFirst(9);
//        list.display();
//        list.insertLast(45);
//        list.insert(13,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.deleteLast());
//        list.display();
//        list.delete(2);
//        list.display();
//        System.out.println(list.find(23));

//        DL list2 = new DL();
//        list2.insertFirst(12);
//        list2.insertFirst(24);
//        list2.insertFirst(19);
//        list2.display();
//        list2.insertLast(34);
//        list2.display();

        CL list3 = new CL();
        list3.insertFirst(12);
        list3.insertFirst(15);
        list3.insertFirst(19);
        list3.insertFirst(21);
        list3.display();
        list3.delete(19);
        list3.display();


    }
}
