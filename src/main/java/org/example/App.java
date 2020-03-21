package org.example;

import java.util.HashMap;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class App 
{
    public static <checkKey> void main(String[] args ) {
        System.out.println("Hello World!");

            HashMap<Integer, String> digitsMap = new HashMap<>();
            digitsMap.put(1, ":ONE");
            digitsMap.put(2, ":TWO");
            digitsMap.put(3, ":THREE");
            digitsMap.put(4, ":FOUR");
            digitsMap.put(5, ":FIVE");

        System.out.println(digitsMap);
//**********************************
            Random rn = new Random();

            for (int i = 0; i <10 ; i++) {
                int RnNum = 1 + rn.nextInt(10);
                //System.out.println(RnNum);

                boolean checkKey = true;
                for (Integer key : digitsMap.keySet()){
                    if( key == RnNum) {
                        checkKey = false;
                    }
                }
                if (checkKey){
                        digitsMap.put(RnNum , "digit " +RnNum);
                }

            }
//*******************************
        for(Integer key : digitsMap.keySet()){
            if(key > 0 && key <6)
                digitsMap.put(key, ":digit"+key);
        }
//******************************
        HashMap<Integer , String> digitsMap2 =new HashMap<>();
        for (Integer key : digitsMap.keySet()) {
            digitsMap2.put(key, digitsMap.get(key));
        }
        System.out.println("\nSize : "+digitsMap2.size());
        System.out.println("Ключи -");
        for (Integer key : digitsMap.keySet()){
            System.out.print( key + "; ");
        }
        System.out.println("\nВсе значения :");
        for (Integer key : digitsMap.keySet()){
            System.out.print(digitsMap.get(key) + "; ");
        }
        System.out.println("\n"+digitsMap);
        System.out.println("\n"+digitsMap2);
        }
    }


