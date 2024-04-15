import java.io.*;
import java.util.*;
public class Odd_and_Even {
    void write_master(String filename) {
        try {
            FileWriter fr = new FileWriter(filename);
            System.out.println("Enter the numbers to be stored in a file");
            int n;
            Scanner s = new Scanner(System.in);
            for(int i = 0;i<10;i++) {
                n = s.nextInt();
                fr.write(n);
            } fr.close();
        } catch(Exception e) {
            System.out.println("Exception occured : " +e);
        }
    }

    void write_odd_even(String master,String odd,String even) {
        try {
        FileReader fr = new FileReader(master);
        FileWriter o = new FileWriter(odd);
        FileWriter e = new FileWriter(even);
        int i;
        while((i=fr.read()) != -1) {
            if((int)i%2 == 0) {
                e.write((int)i);
            }
            else {
                o.write((int)i);
            }
        } o.close(); e.close(); fr.close();1

    } catch(Exception e) {
            System.out.println("Exception occured " + e);
        }

}
    public static void main(String a[]) {
         String master = "master.txt";
         String one = "one.txt";
         String two = "two.txt";
         Odd_and_Even oe = new Odd_and_Even();
         oe.write_master(master);
         oe.write_odd_even(master,one,two);
         try {
         FileReader fr1 = new FileReader(one);
         FileReader fr2 = new FileReader(two);
         int i;
         System.out.println("Contents in Odd file: ");
         while((i = fr1.read()) != -1) System.out.print((int)i+" ");
         System.out.println("Contents in even file: ");
         while((i = fr2.read()) != -1) System.out.print((int)i+" ");
    }
         catch(Exception e) {
             System.out.println("Exception is: "+e);
         }
}}