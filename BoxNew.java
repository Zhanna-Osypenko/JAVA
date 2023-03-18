
package com.auto.finland;

public class BoxNew {
    int lengh;
    int width;
    int height;

    public BoxNew(int lengh, int width, int height) {
        this(lengh, width);

        this.lengh = lengh;
        this.width = width;
        this.height = height;

        System.out.println("Box1: l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box1 => " + (lengh * width * height));
        System.out.println();
    }

    public BoxNew(int lengh, int width) {
        this(width);

        this.lengh = lengh;
        this.width = width;
        height = 20;

        System.out.println("Box2: l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box2 => " + (lengh * width * height));
        System.out.println();
    }

    public BoxNew(int lengh) {
        this();

        this.lengh = lengh;
        width = 5;
        height = 20;

        System.out.println("Box3: l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box3 => " + (lengh * width * height));
        System.out.println();
    }

    public BoxNew() {
        lengh = 3;
        width = 4;
        height = 10;

        System.out.println("Box4: l = " + lengh + ", w = " + width + ", h = " + height);
        System.out.println("Volume Box4 => " + (lengh * width * height));
        System.out.println();
    }

}
