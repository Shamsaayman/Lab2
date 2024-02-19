import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
/////////////////////NUMBER 1 ///////////////////////////////////////
//        String [] names = {"cat" , "dog", "red" , "is" , "am"};
//        checkstring(names) ;
/////////////////////NUMBER 2 ///////////////////////////////////////
//        int [] numbers = {1,1,1,3,3,5};
//        count(numbers , 9);
/////////////////////NUMBER 3 ///////////////////////////////////////
//        Integer [] numbers = {1,4,17,7,25,3,100};
//       findelement(numbers,4);
/////////////////////NUMBER 4 ///////////////////////////////////////
//        int [] numbers = {5,4,3,2,1};
//        reverse(numbers);
/////////////////////NUMBER 5 ///////////////////////////////////////
//        while (true) {
//            System.out.println("\n*** Menu ***");
//       System.out.println("1. Accept elements of an array");
//       System.out.println("2. Display elements of an array");
//       System.out.println("3. Search the element within array");
//       System.out.println("4. Sort the array");
//       System.out.println("5. To stop");
//       System.out.println("Enter Number");
//       System.out.print("Enter your choice: ");
//       int choice = s.nextInt();
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter the number of elements you want to store: ");
//                    int numElements= s.nextInt();
//                    int[] array = new int[numElements];
//                    break;
//                case 2:
//                    System.out.println("Enter the elements of the array:");
//                    for (int i = 0; i < numElements; i++) {
//                        array[i] = s.nextInt();
//                    }
//                    System.out.println("Array elements are:");
//                    for (int i = 0; i < numElements; i++) {
//                        System.out.println(array[i]);
//                    }
//                    break;
//                case 3:
//                    System.out.print("Enter element you want to find");
//                    int index = s.nextInt();
//                    for(int i=0;i<array.length;i++){
//                        if(array[i] == index){
//                            System.out.print(i);}
//                        }
//
//                        break;
//                case 4:
//                 Arrays.sort(array);
//                    System.out.println("The sorted array is: ");
//                    for (int num : array) {
//                        System.out.print(num + " ");
//                    }
//                    break;
//                case 5:
//                    System.out.println("End");
//                    System.exit(0);
//            }
//        }
    }

/////////////////////NUMBER 6 ///////////////////////////////////////
//        System.out.println("Enter the minimum value of the range");
//        int r1 = s.nextInt();
//        System.out.println("Enter the maximum value of the range:");
//        int r2 = s.nextInt();
//        System.out.println("Enter the number of random values to generate");
//        int n = s.nextInt();
//        generaterandom(n, r1,r2);


/////////////////////NUMBER 7///////////////////////////////////////
//        System.out.println("Enter password");
//        String pass = s.next();
//        int score = checkcase(pass)+checklength(pass)+checkspecialcharacter(pass);
//        if (score>7){
//            System.out.println("Strong Password");
//        }
//        else if (score>4){
//            System.out.println("Moderately Strong Password");
//        }
//        else{
//            System.out.println("Weak Password");
//        }

 /////////////////////NUMBER 8///////////////////////////////////////
//        System.out.println("Enter Number");
//       int num = s.nextInt();
//       Fibonacci(num);




    ////NUMBER8////
   public static void Fibonacci(int n){
        int num1 = 0;
        int num2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
    ////NUMBER7////
    public static int checklength(String s){
        int score;
      if (s.length()<6){
          score=0;
      }
      else if (s.length()==6 || s.length()==7){
          score =2;
      }
      else{
          score=3;
        }
      return score;
    }
    ////NUMBER7////
    public static int checkspecialcharacter(String s){
        int score;
        String regex =  "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,8}$";

        if (s.contains(regex)){
            score = 2;
        }
        else{
            score=0;
        }
        return score;
    }
    ////NUMBER7////
    public static int checkcase (String s){
        int score=0;
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isUpperCase(s.charAt(i)));{
            score=3;}
        }


       return score;

    }


    ////NUMBER6////
public static void generaterandom (int n , int min , int max){
    for (int i = 0; i < n; i++) {
        System.out.println((int)( Math.random()* (max-min) + min));
    }
}


    ////NUMBER4////
    public static void reverse(int [] arr ){
        int[]rev = new int[arr.length];
        int l = arr.length;
        for (int i = 0; i <arr.length; i++) {
            rev[l-1] = arr[i];
           l= l-1;
        }
        System.out.println("Reversed Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(rev[i] + " ");
        }
    }

    ////NUMBER3////
    public static void findelement ( Integer[]num ,  int x){
        Arrays.sort(num, Collections.reverseOrder());
        for ( int i = 0; i < x; i++) {
            System.out.println(num[i]);
        }
    }


    ////NUMBER2////
    public static int count ( int[]num ,  int x){
        int count = 0 ;
        for (int i = 0; i < num.length; i++)
            if(x==num[i])
                count++;
        System.out.println(x + " occurs " + count + " times" );
        return count;

    }


    ////NUMBER1////
    public static String checkstring (String[] str){
        int max = 0 ;
        String longest = null ;
        for(String s : str){
            if(s.length()>=max){
                max=s.length();
                longest=s;
                System.out.println(longest);
            }
        }
        return longest;
    }
}