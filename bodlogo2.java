import java.util.Scanner;

public class bodlogo2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String word = input.nextLine();

        // word = word.replaceAll(" +", ",");
        // word = word.replace(" ", ",");

        String result = "";

        boolean lastWasSpace = false;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch == ' ') {
                if (!lastWasSpace) {
                    result += ",";
                    lastWasSpace = true;
                }
                // хэрвээ дараагийн space бол нэмэхгүй
            } else {
                result += ch; // space биш тэмдэгтээ шууд нэмнэ
                lastWasSpace = false;
            }
        }

        System.out.println("Result: " + result);
        input.close();
    }
}