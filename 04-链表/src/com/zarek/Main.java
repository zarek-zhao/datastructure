package com.zarek;

/**
 * @author zarek
 * @version 1.0.0
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args)
    {
        LinkList<Integer> linkList = new LinkList<>();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        linkList.add(223);


        System.out.println("linkList.toString() = " + linkList.toString());
    }
}
