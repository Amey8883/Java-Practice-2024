import java.util.Scanner;

class EmployeeManagementSystem {
    static String eName;
    static int eId;
    static String eRole;
    static double eSal;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome ***");
        System.out.println();
        for (; ; ) {
            System.out.println("FEATURES ****");
            System.out.println("1.Add new Employee");
            System.out.println("2.View Employee");
            System.out.println("3.Edit Employee");
            System.out.println("4.Exit");
            System.out.println();
            System.out.print("Enter an option: ");
            int opt = sc.nextInt();
            sc.nextLine(); // Consume newline character
            switch (opt) {
                case 1: {
                    addNewEmployee();
                    break;
                }
                case 2: {
                    System.out.print("Enter Employee Id: ");
                    int eid = sc.nextInt();
                    viewEmployee(eid);
                    break;
                }
                case 3: {
                    editEmployee();
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Incorrect Option");
                }
            }
        }
    }

    public static void addNewEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("** Enter New Employee Data **");
        System.out.print("Employee Name: ");
        eName = sc.nextLine();
        System.out.print("Employee Id: ");
        eId = sc.nextInt();
        sc.nextLine(); // Consume newline character
        System.out.print("Employee Role: ");
        eRole = sc.nextLine();
        System.out.print("Employee salary: ");
        eSal = sc.nextDouble();
    }

    public static void viewEmployee(int eid1) {
        if (eId == eid1) {
            System.out.println("Employee data");
            System.out.println("Name: " + eName);
            System.out.println("eid: " + eId);
            System.out.println("erole: " + eRole);
            System.out.println("esal: " + eSal);
            System.out.println();
        }
    }

    public static void editEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Edit employee details ***");
        System.out.println("1.Name");
        System.out.println("2.Salary");
        System.out.println("3.Role");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume newline character

        switch (choice) {
            case 1: {
                eName();
                break;
            }
            case 2: {
                uSalary();
                break;
            }
            case 3: {
                uRole();
                break;
            }
            default: {
                System.out.println("Incorrect option: ");
            }
        }
    }

    public static void eName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("****Edit your name****");
        System.out.print("Enter updating name: ");
        eName = sc.nextLine();
    }

    public static void uSalary() {
        Scanner sc = new Scanner(System.in);
        System.out.print("**** Edit your Sal: ");
        System.out.print("Enter updating Salary: ");
        eSal = sc.nextDouble();
    }

    public static void uRole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("*** Edit your Role");
        System.out.print("Enter your updating Role: ");
        eRole = sc.nextLine();
    }
}
























































































