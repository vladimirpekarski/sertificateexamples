package collections.comparable;

public class Student implements Comparable<Student> {
    String id;
    String name;
    Double cgpa;

    public Student(String id, String name, Double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return " \n " + id + " \t " + name + " \t " + cgpa;
    }

    @Override
    public int compareTo(Student that) {
        return this.id.compareTo(that.id);
    }
}
