package com.jscoder.practice.colections.practice;

import java.util.ArrayList;

import java.util.Random;
import java.util.logging.Logger;

public class RandonNumbers {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {

        ArrayList <String> list = new ArrayList<>();
         int [] numbers = new int[10];
         for (int i = 0; i < numbers.length; i++) {
             Random r = new Random();
             int rand = r.nextInt(50);
             numbers[i] = rand;

         }
for (int i = 0; i < numbers.length; i++) {
    if (numbers[i]>=10)
        list.add(String.valueOf(numbers[i]));

}


list.forEach(cadena-> logger.info(cadena));




    }
}
