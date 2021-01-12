package com.ironhack.main;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Empezamos con los loops:");

        System.out.println("=== While loop ===");
        int var1=0;
        while(var1<10){
            System.out.println("Var1 vale "+ ++var1);
        }

        System.out.println("=== For Loop ===");
        int[] arrayInt = {2,3,5};

        for (int i =0; i<arrayInt.length;i++){
            System.out.println(arrayInt[i]);
        }

        // do-while siempre ejecuta una primera vez el do, y luego verifica si la condición se cumple
        System.out.println("=== Do-while Loop ===");
        do{
            System.out.println(var1++);
        } while(var1 < 20);

        //simplificación del for para iterar dentro de una lista
        // i directamente es el valor, no el índice
        System.out.println("=== Foreach loop ===");
        for(int i: arrayInt){
            System.out.println(i);
        }
        System.out.println("=== Stream ===");
        Arrays.stream(arrayInt).forEach(System.out::println);


        // Exercise 1
        System.out.println("Exercise 1:");

        int[] arrayEx1 = {5, 4, 3, 2, 1};
        int first = arrayEx1[0];
        for( int i=0; i<arrayEx1.length;i++){
            if(i+1 == arrayEx1.length){
                arrayEx1 [i] = arrayEx1[i]*first;
            }
            else {
                arrayEx1[i] = arrayEx1[i] * arrayEx1[i + 1];
            }
        }
        System.out.println(Arrays.toString(arrayEx1));

        //Exercise 2
        System.out.println("Exercise 2:");
        int[] arrayEx2 = {1, 2, 3, 4, 5};
        for (int i=arrayEx2.length-1; i<arrayEx2.length; i--){
            if(i>=0){
                System.out.println(arrayEx2[i]);
            }
            else {
                break;
            }
        }


        for(int i = 0; i < arrayEx2.length / 2; i++)
        {
            int temp = arrayEx2[i];
            arrayEx2[i] = arrayEx2[arrayEx2.length - i - 1];
            arrayEx2[arrayEx2.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arrayEx2));

    }

}
