package org.csystem.csdarraylistapp.app;

import org.csystem.csdarraylistapp.entity.collection.CSDArrayList;
import org.csystem.csdarraylistapp.util.ArrayUtil;

import java.util.Arrays;

public class App {
    public static void main(String[] args)
    {
        try {
            CSDArrayList list = new CSDArrayList(-1);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("bi");
    }
}
