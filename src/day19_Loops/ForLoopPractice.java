package day19_Loops;

public class ForLoopPractice {

    public static void main(String[] args) {
        for(int i = 0; i < 1000; i++){ //i: 0,1,2,3,4,5,6.....1000
            System.out.println(i+" ");
        }

        System.out.println(); // to make sure next print statement starts from new lin

        System.out.println("--------------------------------------------------------");

        for(int i = 1; i <= 100; i++){ //i: 1,2,3,4,5,6,7.....100
            if(i%2 !=0){
                System.out.println(i+"");
            }
        }


        System.out.println();  // to make sure next print statement starts from new lin

        System.out.println("---------------------------------------------------------");

        for(int i = 1; i <= 100; i+=2){ //i: 1,3,5,7,9,11.....
            System.out.println(i+" ");
        }

        System.out.println(); // to make sure next print statement starts from new lin

        System.out.println("-------------------------------------------------------");

        for(int i = 1; i < 101; i++){
            if (i%2 == 0){
                System.out.println(i+" ");
            }
        }

        System.out.println(); // to make sure next print statement starts from new lin

        System.out.println("-------------------------------------------------------");
        String odds = "";
        String evens = "";

        for (int i = 1; i < 101; i++){
            if (i %2 == 0){
                odds += i+" ";
            }else{
                evens +=" ";
            }
        }


        System.out.println("odds = " + odds);
        System.out.println("evens = " + evens);


    }

}



