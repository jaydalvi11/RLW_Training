package RailworldJavaBasics.StudentMarksComparison;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Jagjeet", 80);
        Student student2 = new Student("Jay", 90);
        Student student3 = new Student("Swapnil", 80);

        Student.compareMarks(student1, student2);
        Student.compareMarks(student1, student3);
    }

}
