import java.util.Scanner;

public class SubtractionQuiz{

   public static void main(String[] args){
   
   int number1 = (int)(Math.random() *1000);
   int number2 = (int)(Math.random() *1000);
   
   
   	if ( number1 <= number2){
       System.out.printf("%d - %d = ", number2, number1 );  
   }
   
  	if (number1 > number2){
   System.out.printf("what is  %d - %d = ", number1, number2 );
   }
   	Scanner input = new Scanner (System.in);
   int response = input.nextInt();
   
   if ((number1 > number2) && ((number1 - number2) == response)){
   System.out.printf("your answer is correct %n ") ;
   }
   
   if ((number1 > number2) && ((number1 - number2) != response)){
   System.out.printf("your answer is not correct, %nThe correct answer is: %d%n", number1 - number2) ;
   }
   
   if ((number1 <= number2) && ((number2 - number1) == response)){
   System.out.printf("your answer is correct %n ") ;
     }
     
     if ((number1 <= number2) && ((number2 - number1) != response)) { 
   System.out.printf("your answer is not correct, %nThe correct answer is: %d%n", number2 - number1);
   }
 
   }
}
