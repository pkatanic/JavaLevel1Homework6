import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class CreateFile {

    public static void main(String[]args) throws Exception{

        File file = new File("src/myfile.txt");
        try {
            if(file.createNewFile()){
                System.out.println("Файл создан.");
            } else {

                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter out = new BufferedWriter(new FileWriter("myFile.txt"));
        out.write("This is the first line");
        out.newLine();
        out.write("12345");
        out.newLine();
        int num = 9;
        out.newLine();
        out.write("The number is " + num);
        out.close();

    }

}
