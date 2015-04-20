package collections.comparable;

import java.util.Comparator;

public class CGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.cgpa.compareTo(o2.cgpa));
    }
}
