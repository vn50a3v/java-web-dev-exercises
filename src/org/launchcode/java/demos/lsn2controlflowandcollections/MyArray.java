package org.launchcode.java.demos.lsn2controlflowandcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyArray {
    public static void main(String[] args) {
         int [] Num = {1,1,2,3,5,8};
         for (int i: Num)
         {
             if (i % 2 == 1 ){
                 System.out.println(i);
             }

             String Word = "I would not, could not, in a box." +
                     " I would not, could not with a fox. I will " +
                     "not eat them in a house. I will not eat them" +
                     " with a mouse";
             String [] Arr = Word.split("\\.");
             System.out.println(Arrays.toString(Arr));


             ArrayList<Integer> Test = new ArrayList<>(10);
                                Test.add(1);
                                Test.add(2);
                                Test.add(3);
                                Test.add(4);
                                Test.add(5);
                                Test.add(6);
                                Test.add(7);
                                Test.add(8);
                                Test.add(9);
                                Test.add(10);

             System.out.println(Test);
             ArrayList<String> Alph = new ArrayList<>(10);

                  Alph.add("A");
                  Alph.add("B");
                  Alph.add("C");
                  Alph.add("D");
                  Alph.add("F");
//Convert String to Array
             String strings = "99,42,55,81,79,64,22";
             String str[] = strings.split(",");

             List nl = new ArrayList();
             nl = Arrays.asList(str);

             //? Object to String
             for(Object s: nl){
                 System.out.println(s);
             }



         }
    }
}
