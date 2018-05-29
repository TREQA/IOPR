package myjavaprogram;

public class MyJavaProgram {

    public static void main(String[] args) {

/*Exercitiu 1

Se dă următorul cod care adună două numere:
int operand1=2;
int operand2=3;
int sum=operand1+operand2;
System.out.println(sum);

Trebuie să facem o descriere a codului pentru documentație.
*/

        //primul operator
        int operand1 = 2;
        //al 2-lea operator
        int operand2 = 3;
        //calculam suma celor 2 operatori
        int sum = operand1 + operand2;
        //printa suma celor 2 operatori
        System.out.println(sum);

/* Exercitiu 2

Se dă codul următor:
int a=2,b=3;
System.out.print("First operand: ");
System.out.println(a);
System.out.print("Second operand: ");
System.out.println(b);
System.out.print("Sum: ");
System.out.println(a+b);
        
Trebuie să ne asigurăm că la ieşire codul afişează doar rezultatul
(numărul 5) şi că toate liniile de cod rămân disponibile pentru o
utilizare viitoare.
*/

        int a = 2, b = 3;
        /*
        System.out.print("First operand: ");
        System.out.println(a);
        System.out.print("Second operand: ");
        System.out.println(b);
        System.out.print("Sum: ");
         */
        System.out.println(a + b);

    }

}
