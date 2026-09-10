// public class Mystring{
//     public static void main(String[] args){
//         String name="Thrinath reddy";
//         name="lella";
//         System.out.println(name);
//         //contains chaeck
//         System.out.print(name.contains("lella"));//prints true case senstive

//     }
// }
// import java.util.*;
// public class Mystring{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.println("ENTER A NAME:");
//         String name=input.nextLine();
//         System.out.println(name.charAt(0));
//         System.out.println(name.toUpperCase());//tempory again print name means print normal words
//         System.out.println(name.toLowerCase());
//         //to print revese
//         String reverse="";
//         for(int a=name.length()-1;a>=0;a--){
//             reverse=reverse+name.charAt(a);
//         }
//         System.out.println(reverse);
//         //in string we shouls use name.equals(b);not==
//         //== check memoey adress
//         //name.equals(b) chexk content
//         if(name.equals(reverse)){
//             System.out.println("it is palidrome");
//         }
//         else{
//             System.out.println("it is not palidrome");
//         }
        
//     }
// }
//to check in strings nof voles and constants
// import java.util.*;
// public class Mystring{
//     public static void main(String[] args){
//         Scanner input=new Scanner(System.in);
//         System.out.println("ENETR ANY NAME:");
//         String name=input.nextLine().toLowerCase();
//         int constants=0;
//         int vowels=0;
//         for(int a=0;a<name.length();a++){
//             char ch=name.charAt(a);
//             if(ch>='a'&&ch<='z'){
//             if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//                 constants++;
//             }
//             else{
//                 vowels++;
//             }
//         }
//         }
//         System.out.println(constants);
//         System.out.println(vowels);


        
//     }
// }

// public class Mystring{
//     public static void main(String[] args){
//         StringBuilder sb=new StringBuilder("HELLO");
//         sb.append("java");//it does not create new changed orinal only
//         System.out.println(sb);
//         System.out.println(sb.charAt(3));
//         sb.insert(5,'x');
//         System.out.println(sb);//adds at 5 index x
//         sb.replace(2,5,"reddy");
//         System.out.println(sb);//here from 2 to 4 it removes add reddy 5 is exclude
//         sb.delete(1,5);//deltes from 1 to 4
//         System.out.println(sb);
//         sb.reverse();
//         System.out.println(sb);
//     }
// }
//diference blw string and string boilder
public class Mystring{
    public static void main(String[] args){
        String name="thrinath";
        System.out.println(name+"HELLO");
        System.out.println(name);
        StringBuilder name2=new StringBuilder("thrinath");
        name2.append("hello");
        System.out.println(name2);
        
    }
}