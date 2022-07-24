import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter link to the file ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFile = new ReadFileExample();
        readFile.readFileText(path);
    }
}
