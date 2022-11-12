package comparator;

import java.util.Comparator;

public class NameCompare implements Comparator<EmpDetails> {
    @Override
    public int compare(EmpDetails o1, EmpDetails o2) {
        return o1.getEmpName().compareTo(o2.getEmpName());
    }
}
