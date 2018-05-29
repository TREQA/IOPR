package myjavaprogram;

public class MyJavaProgram {

    public static void main(String[] args) {

        /*Exerciţiul 1

Este necesar să creăm un program care adună două numere
reprezentate prin două variabile. Primul număr este variabila x, cu
valoarea 1, iar celălalt este variabila y, cu valoarea 2. Trebuie să
atribuim variabilei z rezultatul adunării acestor două variabile.
         */
        int x = 1;
        int y = 2;
        int z = x + y;
        System.out.println(z);
        
        /*Exerciţiul 2
        
Trebuie să creăm un program care calculează aria unui cerc.
        */
        double pi = 3.14;
        double r = 5; //raza cercului
        double aria = pi * (r * r) ; 
        System.out.println(aria);
    }
}
