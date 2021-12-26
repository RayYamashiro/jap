import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class prog {

    public static void main(String[] args) {
        int total_count = 46;

        String[] alph = {"a", "i", "u", "e", "o",
                "ka", "ki", "ku", "ke", "ko",
                "sa", "shi", "su", "se", "so",
                "ta", "chi", "tsu", "te", "to",
                "na", "ni", "nu", "ne", "no",
                "ha", "hi", "fu", "he", "ho",
                "ma", "mi", "mu", "me", "mo",
                "ya", "yu", "ye",
                "ra", "ri", "ru", "re", "ro",
                "wa", "wo", "n"
        };
        int flag = 0;
        do
        {
            int temp_number = (int) (Math.random() * total_count - 1);
            System.out.println(alph[temp_number]);
            System.out.println("Еще? ДА -0 , НЕТ -1 ");
            Scanner scanner = new Scanner(System.in);
            flag = scanner.nextInt();
        }while(flag == 0);
    }
}

