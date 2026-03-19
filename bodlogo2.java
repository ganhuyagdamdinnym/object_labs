import java.util.Scanner;

public class bodlogo2 {

    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.print("enter text");
        String text=input.nextLine();

        text= text.replaceAll(" +", ",");

        boolean lastWasSpace=false;
        String newWord="";
        for(int i=0;i<text.length();i++){
            char ch =text.charAt(i);
            if(ch ==' '){
                if(lastWasSpace==false){
                   newWord=newWord+",";
                   lastWasSpace=true;
                }
            }else{
                newWord=newWord+ch;
            }
        }
        System.out.print(text);
        input.close();
    }
}