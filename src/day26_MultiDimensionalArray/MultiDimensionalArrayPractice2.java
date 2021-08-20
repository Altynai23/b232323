package day26_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {

    public static void main(String[] args) {
        /*
        String[] group5 = {"Ahmed","Igor","Andrei","Mykyta"},
                group2 = {"Sabir","Abbos","Kseniia","Vitalii","Merve","Atilla","Shokhzod","Hende","Serife","Collins", "Akangankoy", "Liubov"},
                group3 = {"Oz","Ibrahim", "Davut", "Dontrell", "Muhammed"},
                group4 = {"Inessa", "Aysu", "Suat", "Esra", "Yusuf", "Mohamed", "Tinbite", "Raphael"},
                group1 = {"Selda", "Ibrahim", "Tamerlan", "Mehmut", "Sina"};
        */

        String[][] cybertekGroup = {
                {"Ahmed","Igor","Andrei","Mykyta"}, //0
                {"Sabir","Abbos","Kseniia","Vitalii","Merve","Atilla","Shokhzod","Hende","Serife","Collins", "Akangankoy", "Liubov"},
                {"Oz","Ibrahim", "Davut", "Dontrell", "Muhammed"},
                {"Inessa", "Aysu", "Suat", "Esra", "Yusuf", "Mohamed", "Tinbite", "Raphael"},
                {"Selda", "Ibrahim", "Tamerlan", "Mehmut", "Sina"}
        };

        int count = 0;

        for (String[] eachGroup : cybertekGroup) {
            for (String eachName : eachGroup){
                if (eachName.equals("Ahmed") ){
                    count++;
                }
            }
        }


        System.out.println("count = " + count);


        System.out.println("--------------------------------------");
        String[][][][][] names = { {  {{{"Victoria", "Feruza"},{"Koray", "Break"} }, {{"Komiljon", "Yasin"}}} , {{{"Alexandra", "Merve"}, {"Zaur", "Vulkasin"} }}} };


        for (String[][][][] each4D : names) {
            for (String[][][] each3D : each4D) {
                for (String[][] each2D : each3D) {
                    for (String[] each1D : each2D) {
                        for (String element : each1D) {

                            System.out.println(element);

                        }
                    }
                }
            }
        }


        System.out.println(Arrays.deepToString(names));





    }

}
