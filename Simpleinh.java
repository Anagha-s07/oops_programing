import java.util.Scanner;

class Employee {
    int id, salary;
    String name, address;

    Employee(int id, String name, int salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}

class Teacher extends Employee {
    String dept, subject;

    Teacher(int id, String name, int salary, String address,
            String dept, String subject) {
        super(id, name, salary, address);
        this.dept = dept;
        this.subject = subject;
    }

    void display() {
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + subject);
    }
}

public class Simpleinh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nTeacher " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();

            System.out.print("Address: ");
            String address = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Subject: ");
            String subject = sc.nextLine();

            t[i] = new Teacher(id, name, salary, address, dept, subject);
        }

        System.out.print("\nEnter ID to search: ");
        int search = sc.nextInt();

        for (Teacher teacher : t) {
            if (teacher.id == search) {
                teacher.display();
                sc.close();
                return;
            }
        }

        System.out.println("Employee not found.");
        sc.close();
    }
}

