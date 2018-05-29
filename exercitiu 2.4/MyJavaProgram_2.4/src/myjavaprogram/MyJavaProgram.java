package myjavaprogram;

import java.util.Arrays;

public class MyJavaProgram {

    public static void main(String[] args) {

        /* Exerciţiul 1
Trebuie creat un program care adună două matrice. Prima matrice are
valoarea:
1 2 3
5 6 7
9 0 1
A doua matrice are valoarea:
4 1 6
2 3 5
7 4 3
         */
        int[][] matrix1 = {
            {1, 2, 3},
            {5, 6, 7},
            {9, 0, 1}
        };
        int[][] matrix2 = {
            {4, 1, 6},
            {2, 3, 5},
            {7, 4, 3}};

        int[][] matrix3 = new int[3][3];

        matrix3[0][0] = matrix1[0][0] + matrix2[0][0];
        matrix3[0][1] = matrix1[0][1] + matrix2[0][1];
        matrix3[0][2] = matrix1[0][2] + matrix2[0][2];
        matrix3[1][0] = matrix1[1][0] + matrix2[1][0];
        matrix3[1][1] = matrix1[1][1] + matrix2[1][1];
        matrix3[1][2] = matrix1[1][2] + matrix2[1][2];
        matrix3[2][0] = matrix1[2][0] + matrix2[2][0];
        matrix3[2][1] = matrix1[2][1] + matrix2[2][1];
        matrix3[2][2] = matrix1[2][2] + matrix2[2][2];

        System.out.println(matrix3[0][0]);

        /* Exerciţiul 2
Trebuie să creat un program care va sorta şirul dat şi la ieşire va da
şirul vechi şi cel nou:
int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23,
934, 999, 43};
         */
        // my solution
        int[] array = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23, 934, 999, 43};
        int[] array2 = new int[array.length];

        System.arraycopy(array, 0, array2, 0, array.length);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));

        // intended solution 
        int[] array3 = {1, 5, 33, 563, 0, 2, 23, 9, 9, 11, 987, 23, 934, 999, 43};
        System.out.println("This is array:" + Arrays.toString(array3));
        Arrays.sort(array);
        System.out.println("This is a sorted array:" + Arrays.toString(array3));

    }

}
