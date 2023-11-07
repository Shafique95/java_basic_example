package main.java.com.safiq.java_code_gym_practice;

public class Home {
    int a ;
    int b;
    public static void main(String[] args){
        System.out.println("Hello Code Jym I am here what do you want todo tell me ");
        System.out.println(getPi());
        System.out.print("Amigo");
        System.out.print(" is");
        System.out.print(" the");
        System.out.print(" best\n");
        System.out.println(getQubeOfANumber(4));
        System.out.println("My name is Amigo");
        System.out.println("I agree to wages of $5000/month in the \n first year.");
        System.out.println("If you feel like it , do the task . if you don't feel like it , do it anyway");
    }
    static double  getPi(){
        return 3.1414;
    }

   static  double getQubeOfANumber(int x){
        return Math.pow(x, 3);
     }
     int x=2;
     int y=4;
     int z=x +y;
     int m=x-3+y-x;
}
