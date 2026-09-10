// import java.util.*;
// public class Twodarray{
// public static void main(String[] args){
//     Scanner input=new Scanner(System.in);
//     System.out.println("ENTER THE NUMBER OF STUDENTS:");
//     int students=input.nextInt();
//     System.out.println("ENTER THE NUMBER OF SUBJECTS:");
//     int marks=input.nextInt();
//     System.out.println("ENTER THE MARKS OF STUDENT:");
//     int array[][]=new int[students][marks];
//     for(int a=0;a<students;a++){
//         for(int b=0;b<marks;b++){
//             array[a][b]=input.nextInt();
//         }
//     }
//     for(int a=0;a<students;a++){
//         for(int b=0;b<marks;b++){
//             System.out.print(array[a][b]+" ");
            
//         }
//         System.out.println("");
//     }
// }

// }
import java.util.*;
public class Twodarray{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
    System.out.println("ENTER NUMBER OF ROWS:");
    int rows=input.nextInt();
    System.out.println("ENTER THE NUMBER OF COLOUMS:");
    int coloums=input.nextInt();
    int matrix[][]=new int[rows][coloums];
    System.out.println("ENTER THE ELEMENTS:");
    for(int a=0;a<rows;a++){
        for(int b=0;b<coloums;b++){
            matrix[a][b]=input.nextInt();
        }
    
    }
    
    for(int a=0;a<rows;a++){
        for(int b=0;b<coloums;b++){
            System.out.print(matrix[a][b]+" ");
        }
        System.out.println("");
    }





    }
}