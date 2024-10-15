public class Main {
    public static void main(String[] args) {
//        Triangle деген класс тузунуз.
//  Класстын 3 полеси болсун a, b, c.
//  Класстын "area" деген методу болсун.
//  "area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//  таянып консолго уч бурчтуктун аянтын чыгарсын.

        Triangle triangle = new Triangle();
        triangle.a = 6;
        System.out.print("a = "+triangle.a);
        triangle.b = 8;
        System.out.print("\nb = "+triangle.b);
        triangle.c = 10;
        System.out.println("\nc = "+triangle.c);
        System.out.print("S = ");
        triangle.area();

    }
}