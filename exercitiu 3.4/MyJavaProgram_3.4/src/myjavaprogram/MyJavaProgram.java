package myjavaprogram;

import java.util.Arrays;

public class MyJavaProgram {

    public static void main(String[] args) {

        /*Exerciţiul 1
Este dat următorul şir de numere:
    int[] arr = {1,2,3,4,5,6,7,8,9,10};
Trebuie să listăm şirul dat folosind bucla while.
         */
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int counter = 0;
        System.out.println("Rezultat ex 1");
        while (counter < arr.length) {
            System.out.println(arr[counter]);
            counter++;
        }

        /*Exerciţiul 2
Modificați codul din exerciţiul precedent pentru a se executa folosind
bucla do-while.
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int x = 0;
         */
                System.out.println("Rezultat ex 2");
        int x = 0;

        do {
            System.out.println(arr[x]);
            x++;
        } while (x < arr.length);

    }
}
