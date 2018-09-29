package bookc;

import java.util.Scanner;

public class BookC {
    //conditional statements
    public static void cproblem1(){
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input first num: ");
        int n1 = inp.nextInt();
        System.out.println("Input second num: ");
        int n2 = inp.nextInt();
        
        if(n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }else{
            System.out.println(n1 + " is less than " + n2);
        }
    }
    
    public static void cproblem2(){
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input first num: ");
        int n1 = inp.nextInt();
        System.out.println("Input second num: ");
        int n2 = inp.nextInt();
        
        int total = n1 + n2;
        
        if(total % 2 == 0){
            System.out.println( total + " is even.");
        }else{
            System.out.println( total + " is odd.");
        }
    }
    
    public static void cproblem6(){
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input Quiz 1 num: ");
        int q1 = inp.nextInt();
        System.out.println("Input Quiz 2 num: ");
        int q2 = inp.nextInt();
        System.out.println("Input Quiz 3 num: ");
        int q3 = inp.nextInt();
        
        int total = q1+q2+q3;
        int average = total/3;
        
        if(average >= 75){
            System.out.println(average + " You Passed!");
        }else{
            System.out.println(average + " You Failed!");
        }
    }
    
    public static void cproblem7(){
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input amount 1 num: ");
        double a1 = inp.nextDouble();
        System.out.println("Input amount 2 num: ");
        double a2 = inp.nextDouble();
        System.out.println("Input amount 3 num: ");
        double a3 = inp.nextDouble();
        
        double total = a1+a2+a3;
        
        if(total >= 5000){
            System.out.println("You have 15% discount!");
            
            double discount = total * .15;
            double discounted = total - discount;
            
            System.out.println("Your discount is " + discount);
            System.out.println("Your total bill is " + discounted);
        }else{
            System.out.println("The total amount is " + total);
        }
    }
    
    public static void cproblem8(){
        //bug
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input g or G: ");
        String letter = inp.nextLine();
        
        char small = 'g';
        char big = 'G';
        
        if(letter.equals(big)){
            System.out.println(big + " G");
        }else{
            System.out.println(small + " g");
        }
    }
    
    //looping
    
    public static void lproblem1(){
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }
    }
    
    public static void lproblem2(){
        //multi table of 8
        
        int n = 8;
        
        for(int i = 1; i <= 10; i++){
            int prod = n * i;
            System.out.println(i + " x " + n + " = " + prod);
        }
    }
    
    public static void lproblem3(){
        int odd = 0;
        
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
               
            }else{
                odd+=i; 
            }
            
        }System.out.println(odd);
    }
    
    public static void lproblem4(){

        
       
    }
    
    public static void lproblem7(){
        
        int input = 4;
        

        //for row 
        for(int i = 1; i <= input; i++){

            //for s
            for(int j = input; j > i; j--){
                System.out.print(" ");
            }
            //for *
            for(int k = 1; k < i; k++){
                System.out.print("*");
            }
            
            
            
            //for *
            for(int k = 1; k < i; k++){
                System.out.print("*");
            }
            
            //for s
            for(int j = input; j > i; j--){
                System.out.print(" ");
            }
            
            
            System.out.println();
        }
    }
    
    public static void lproblem07(){
        
        
        for(int row = 1; row <= 7; row++){
            
            for(int i = 1; i <= row; i++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
        
        
        
    }
    
    public static void arrayProblem2(){
        Scanner inp = new Scanner(System.in);
        int prod = 1;
        
        //declare the array
        int[] array = new int[5];
        
        //inputting 5 integers
        System.out.println("Enter 5 integer ");
        for(int i = 0; i < array.length; i++){
            array[i] = inp.nextInt();
        }
        
        //multiplying all int inside the array
        for(int i = 0; i < array.length; i++){
            prod = array[i] * prod; 
        }
        System.out.println();
        System.out.println("The product is: " + prod);

        //showing the array
        System.out.println();
        System.out.println("Values of Array: ");
        for(int eleme: array){
            System.out.println(eleme);
        }
    }
    
    public static void arrayProblem3(){
        Scanner inp = new Scanner(System.in);
        int highest = 0;
        int low = 0;

        //declare the array
        int[] array = new int[5];
        
        //inputting 5 integers
        System.out.println("Enter 5 integer ");
        for(int i = 0; i < array.length; i++){
            array[i] = inp.nextInt();
        }
        
        //finding the highest in the list of int
        for(int i = 0; i < array.length; i++){
            for(int j = 1; j < array.length-1; j++){
                if(array[i] > array[j]){
                    highest = array[i];
                }
            }
        }
        System.out.println("The highest number is: " + highest);
        int dif = highest - highest;
        System.out.println("The difference of highest to itself: " + dif);
    }
    
    public static void arrayProblem4(){
        Scanner inp = new Scanner(System.in);        

        //declare an array
        int[] quiz = new int[8];
        
        //inputting elements in array
        System.out.println("Enter quiz grades: ");
        for(int i = 0; i < quiz.length; i++){
            quiz[i] = inp.nextInt();
        }
        
        //displaying quiz elements
        System.out.println();
        System.out.println("Vlues inside the array: ");
        for(int i = 0; i < quiz.length; i++){
            if(quiz[i] >= 88){
                System.out.println(i + " = " + quiz[i]);
            }
            
        }
    }
    
    public static void epp1(){
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int arrCount = inp.nextInt();
        
        //declare an array number
        int[] arr = new int [arrCount];
        
        //input elements
        System.out.println("Input numbers up to " + arrCount + ":");
        for(int i = 0; i < arr.length; i++){
            arr[i] = inp.nextInt();
        }
        
        //displaying array
        System.out.println("Displaying elements...");
        for(int i = 0; i < arr.length; i++){
            if(arrCount == arr[i])
            
            System.out.println(arr[i]);
        }
        
        
        
    }
    
    public static void w3s_52(){
        //declare an array number
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        int even = 0;
        
        //displaying array
        System.out.println("Displaying elements...");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even = arr[i];
                System.out.println(even);
            }else{
                int odd = arr[i];
            }
            
            
        }
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         w3s_52();
    }
    
}
