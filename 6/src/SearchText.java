import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SearchText {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ID for searching: ");
        String eid=s.next();
        String line = "";
        try
        {
            FileInputStream fin = new FileInputStream("employee.txt");
            Scanner sc = new Scanner(fin);
            while(sc.hasNext()){
                line=sc.nextLine();
                if(line.startsWith(eid))
                    System.out.println(line);
            }
            sc.close();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
