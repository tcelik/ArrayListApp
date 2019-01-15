package org.csystem.csdarraylistapp.util;

public class ArrayUtil {

    //get the array & print it : ver bana bir array & verim sana print edilmiş halini.
    public static void printMyArray(int[] a)
    {
        for (int val : a)
            System.out.print(val + " ");

        System.out.println();
    }

    //comma
    public static String toString(int[] a)
    {
        //Asla kontrol etmeyi unutma, null pointer exception.
        if (a == null) //adres karşılaştırması yapar
            return "null";

        //Eğer dizinin eleman sayısı 0 ise -> int [] t = new int[0];
        int iMax = a.length - 1; //9 indexMax
        if (iMax == -1)
            return "[]";

        //[4, 8, 3, 1, 18, 9, 21, 20, 5, 17]
        StringBuilder result = new StringBuilder();
        result.append("[");

        int index = 0;
        for (int val : a) {
            index++;
            if (!(index == a.length))
                result.append(val + ", ");
            else
                result.append(val);
        }

        result.append("]");

        return result.toString();
    }
}
