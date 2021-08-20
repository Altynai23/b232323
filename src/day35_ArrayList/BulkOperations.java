package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));



        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,1,2,3,4,5,6,7,8,9);
        list.addAll( numbers );
        list.addAll( Arrays.asList(10, 11, 12, 13, 14, 15) );

        System.out.println(list);

        System.out.println("-----------------------------------------------------------");
        ArrayList<String> students = new ArrayList<>();
        students.addAll( Arrays.asList( "Dilem", "Fhilipp", "Abbos", "Atila", "Ekaterina" ) );

        System.out.println(students);

        students.removeAll( Arrays.asList("Dilem", "Fhilipp", "Abbos") );

        System.out.println(students);


        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll( Arrays.asList(1,1,1,1,2,2,2,2,3,3,3,3,4,5,6,7,8,9,1,1,1,1,1,1,1,1,1,1,1,1) );
        System.out.println(nums);

        // nums.removeAll( Arrays.asList( 1 ) );
        nums.retainAll( Arrays.asList(1,2) ); // remove all the elements that are not matching with 1
        System.out.println(nums);

        System.out.println("---------------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll( Arrays.asList( "Dilem", "Fhilipp", "Abbos", "Ahmet", "Andrei", "Gabil", "Aliya", "Atila" ) );

        System.out.println(employees);

        // employees.removeAll( Arrays.asList( "Ahmet", "Andrei"));
        employees.retainAll( Arrays.asList( "Ahmet", "Andrei"));
        System.out.println(employees);


        System.out.println("-----------------------------------------------");
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water", "Apple", "Cherry", "Coffee") );

        // check if Soda, Wine, Beer all of the are contained in groceryList
        boolean r = groceryList.contains( Arrays.asList("Soda", "Wine", "Beer", "Coffee") );

        System.out.println("r = " + r);




    }


}
