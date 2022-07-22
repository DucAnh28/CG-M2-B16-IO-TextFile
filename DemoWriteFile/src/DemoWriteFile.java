import java.io.FileWriter;
import java.io.IOException;

public class DemoWriteFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("HelloWorld");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
