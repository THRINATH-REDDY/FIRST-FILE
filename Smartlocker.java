import java.util.*;
public class Smartlocker{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Random ran=new Random();
        int otp=0;
        
        
        
        int time=0;
        String name="";
        String pid="";
        
        
        boolean lockerstatus=true;
        while(true){
            System.out.println("============SMART LOCKER SYSTEM============\n1.STORE PARCEL\n2.RETRIVE PARCEL\n3.LOCKER STATUS\n4.EXIT");
            System.out.println("ENTER YOUR CHOICE:");
            int choice=input.nextInt();
            input.nextLine();
            switch(choice){
                case 1:
                    if(lockerstatus){
                        System.out.println("___---STORE PARCEL---___");
                        System.out.println("ENTER YOUR NAME:");
                        name=input.nextLine();
                        
                        
                        System.out.println("ENTER YOUR PARCEL ID:");
                        pid=input.nextLine();
                        System.out.println("ENTER THE DEPOSITING TIME[0-23]");
                        time=input.nextInt();
                        input.nextLine();
                         otp=1000+ran.nextInt(9000);
                        System.out.println("YOUR OTP[ONE TIME PASSWORD] IS  "+(otp)+"  DONT SHARE WITH OTHERS");
                        lockerstatus=false;
                    }
                    else{
                        System.out.println("_____SORRY LOCKER IS NOT EMPTY YOU CAN STORE PARCEL WHEN EMPTY_____ ");
                    }break;
                case 2:
                    System.out.println("___---RETRIVING---___");
                    System.out.println("ENTER YOUR OTP:");
                    int otp2=input.nextInt();
                    if(otp2==otp){
                        System.out.println("OTP IS CORRECT:");
                        System.out.println("ENTER THE PRESENT TIMING[0-23]:");
                        int time2=input.nextInt();
                        input.nextLine();
                        System.out.println("THE PARCEL IS COLLECTED BY:"+name+"\nPARCEL ID:"+(pid)+"\nPARCEL IS STORED FOR:"+(time2-time)+"HOURS");
                        lockerstatus=true;
                    }
                    else{
                        System.out.println("-----_____INVALID OTP_____------");
                    }break;
                case 3:
                    System.out.println("=======LOCKER ENQUIRY=======");
                    if(lockerstatus){
                        System.out.println("====LOCKER IS EMPTY YOU CAN STORE PARCELS===");

                    }
                    else{
                        System.out.println("===SORRY!!! LOCKER IS NOT EMPTY TRY AGAIN LATER===");
                    }break;
                case 4:
                    System.exit(0);break;
                default:
                    System.out.println("====INVALID OPTION CHOOSED====");
                    break;
                

                    


                

            }
        }



    }
}