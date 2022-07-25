import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        try {
            File input = new File("BT1-CopyFile/inputfile.txt");
            File target = new File("BT1-CopyFile/targetfile.txt");
            BufferedReader inputbr = new BufferedReader(new FileReader(input));
            BufferedWriter targetbr = new BufferedWriter(new FileWriter(target));
            int line;
            int count = 0;
            while ((line = inputbr.read()) != -1) {
                targetbr.write((char) line);
                count++;
            }
            inputbr.close();
            targetbr.close();
            System.out.println("So ki tu " + count);
        } catch (IOException e){
            System.err.print("Error in IO");
        } catch (Exception e ){
            System.err.println("Error !");
        }
    }
}
