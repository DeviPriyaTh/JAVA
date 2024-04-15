public class Polymorphism_Mobile {
    String Manu_Name,color;
    int cost,mobile_size,Model_no,camera_size,memory;

    Polymorphism_Mobile() {
        Manu_Name = null;
        color = null;
        cost = 0;
        mobile_size = 0;
        Model_no = 0;
        camera_size = 0;
        memory = 0;
    }

    Polymorphism_Mobile(int Model_no,String Manu_Name) {
        this.Model_no = Model_no;
        this.Manu_Name = Manu_Name;
    }

    Polymorphism_Mobile(int Model_no,String Manu_Name,int cost) {
        this.Model_no = Model_no;
        this.Manu_Name = Manu_Name;
        this.cost = cost;
    }

    Polymorphism_Mobile(String color,int mobile_size,int camera_size,int memory) {
        this.color = color;
        this.camera_size = camera_size;
        this.mobile_size = mobile_size;
        this.memory = memory;
    }

    public static void main(String a[]) {
        Polymorphism_Mobile pm = new Polymorphism_Mobile();
        Polymorphism_Mobile p1 = new Polymorphism_Mobile(250,"Prem Nath");
        Polymorphism_Mobile p2 = new Polymorphism_Mobile(250,"Prem Nath",2000);
        Polymorphism_Mobile p3 = new Polymorphism_Mobile("Red",250,24,250);
        System.out.println("Model Number: " +p1.Model_no);
        System.out.println("Name "+p2.Manu_Name);
        System.out.println("Colour "+p3.color);
    }
}
