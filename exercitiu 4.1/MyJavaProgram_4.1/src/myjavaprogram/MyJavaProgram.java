package myjavaprogram;

import java.util.Arrays;

public class MyJavaProgram {

    public static void main(String[] args) {

        /*Exerciţiul 1
Trebuie creată clasa Animal care va fi definită ca una abstractă, iar
apoi trebuie create două clase, Horse şi Dog, care vor moşteni prima
clasă Animal.*/
        abstract class Animal {

        }
        class Horse extends Animal {

            void z() {
                System.out.println("horse");

            }
        }

        class Dog extends Animal {

            void d() {
                System.out.println("dog");

            }
        }
        /*Exerciţiul 2
Trebuie executată instanţierea claselor din exerciţiul precedent.*/

        Horse horse = new Horse();

        Dog dog = new Dog();
        
        horse.z();
        dog.d();

    }

}
