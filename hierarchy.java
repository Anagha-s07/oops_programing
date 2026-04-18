import java.util.*;

class Publisher {
    String publisherName, agencyName;

    Publisher(String p, String a) {
        publisherName = p;
        agencyName = a;
    }
}

class Book extends Publisher {
    String bookName, author, type;
    int price;

    Book(String p, String a, String b, String au, int pr, String t) {
        super(p, a);
        bookName = b;
        author = au;
        price = pr;
        type = t;
    }

    void display() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("Agency: " + agencyName);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
    }
}

class Literature extends Book {
    Literature(String p, String a, String b, String au, int pr, String t) {
        super(p, a, b, au, pr, t);
    }
}

class Fiction extends Book {
    Fiction(String p, String a, String b, String au, int pr, String t) {
        super(p, a, b, au, pr, t);
    }
}

public class hierarchy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Literature Book Details");
        System.out.print("Book Name: ");
        String b1 = sc.nextLine();
        System.out.print("Author: ");
        String a1 = sc.nextLine();
        System.out.print("Publisher: ");
        String p1 = sc.nextLine();
        System.out.print("Agency: ");
        String ag1 = sc.nextLine();
        System.out.print("Type: ");
        String t1 = sc.nextLine();
        System.out.print("Price: ");
        int pr1 = sc.nextInt();
        sc.nextLine();

        Literature l = new Literature(p1, ag1, b1, a1, pr1, t1);

        System.out.println("\nEnter Fiction Book Details");
        System.out.print("Book Name: ");
        String b2 = sc.nextLine();
        System.out.print("Author: ");
        String a2 = sc.nextLine();
        System.out.print("Publisher: ");
        String p2 = sc.nextLine();
        System.out.print("Agency: ");
        String ag2 = sc.nextLine();
        System.out.print("Type: ");
        String t2 = sc.nextLine();
        System.out.print("Price: ");
        int pr2 = sc.nextInt();

        Fiction f = new Fiction(p2, ag2, b2, a2, pr2, t2);

        System.out.println("\nLiterature Book Details");
        l.display();

        System.out.println("\nFiction Book Details");
        f.display();
    }
}
