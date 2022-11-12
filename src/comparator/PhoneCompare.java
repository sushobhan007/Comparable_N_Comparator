package comparator;

import java.util.Comparator;

public class PhoneCompare implements Comparator<EmpDetails> {
    @Override
    public int compare(EmpDetails o1, EmpDetails o2) {
        return o1.getPhone().compareTo(o2.getPhone());
    }
}
