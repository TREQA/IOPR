package myjavaprogram;

import java.util.Arrays;

public class MyJavaProgram {

    public static void main(String[] args) {

        /*Exerciţiul 1
Avem şirul următor:
int[] arr = {1,2,-1,4,5,-1};
Cu ajutorul buclei for, trebuie să copiem acest şir în şirul arr1, unde
toţi membrii cu valoarea -1 trebuie înlocuiţi de membrii cu valoarea
zero. Arr1 trebuie afişat apoi la ieşire.
         */
        int[] arr = {1, 2, -1, 4, 5, -1};
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                arr1[i] = 0;
            } else {
                arr1[i] = arr[i];
            }
        }
        System.out.println(java.util.Arrays.toString(arr1));

        /* Exerciţiul 2
În aplicaţie intră şirul următor:
        
String[][] users = { { "petar" , "petrovic" , "1111" },
{"jovan","jovanovic","2222"} , {"zoran","ivanovic","3333"}};
        
Trebuie să separăm numele utilizatorilor şi să le stocăm într-un şir
separat. Acest şir trebuie emis la ieşire. */
        String[][] users = {
            {"petar", "petrovic", "1111"},
            {"jovan", "jovanovic", "2222"},
            {"zoran", "ivanovic", "3333"}
        };
        String[] names = new String[users.length];
        for (int i = 0; i < users.length; i++) {
            names[i] = users[i][0];
        }
        System.out.println(java.util.Arrays.toString(names));

    }
}
