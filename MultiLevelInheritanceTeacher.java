class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;
    String course;

    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayStudent() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class CollegeStudent extends Student {
    String collegeName;
    int year;

    CollegeStudent(String name, int age, int rollNo, String course, String collegeName, int year) {
        super(name, age, rollNo, course);
        this.collegeName = collegeName;
        this.year = year;
    }

    void displayCollegeStudent() {
        super.displayStudent();
        System.out.println("College Name: " + collegeName);
        System.out.println("Year: " + year);
    }
}

public class MultiLevelInheritanceTeacher {
    public static void main(String[] args) {
        CollegeStudent collegeStudent = new CollegeStudent("Alice", 20, 101, "Engineering", "ABC College", 2);
        collegeStudent.displayCollegeStudent();
    }
}