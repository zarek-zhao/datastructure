package com.zarek;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args)
    {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(12);

        arrayList.remove();
        System.out.println("arrayList.get(0) = " + arrayList.get(0));
        System.out.println("arrayList.size() = " + arrayList.size());
//        arrayList.remove();
//        arrayList.size();
//        arrayList.clear();
    }
}
