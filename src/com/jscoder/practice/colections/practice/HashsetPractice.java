package com.jscoder.practice.colections.practice;
import java.util.HashSet;
import java.util.Random;

import static com.jscoder.practice.colections.practice.RandonNumbers.logger;

public class HashsetPractice {
    /**
     * Reglas de bolas de dos colores: cada apuesta en la bola de dos colores consta de 6 números de bolas rojas y 1 número de bolas azules.
     * El número de bola roja se selecciona del 1 al 33; el número de bola azul se selecciona del 1 al 16; g
     * enere aleatoriamente un número de bola de doble color. (Requiere que no se repita el mismo número de color)
     *
     */
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        int i = 0;
        while(i<6)
        {
            Random rand = new Random();
            int randNum = rand.nextInt(33)+1;
            if(!hs.contains(randNum))
            {
                hs.add(randNum);
                i++;
            }
        }
        boolean flag = true;
        while(flag)
        {
            Random blue = new Random();
            int blueNum = blue.nextInt(16)+1;
            if(!hs.contains(blueNum))
            {
                hs.add(blueNum);
                flag = false;
            }
        }


        hs.forEach(cadena->logger.info(String.valueOf(cadena)));



    }}
