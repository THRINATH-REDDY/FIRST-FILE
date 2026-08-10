import java.util.*;
public class First{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("ENTER YOUR NAME:");
        String name=input.nextLine();
        System.out.println(" ENTER B.TECH COURSE YOU HAVE BEEN SELECTED:\n1.CSE\n2.AI&DS\n3.CSIT\n4.ECE");
        System.out.print("CHOOSE YOUR OPTION:");
        int opt=input.nextInt();
        input.nextLine();
        
        System.out.println("ENTER YOUR FEES CONCESSION PERCENTAGE:");
        
        int cfee=input.nextInt();
        
        System.out.print("ENTER THE FEES AMOUNT YOU PAID:");
        int pfees=input.nextInt();
        int a=330000*cfee/100;
        int b=300000*cfee/100;
        int c=285000*cfee/100;
        int due1=330000-a-pfees;
        int due2=300000-b-pfees;
        int due3=285000-c-pfees;
        
        switch(opt){
            case 1:
                System.out.println("NAME:"+name);
                System.out.println("COURSE:CSE");
                System.out.println("FEES PAID:"+pfees);
                System.out.println("FEES CONSESION:"+cfee+"%");
                System.out.println("CONCESSION FEES IN AMOUNT:"+a);
                System.out.println("FEES DUE:"+due1);
                break;
            case 2:System.out.println("NAME:"+name);
                System.out.println("COURSE:AI&DS");
                System.out.println("FEES PAID:"+pfees);
                System.out.println("FEES CONSESION:"+cfee+"%");
                System.out.println("CONCESSION FEES IN AMOUNT:"+a);
                System.out.println("FEES DUE:"+due1);
                break;
            case 3:
                System.out.println("NAME:"+name);
                System.out.println("COURSE:CSIT");
                System.out.println("FEES PAID:"+pfees);
                System.out.println("FEES CONSESION:"+cfee+"%");
                System.out.println("CONCESSION FEES IN AMOUNT:"+b);
                System.out.println("FEES DUE:"+due2);
                break;
            case 4:
                System.out.println("NAME:"+name);
                System.out.println("COURSE:ECE");
                System.out.println("FEES PAID:"+pfees);
                System.out.println("FEES CONSESION:"+cfee+"%");
                System.out.println("CONCESSION FEES IN AMOUNT:"+a);
                System.out.println("FEES DUE:"+due3);
                break;

        }
        

    }
}