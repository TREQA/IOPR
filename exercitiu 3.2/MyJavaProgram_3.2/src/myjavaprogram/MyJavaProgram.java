package myjavaprogram;

import java.util.Arrays;

public class MyJavaProgram {

    public static void main(String[] args) {

        /*Exerciţiul 1
În program, intră următoarele date:

int x = 523134;
int y = 325423;

Trebuie să verificăm restul împărţirii dintre x şi y. Dacă nu există rest,
trebuie să se afişeze mesajul că restul nu există, în caz contrar, trebuie
să se verifice dacă restul este mai mare sau mai mic decât o mie şi să
se afişeze mesajul corespunzător.
         */
        int x = 523134;
        int y = 325423;

        int z = x % y;

        switch (z) {
            case 0:
                System.out.println("Nu exista rest!");
                break;
            default:
                if (z > 1000) {
                    System.out.println("Restul este mai mare de 1000");
                } else {
                    System.out.println("Restul este mai mic de 1000");
                }

        }

        /*Exerciţiul 2
Avem următoarele date de intrare pentru un automobil:
String carMake = "Ford";
int doors = 4;
Trebuie să se facă o structură condițională care va verifica dacă
producătorul automobilului este Ford și, dacă este, în funcție de
numărul de uși, să afișeze mesajul adecvat.
         */
        String carMake = "Ford";
        int doors = 3;

        if (carMake == "Ford") {
            switch (doors) {
                case 2:
                    System.out.println("Automobil Ford cu 2 usi");
                    break;
                case 3:
                    System.out.println("Automobil Ford cu 3 usi");
                    break;
                case 4:
                    System.out.println("Automobil Ford cu 4 usi");
                    break;
            }

        } else {
            System.out.println("Automobilul nu este Ford");
        }
    }

}
