import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        createNewFile();
//        write("hello Darth");
        String data = read();
        System.out.println("data:"+data);

    }

    private static String read() {
        File file = new File("one.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Нема такого файлу");
        }
        String data = "";

        while (myReader.hasNextLine())
            data+= myReader.nextLine();

        return  data;
    }

    private static void write(String msg) {
        FileWriter myWriter = null;
        try {

            myWriter = new FileWriter("one.txt");
            myWriter.write(msg);
            myWriter.close();

        } catch (IOException e) {
            System.out.println("error");
        }
    }

    private static void createNewFile() {
        File file = new File("one.txt");
        try {
            System.out.println("new create");
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("created");
        }
    }







}
