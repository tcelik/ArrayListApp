package org.csystem.csdarraylistapp.app;

import org.csystem.csdarraylistapp.util.ArrayUtil;

import java.util.Arrays;

public class App {
    public static void main(String[] args)
    {
        System.out.println("Array'neyine yetmiyor?");

        //Bu arkadaşlar Arrays diye bir sınıf yazmışlar, bilginiz olsun, string olarak: [4, 8, 3, 1, 18, 9, 21, 20, 5, 17]
        int [] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        String result = Arrays.toString(a);
        System.out.println(result);;
    }
}
