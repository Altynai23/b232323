package day26_MultiDimensionalArray;

public class MultiDimensionalArrayPractice {

    public static void main(String[] args) {

        int[][] arr2D = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
        //                   0         1               2

        for (int i = arr2D.length-1; i >= 0; i--){ // index number of each single dimensional array

            for (int j = 0; j < arr2D[i].length; j++){ // j: index number of each element in single dimensional array
                System.out.println(arr2D[i][j] + " ");
            }


            /*
            for (int each : arr2D[i] ){
                System.out.println(each+" ");
            }

             */

            System.out.println();

        }

        System.out.println("---------------------------------");

        for (int i = 0; i < arr2D.length; i++){ // i: index number of each single dimensional array starting from index 0

            for (int j = arr2D[i].length-1; j >= 0; j--){ // j: index number of each element in single dimensional array, started from last index
                System.out.println(arr2D[i][j]+" ");
            }
            System.out.println();

        }


        System.out.println("------------------------------------");

        for (int[] each1D : arr2D ){ // i: index number of each single dimensional array starting from index 0

            for (int j = each1D.length-1; j >= 0; j--){ // j: index number of each element in single dimensional array, started from last index
                System.out.println(each1D[j]+" ");
            }
            System.out.println();

        }

        System.out.println("--------------------------------------");

        for (int i = arr2D.length-1; i >= 0; i--) {// i: index number of each single dimensional array starting from index

            for (int j = arr2D[i].length-1; j >= 0; j--){
                System.out.println(arr2D[i][j] + " ");
            }

            System.out.println();

        }






    }

}
