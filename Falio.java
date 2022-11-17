package Falio;
import java.util.Scanner;
public class Falio {
   
 public  void enter(String number )

   { 
        System.out.print("Enter Marks Obtained in 6 course units: ");

    }
}
   class A extends Falio{
    
    public void enter(){
      float[] marks = new float[6];

      float sum=0;

      Scanner scan = new Scanner(System.in);

      for(int i=0; i<6; i++)

      {
     marks[i]=scan.nextFloat();

     sum += marks[i];

      }

           float avg = sum/6;

      

       if(avg>=80){
System.out.print("A");
         
        }

      else if(avg>=75 && avg<79)
    {
        System.out.println("B+");
        }
      else if(avg>=70 && avg<74)
{
      System.out.print("B");
        }
      else if(avg>=65 && avg<69)
      {
        System.out.println("C+");
        }
      else if(avg>=60 && avg<64)
       {
      System.out.println("C");
        }
      else if(avg>=55 && avg<59)
       {
         System.out.print("D+");
        
        }
      else if(avg>=50 && avg<54)
{
        System.out.println("D");

      }

      else

         {
            System.out.print("F");
            
        }

                

   }

}
class B extends A{
  
    public static void main(String[] args) 
  {
        Falio obj = new Falio();
        A obg = new A();
        obj.enter();
        obg.enter();
    }
}

