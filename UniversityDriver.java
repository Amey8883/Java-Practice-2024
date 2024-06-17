class University {
    String name;
    String unicode;
    long noOfColleges;
    String type;
    int establishYear;
    int course;
    College college1;

    University(String name, String unicode, long noOfColleges, String type, int establishYear, int course) {
        this.name = name;
        this.unicode = unicode;
        this.noOfColleges = noOfColleges;
        this.type = type;
        this.establishYear = establishYear;
        this.course = course;
    }

    void displayUniversity() {
        System.out.println("**** UNIVERSITY ****");
        System.out.println("name: " + name);
        System.out.println("unicode: " + unicode);
        System.out.println("noOfColleges: " + noOfColleges);
        System.out.println("type: " + type);
        System.out.println("establishYear: " + establishYear);
        System.out.println("course: " + course);
    }

    void createInstanceOfCollege(String name, String collegeCode, String address, int noOfDepartment, char grade, int staffCount) {
        college1 = new College(name, collegeCode, address, noOfDepartment, grade, staffCount);
    }
}

class College {
    String name;
    String collegeCode;
    String address;
    int noOfDepartment;
    char grade;
    int staffCount;
    Department department;

    College(String name, String collegeCode, String address, int noOfDepartment, char grade, int staffCount) {
        this.name = name;
        this.collegeCode = collegeCode;
        this.address = address;
        this.noOfDepartment = noOfDepartment;
        this.grade = grade;
        this.staffCount = staffCount;
    }

    void displayCollege() {
        System.out.println("**** COLLEGE ****");
        System.out.println("name: " + name);
        System.out.println("collegeCode: " + collegeCode);
        System.out.println("address: " + address);
        System.out.println("noOfDepartment: " + noOfDepartment);
        System.out.println("grade: " + grade);
        System.out.println("staffCount: " + staffCount);
    }

    void createInstanceOfDepartment(String name, String hod, int classroom, int staff, String subject) {
        department = new Department(name, hod, classroom, staff, subject);
    }
}

class Department {
    String name;
    String hod;
    int classroom;
    int staff;
    String subject;
    Teacher teacher;

    Department(String name, String hod, int classroom, int staff, String subject) {
        this.name = name;
        this.hod = hod;
        this.classroom = classroom;
        this.staff = staff;
        this.subject = subject;
    }

    void displayDepartment() {
        System.out.println("**** DEPARTMENT ****");
        System.out.println("name: " + name);
        System.out.println("HOD: " + hod);
        System.out.println("Classroom: " + classroom);
        System.out.println("staff: " + staff);
        System.out.println("subject: " + subject);
    }

    void createInstanceOfTeacher(String name, String subject, long phoneNumber, String qualification, double experience) {
        teacher = new Teacher(name, subject, phoneNumber, qualification, experience);
    }
}

class Teacher {
    String name;
    String subject;
    long phoneNumber;
    String qualification;
    double experience;

    Teacher(String name, String subject, long phoneNumber, String qualification, double experience) {
        this.name = name;
        this.subject = subject;
        this.phoneNumber = phoneNumber;
        this.qualification = qualification;
        this.experience = experience;
    }

    void displayTeacher() {
        System.out.println("**** TEACHER ****");
        System.out.println("name: " + name);
        System.out.println("subject: " + subject);
        System.out.println("phoneNumber: " + phoneNumber);
        System.out.println("qualification: " + qualification);
        System.out.println("experience: " + experience);
    }
}

class UniversityDriver {
    public static void main(String[] args) {
        University obj = new University("SPPU", "ABC120", 250, "Goverment", 1950, 100);
        obj.displayUniversity();
        obj.createInstanceOfCollege("Modern College", "MCA6764", "Shivajinagar,Pune.", 10, 'A', 100);
        obj.college1.displayCollege();
        obj.college1.createInstanceOfDepartment("MCA", "Ghuge", 8, 8, "48");
        obj.college1.department.displayDepartment();
        obj.college1.department.createInstanceOfTeacher("Sudarshan", "Java", 8765432123L, "MTECH", 5.5);
        obj.college1.department.teacher.displayTeacher();
    }
}