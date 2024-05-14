package RailworldJavaBasics.StudentMarksComparison;

public class Student implements Comparable<Student>{
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public int compareTo(Student other) {
        return Integer.compare(this.marks, other.marks);
    }

    public static void compareMarks(Student student1, Student student2) {
        int comparison = student1.compareTo(student2);
        if (comparison > 0) {
            System.out.println(student1.name + " marks are higher.");
        } else if (comparison < 0) {
            System.out.println(student2.name + " marks are higher.");
        } else {
            System.out.println("Students with equal marks: " + student1.name + " and " + student2.name);
        }
    }

}
