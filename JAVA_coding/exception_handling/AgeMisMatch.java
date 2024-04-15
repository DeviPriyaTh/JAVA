import java.util.Scanner;

class AgeMisMatchException extends Exception {
    public AgeMisMatchException(String str) {
        super(str);
    }
}
public class AgeMisMatch {
    Scanner s = new Scanner(System.in);
    int emp_id;
    String emp_name;
    int age;
     void addEmployee(AgeMisMatch a) throws AgeMisMatchException {
        System.out.println("Enter the employee id: ");
        a.emp_id = s.nextInt();
        s.nextLine();
        System.out.println("Enter the employee name: ");
        a.emp_name = s.nextLine();
        System.out.println("Enter the age of the employee: ");
        a.age = s.nextInt();
        if(a.age < 18) throw new AgeMisMatchException("Age under 18 is not eligible");
    }

     public static void main(String ar[]) throws AgeMisMatchException {
         AgeMisMatch a[] = new AgeMisMatch[3];
         for(int i = 0;i<a.length;i++) a[i] = new AgeMisMatch();
         for(int i = 0;i<a.length;i++) try {
             a[i].addEmployee(a[i]); }
         catch(Exception e) {
             System.out.println("Exception occured");
         }
         for(int i = 0;i<a.length;i++) {
             if(a[i].age < 18) {
                 System.out.println("Person under age 18");
                 break;
             }
             System.out.println("Name: "+a[i].emp_name);
             System.out.println("ID: " +a[i].emp_id);
             System.out.println("Age: "+a[i].age);
         }
     }
}
