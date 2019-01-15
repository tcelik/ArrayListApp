package org.csystem.csdarraylistapp.app;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Array'neyine yetmiyor?");

        //öncelikle my-array alalım, işlemleri bu array üzerinden düşünelim
        int [] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        //bir static metot yazalım ekrana bassın -> advanced for kullanalım
        printMyArray(a);
    }

    private static void printMyArray(int[] a)
    {
        for (int val : a)
            System.out.print(val + " ");
        System.out.println();
    }
}
