import comparable.EmpDetailsUsingComparable;
import comparator.EmpDetails;
import comparator.IdCompare;
import comparator.NameCompare;
import comparator.PhoneCompare;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable_N_Comparator_Test {
    public static void main(String[] args) {

        //Use of Comparable based on ID
        ArrayList<EmpDetailsUsingComparable> list = new ArrayList<>();
        list.add(new EmpDetailsUsingComparable("Sudha", "012345", 10));
        list.add(new EmpDetailsUsingComparable("Abanti", "543210", 5));
        list.add(new EmpDetailsUsingComparable("Zarin", "012345", 35));
        list.add(new EmpDetailsUsingComparable("Pankaj", "012345", 23));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //Use of Comparator
        ArrayList<EmpDetails> list2 = new ArrayList<>();
        list2.add(new EmpDetails("Sudha", "012345", 10));
        list2.add(new EmpDetails("Abanti", "543210", 5));
        list2.add(new EmpDetails("Zarin", "012345", 35));
        list2.add(new EmpDetails("Pankaj", "012345", 23));

        //Original List of data
        System.out.println("Original List of data: " + list2);

        //Sort the list based on ID
        System.out.println("Sorted based on ID");
        list2.sort(new IdCompare());
        System.out.println(list2);

        //Sort the list based on Name
        System.out.println("Sorted based on Name");
        list2.sort(new NameCompare());
        System.out.println(list2);

        //Sort the list based on Phone
        System.out.println("Sorted based on Phone");
        list2.sort(new PhoneCompare());
        System.out.println(list2);
    }

}
