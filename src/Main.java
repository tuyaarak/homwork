import java.util.Scanner;
public class Main {
    public static void exit() {
        System.out.println("Goodby!");
    }
    public static void main(String[] args) {

        String[] zoo = {"camel", "lion", "bear", "bat"};
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while(true) {
            if (input.equals("e[it")) {
                exit();
                break;
            }
            // println == print line в конце линии компилятор ставит символ новой    строки \n
            // print в конце линии компилятор не ставит ничего
            System.out.println(zoo[Integer.parseInt(input)]);
            input = scanner.nextLine();
        }
    }
}