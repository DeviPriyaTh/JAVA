package exception_handling;
import java.util.*;
class rangeException extends Exception {
    public rangeException(String str) {
        super(str);
    }
}

class Mark  {
     String stu_Name;
     int marks[] = new int[6];
     static int flag = 0;
     Scanner s = new Scanner(System.in);
     void get_marks(Mark m) throws rangeException {
         System.out.println("Enter the Student Name: ");
         m.stu_Name = s.nextLine();
         System.out.println("Enter the marks of the students: ");
         for(int i = 0;i<6;i++) {
             m.marks[i] = s.nextInt();
                 if (m.marks[i] > 100 || m.marks[i] < 0) {
                     flag = 1;
                     throw new rangeException("Marks are out of range");
                 }

         }
     }
     public static void main(String a[]) throws rangeException {
         Mark m[] = new Mark[5];
         for(int i = 0;i<m.length;i++) m[i] = new Mark();
         for(int i = 0;i<m.length;i++) {
             try {
                 m[i].get_marks(m[i]);
             }
             catch(Exception e) {
                 System.out.println("Exception occured is "+e);
             }
         }
         for(int i = 0;i<m.length;i++) {
             System.out.println("Enter Name: "+m[i].stu_Name);
             System.out.println("Marks of the students: ");
             if(m[i].flag == 0) {
                 System.out.println("Invalid Marks"); break;
             }
             for(int j = 0;j<6;j++) System.out.println(m[i].marks[j]);
         }
     }
 }
