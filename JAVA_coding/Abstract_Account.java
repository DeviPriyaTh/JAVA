import java.util.*;

abstract class Abstract_Account {
    int cus_id;
    int amount;

    abstract int deposit(SavingsAccount a[],int id);
    abstract int withdraw(SavingsAccount a[],int id);
}

class SavingsAccount extends Abstract_Account {
    Scanner s = new Scanner(System.in);
    int money;
    int deposit(SavingsAccount a[],int acc_id) {
        System.out.println("Enter the amount to be deposited: ");
        money = s.nextInt();
        for(int i = 0;i<a.length;i++) {
            if(a[i].cus_id == acc_id) {
                a[i].amount += money;
                return a[i].amount;
            }
        }
        return -1;
    }

    int withdraw(SavingsAccount a[], int acc_id) {
        System.out.println("Enter the amount to be Withdrawn: ");
        money = s.nextInt();
        for(int i = 0;i<a.length;i++) {
            if(a[i].cus_id == acc_id) {
                if(a[i].amount > 0) a[i].amount -= money;
                else return 0;
                return a[i].amount;
            }
        }
        return -1;
    }

}

class main_inherit {
     public static void main(String ars[]) {
         int id;
         SavingsAccount s[] = new SavingsAccount[5];
         for(int i = 0;i<s.length;i++) s[i] = new SavingsAccount();
         Scanner sc = new Scanner(System.in);
         for(int i = 0;i<s.length;i++) {
             System.out.println("Enter id: ");
             s[i].cus_id = sc.nextInt();
             System.out.println("Amount: ");
             s[i].amount = sc.nextInt();
         }
         SavingsAccount sav = new SavingsAccount();
         System.out.println("Enter the Id to deposit: ");
         id = sc.nextInt();
         System.out.println("New Savings is " +sav.deposit(s,id));
         System.out.println("Enter the Id to withdrawn: ");
         id = sc.nextInt();
         System.out.println("New Savings is "+sav.withdraw(s,id));
     }
}
