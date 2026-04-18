import java.util.*;

interface Sports {
    void sportsGetData(Scanner sc);
    void sportsDisData();
}

class Student {
    String name;
    int roll;
    double s1, s2;

    Student(String n, int r, double a, double b) {
        name = n;
        roll = r;
        s1 = a;
        s2 = b;
    }
}

class Result extends Student implements Sports {
    String item;
    int rank;

    Result(String n, int r, double a, double b) {
        super(n, r, a, b);
    }

    void academic() {
        double per = (s1 + s2) / 2;
        System.out.println("Academic Percentage: " + per);
    }

    public void sportsGetData(Scanner sc) {
        sc.nextLine();   // clear buffer
        System.out.print("Enter Sports Item: ");
        item = sc.nextLine();
        System.out.print("Enter Rank: ");
        rank = sc.nextInt();
    }

    public void sportsDisData() {
        System.out.println("Sports Item: " + item);
        System.out.println("Rank: " + rank);
    }
}

class multiple {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Roll No: ");
        int roll = sc.nextInt();

        System.out.print("Score1: ");
        double s1 = sc.nextDouble();

        System.out.print("Score2: ");
        double s2 = sc.nextDouble();

        Result r = new Result(name, roll, s1, s2);

        r.sportsGetData(sc);
        r.academic();
        r.sportsDisData();
    }
}

