package com.jscoder.practice.colections.practice;


import java.util.LinkedList;
import java.util.logging.Logger;

/*
* La matriz conocida almacena un lote de números QQ. El número QQ más largo es de 11 dígitos
* y el más corto es de 5 dígitos
* String [] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933" }.
    Almacene todos los números qq en la matriz en LinkedList, elimine
* los elementos repetidos en la lista e imprima todos los elementos en la lista con un iterador y un bucle for mejorado.
*
* */
public class MatrizQQ {
    static Logger logger = Logger.getLogger("MyLog");
    public static void main(String[] args) {

        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        LinkedList  <String> list = new LinkedList<>();

        for (int i = 0; i < strs.length; i++) {
            list.add(strs[i]);

        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))){
                    list.remove(j);
                    
                }
                
            }
        }


        list.forEach(cadena -> logger.info(cadena));



    }
}
