import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteDataWithPrintWriter {


    public static void main(String[] args) {
        java.io.File file = new java.io.File("DucAnh.txt");
        if (file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }
        PrintWriter output = null;

        try {
            output = new PrintWriter(file);
            output.print("John T Smith ");
            output.println(90);
            output.print("Erik K Jones ");
            output.println(85);
            output.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
