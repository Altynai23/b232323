package day11_Switch;

public class TernaryPractice {

    public static void main(String[] args) {

        double salary = 90_000;
        int creditScore = 720;
        String result = "";

        if (salary >= 60000 && creditScore >= 650){ // if the person is eligible for loan
            result = "Loan Approved";
        }else{ //if the person is not eligible for loan
            result = "Loan Denied";
        }

        System.out.println("result = " + result);

        System.out.println("----------------------------------------");
        
        String sport = "Soccer";
        int price = (sport == "Soccer" || sport == "Tennis") ? 100: 50;
        System.out.println("price = " + price);

        System.out.println("_________________________________________");
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;
        
        String result2 = (n1 > n2 && n1 > n3)? "n1 is bigger":
                (n2 > n1 && n2 > n3)? "n2 is bigger":
                        "n3 is bigger";

        System.out.println("result2 = " + result2);

        System.out.println("--------------------------------------");
        int number = 12;
        String name = "";

        if (number >= 1 && number <= 12){

            name = (number == 1)? "Jan" :(number==2)? "Feb":(number==3)? "Mar":(number==4)? "Apr"
                    :(number==5)? "May" :(number==6)? "Jun":(number==7)? "Jul":(number==8)? "Aug"
                    :(number==9)? "Sep" :(number==10)? "Okt":(number==11)? "Nov" : "Dec";
            // ? 11 and 11 :

        }else{
            name = "Inavalid";
        }
        
    




    }




}
