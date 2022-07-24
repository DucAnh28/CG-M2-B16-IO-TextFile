import java.io.FileWriter;
import java.io.IOException;

public class DemoWriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("E:\\Code\\CodeGym\\Module 2\\CG-M2-B16-IO-TextFile\\DemoWriteFile\\Hello.txt");
            writer.write("HelloWorld");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
