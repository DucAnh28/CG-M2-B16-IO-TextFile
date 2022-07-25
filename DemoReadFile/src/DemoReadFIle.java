import java.io.*;

public class DemoReadFIle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("DemoReadFile/DucAnh.txt"));
        String readLine1 = reader.readLine();
        System.out.println(readLine1);

        FileReader reader1 = new FileReader("DemoReadFile/DucAnh.txt");
        String readLine2 = reader1.read();
        System.out.println(readLine2);
    }
}
