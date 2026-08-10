// public class Arrays{
//     public static void main(String[] args){
//         String[] cars={"MARUTHI SUZUKI","HYUNDAI","MAHINDRA","TOYATO"};
//         System.out.println(cars[3]);
//         cars[2]="TTT";
//         System.out.println(cars[2]);
//         //to find length of array
//         int len=cars.length;
//         System.out.println(len);
//         System.out.println(cars.length);
//         for(int a=0;a<cars.length;a++){
//             System.out.println(cars[a]);
//         }
    
//     }
// }
//to create array
//1.we only give
//string[] name={"","",""}
//to change name[0]=change;
//2.input from user
//int array[]=new int[n]//n meaNS that many gives space

// import java.util.*;
// public class Arrays{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.print("ENTER HOW MANY NUMBERS:");
//         int num=input.nextInt();
//         int array[]=new int[num];
//         System.out.println("ENTER THE "+num+" NUMBERS :");
//         for(int a=0;a<num;a++){
//             array[a]=input.nextInt();//stores one number
//             System.out.println(array[a]);//prints that number
//         }
//         array[0]=17;
//         System.out.println(array[0]);//we acn chage valuse by index
//         //to find length of array
//         int len=array.length;
//         System.out.println(len);
//     }
// }
// 
//for each
public class Arrays{
    public static void main(String[] args){
        String cars[]={"MARUTHI SUZIKI","HYUNDAI","TOYATO","SKODA"};
        for(String a:cars){//a becomes cars single single word
        System.out.println(a);

        }
    }
}