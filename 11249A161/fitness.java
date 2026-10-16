import java.io.*;

public class fitness {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("profile.txt");

            String data = "Name: Arun\nAge: 20\nFitness Goal: Weight Loss";
            fout.write(data.getBytes());
            fout.close();

            FileInputStream fin = new FileInputStream("profile.txt");

            int i;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            fin.close();
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}


