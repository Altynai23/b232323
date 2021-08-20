package day33_Methods;

public class WarmUpTask2 {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8};
        boolean r1 = contains(array, 10);

        System.out.println("r1 = " + r1);


    }

    public static boolean contains(int[] array, int element){

        for (int each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }

    public static boolean contains(double[] array, double element){

        for (double each : array) {
            if(each == element){
                return true;
            }
        }

        return false;
    }

    public static boolean contains(String[] array, String element){

        for (String each : array) {
            if(each.equals( element ) ){
                return true;
            }
        }

        return false;
    }

    public static boolean contains(char[] array, char element){

        for (char each : array) {
            if(each == element  ){
                return true;
            }
        }

        return false;
    }






}
