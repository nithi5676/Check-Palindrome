package checkPalindrome;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String aplString = scanner.next();
        int start = 0, end = aplString.length() - 1;
        scanner.close();
        System.out.println(check(aplString, start, end));
    }

    public static int check(String aplString, int start, int end) {
        if (start > end) {
            return 1;
        }
        if (aplString.charAt(start) != aplString.charAt(end)) {
            return 0;
        }
        return check(aplString, start + 1, end - 1);
    }

}
