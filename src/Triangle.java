public class Triangle {
    //    Triangle деген класс тузунуз.
//Класстын 3 полеси болсун a, b, c.
//Класстын "area" деген методу болсун.
//"area" методу полелериндеги маалыматтарга(маалымат объектти тузгондон кийин берилет)
//таянып консолго уч бурчтуктун аянтын чыгарсын.
    int a;
    int b;
    int c;

    public void area(){
        int p = (a+b+c)/2;
        int count = p*(p-a)*(p-b)*(p-c);
        double s = Math.sqrt(count);
        System.out.println(s);
    }
}
