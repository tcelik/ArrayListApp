package org.csystem.csdarraylistapp.app;


import org.csystem.csdarraylistapp.util.ArrayUtil;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Array'neyine yetmiyor?");

        //öncelikle my-array alalım, işlemleri bu array üzerinden düşünelim
        int [] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        //aslında burada ArrayUtil diye bir sınıf iyi gider. Sanki array işlemlerinin yürütüldüğü bir sınıf.
        ArrayUtil.printMyArray(a);
    }
}
