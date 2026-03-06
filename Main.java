import java.util.Scanner;

//ogogdson ugend tom useg too baigaa esehiig shalgah function
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter any:");
        String word = input.nextLine();
        checkWord(word);
        input.close();
    }

    public static boolean checkWord(String word) {
        boolean hasNumber = false;
        boolean hasUpper = false;
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            if (Character.isUpperCase(character)) {
                hasUpper = true;
            }
            if (Character.isDigit(character)) {
                hasNumber = true;
            }

        }
        if (hasNumber == true && hasUpper == true) {
            System.out.println("has upper and number");
        } else if (hasUpper == true) {
            System.out.println("only has upper word");
        } else if (hasNumber == true) {
            System.out.println("only has number");
        } else {
            System.out.println("doesnt has number and upper");
        }
        return hasUpper && hasNumber;
    }
}