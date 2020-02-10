package clean;

public class Calculator {
    public void calculate() {
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();
        boolean loop = true;
        while (loop) {
            System.out.print(">");
            loop = Parser.parseExpression(consoleInputReader.readUserInput());
        }
        System.out.println("GoodBye!");
    }

}
