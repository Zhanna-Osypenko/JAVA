
package com.auto.finland;

public class Box {
    int lengh;
    int width;
    int height;

    public Box (int l, int w, int h) {
        lengh = l;
        width = w;
        height = h;

        System.out.println("----- BOX 1 ------");
        System.out.println("l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box1 => " + (lengh * width * height));
        System.out.println();
    }

    public Box (int l, int w) {
        lengh = l;
        width = w;
        height = 20;

        System.out.println("----- BOX 2 ------");
        System.out.println("l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box2 => " + (lengh * width * height));
        System.out.println();
    }

    public Box (int l) {
        lengh = l;
        width = 5;
        height = 20;

        System.out.println("----- BOX 3 ------");
        System.out.println("l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box3 => " + (lengh * width * height));
        System.out.println();
    }

    public Box () {
        lengh = 3;
        width = 4;
        height = 10;

        System.out.println("----- BOX 4 ------");
        System.out.println("l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box4 => " + (lengh * width * height));
        System.out.println();
    }

}
