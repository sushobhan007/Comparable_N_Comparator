package comparator;

import java.util.Comparator;

public class IdCompare implements Comparator<EmpDetails> {
    @Override
    public int compare(EmpDetails o1, EmpDetails o2) {
        return o1.getEmpID() - o2.getEmpID();
    }
}
