import java.util.*;

class Person {
    String name, gender, address;
    int age;

    Person(String n, String g, String a, int ag) {
        name = n; gender = g; address = a; age = ag;
    }
}

class Employee extends Person {
    int empid, salary;
    String compname, qualifn;

    Employee(String n, String g, String a, int ag, int id, String c, String q, int s) {
        super(n, g, a, ag);
        empid = id; compname = c; qualifn = q; salary = s;
    }
}

class Teacher extends Employee {
    String subject, dept;
    int teacherid;

    Teacher(String n, String g, String a, int ag, int id, String c, String q, int s,
            String sub, String d, int tid) {
        super(n, g, a, ag, id, c, q, s);
        subject = sub; dept = d; teacherid = tid;
    }

    void display() {
        System.out.println("\nName: " + name + "\nGender: " + gender +
        "\nAddress: " + address + "\nAge: " + age +
        "\nEmpID: " + empid + "\nCompany: " + compname +
        "\nQualification: " + qualifn + "\nSalary: " + salary +
        "\nSubject: " + subject + "\nDept: " + dept +
        "\nTeacherID: " + teacherid);
    }
}

class multi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = in.nextInt();
        in.nextLine();

        Teacher[] t = new Teacher[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details:");

            System.out.print("Name: "); String name = in.nextLine();
            System.out.print("Gender: "); String gender = in.nextLine();
            System.out.print("Address: "); String address = in.nextLine();
            System.out.print("Age: "); int age = in.nextInt();

            System.out.print("EmpID: "); int empid = in.nextInt();
            in.nextLine();

            System.out.print("Company: "); String comp = in.nextLine();
            System.out.print("Qualification: "); String q = in.nextLine();
            System.out.print("Salary: "); int sal = in.nextInt();
            in.nextLine();

            System.out.print("Subject: "); String sub = in.nextLine();
            System.out.print("Dept: "); String dep = in.nextLine();
            System.out.print("TeacherID: "); int tid = in.nextInt();
            in.nextLine();

            t[i] = new Teacher(name, gender, address, age, empid, comp, q, sal, sub, dep, tid);
            
        }
        System.out.print("\n\n\n\nTeacher Details : ");
        for (int i = 0; i < n; i++) {
        t[i].display();
        System.out.println();
        }
        in.close();
    }
}

