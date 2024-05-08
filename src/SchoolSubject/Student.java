package RailworldJavaBasics.ObjectCollaboration.SchoolSubject;

public class Student {

    private String name;
    private int age;
    private School school;
    private Subject sub;

    public Student(String name, int age, School school, Subject sub) {
        this.name = name;
        this.age = age;
        this.school = school;
        this.sub = sub;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public School getSchool() {
        return school;
    }

    public Subject getSubject() {
        return sub;
    }

    public void displayStudentData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("School: " + school.getName());
        System.out.println("Subject: " + sub.getName());
    }

}