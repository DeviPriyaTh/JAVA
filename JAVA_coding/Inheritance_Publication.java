import java.util.Scanner;
public class Inheritance_Publication {
    String Bk_name;
    int cost;
    Scanner s = new Scanner(System.in);

    void get_data() {
        System.out.println("\nEnter the name of the publication: ");
        Bk_name = s.nextLine();
        System.out.println("\nEnter the cost: ");
        cost = s.nextInt();
    }

    void put_data() {
        System.out.println("Name: "+Bk_name);
        System.out.println("Cost: "+cost);
    }
}

class book extends Inheritance_Publication {
    int pg_count;
    void get_data() {
        System.out.println("\nEnter the number of pages: ");
        pg_count = s.nextInt();
    }

    void put_data() {
        System.out.println("Pages is: "+pg_count);
    }
}

class tape extends Inheritance_Publication {
    int playing_time;
    void get_data() {
        System.out.println("\nEnter the playing time: ");
        playing_time = s.nextInt();
    }

    void put_data() {
        System.out.println("Playing time is: "+playing_time);
    }
}

class main_cls {
    public static void main(String a[]) {
        Inheritance_Publication i = new Inheritance_Publication();
        Inheritance_Publication i1 = new book();
        Inheritance_Publication i2 = new tape();
        i.get_data();
        i1.get_data();
        i2.get_data();
        i.put_data();
        i1.put_data();
        i2.put_data();

    }
}
