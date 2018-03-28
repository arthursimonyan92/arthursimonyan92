package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       ArrayList<String> arrayList =new ArrayList<String>(10);
       ArrayList<Integer> arrayList1= new ArrayList<Integer>(14);


        arrayList.addElement("jsdgfjsfjf");
        arrayList.addElement("jfhsjkfhsjhf");
        arrayList.addElement("ifgweyrgywehewf");
        arrayList.addElement("ppp");
        System.out.println(arrayList.contains("ppp"));
        System.out.println( arrayList.getElementdata(1));
        arrayList.remove(1);
        System.out.println(arrayList.getElementdata(1));


        arrayList1.addElement(12);
        System.out.println(arrayList1.getElementdata(0));
        System.out.println(arrayList1.contains(12));

        System.out.println(arrayList.getLength());
        System.out.println(arrayList.isEmpty());

    }
}
