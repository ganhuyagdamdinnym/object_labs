import java.util.Scanner;


public class Main {

    public static void main(String[] args){
    Boolean hasUpper=false;
        Boolean hasNumber=false;
        Scanner input=new Scanner(System.in);
        System.out.print("enter any");

        String word=input.nextLine();
         
        for(int i=0; i<word.length();i++){
          char ch= word.charAt(i);
          if(Character.isDigit(ch)){
            hasNumber=true;
          }else if(Character.isUpperCase(ch)){
            hasUpper=true;
          }
        }

        if(hasNumber==true&& hasUpper==true){
            System.out.print("has number and Upper ");
        }else if(hasNumber==true){
            System.out.print("only number");
        }else if(hasNumber==true){
            System.out.print("only upper");
        }else{
            System.out.print("doesnt has any");
        }
        input.close();
    }
}

