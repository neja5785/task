package clean;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    @Override
    public String readUserInput() {
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }
}
