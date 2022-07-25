import java.io.*;
import java.util.Scanner;

public class DemoReadFIle {
    public static void main(String[] args) throws IOException {
//        Cách 1:
//        File
        FileReader abc = new FileReader("DemoReadFile/DucAnh.txt");
        BufferedReader reader = new BufferedReader(abc);
        String readLine1 = reader.readLine();
        System.out.println(readLine1);


//        Cách 2:
        FileReader reader1 = new FileReader("DemoReadFile/DucAnh.txt");
        Scanner scanner = new Scanner(reader1);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
    }
}
