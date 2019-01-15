package org.csystem.csdarraylistapp.app;

import org.csystem.csdarraylistapp.util.ArrayUtil;

import java.util.Arrays;

public class App {
    public static void main(String[] args)
    {
        int [] a = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int [] t = new int[0];

        /*
            Fark et!
            Arrays.toString(a) diyorki: Ver bana bir dizi, verim sana string.
            String verirken diziyi dolaşıp aralarına virgül koyuyor ve başına sonuna [] koyuyor.
        */

        //Bunu bizde yapabiliriz, öyle değil mi? Biraz düşünelim.
        System.out.println(ArrayUtil.toString(a));
    }
}
