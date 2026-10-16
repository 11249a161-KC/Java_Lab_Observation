import java.io.*;

public class texteditor {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("document.txt");

            fw.write("Welcome to Java Programming.\n");
            fw.write("This is a text editor example.");
            fw.close();

            FileReader fr = new FileReader("document.txt");

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

            fr.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}




