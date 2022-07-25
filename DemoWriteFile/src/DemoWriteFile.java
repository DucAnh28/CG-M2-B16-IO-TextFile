import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

public class DemoWriteFile implements Serializable {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter writer = new FileWriter("E:\\Code\\CodeGym\\Module 2\\CG-M2-B16-IO-TextFile\\DemoWriteFile\\Hello.txt");
            writer.write("HelloWorld");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        FileWriter writer = new FileWriter("Yolo.txt");
//        Scanner scanner = new Scanner(System.in);
//        String bien = "";
//        int bien1 = 0;
//        while (bien1 != -1) {
//            bien1 = scanner.nextInt();
//            writer.write(bien1);
//        }
//        writer.close();

    }
}
