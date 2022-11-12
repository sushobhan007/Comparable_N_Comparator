import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
    public static void main(String[] args) {
        ArrayList<EmpDetailsUsingComparable> list = new ArrayList<>();
        list.add(new EmpDetailsUsingComparable("Sudha","012345",10));
        list.add(new EmpDetailsUsingComparable("Abanti","543210",5));
        list.add(new EmpDetailsUsingComparable("Zarin","012345",35));
        list.add(new EmpDetailsUsingComparable("Pankaj","012345",23));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }

}
