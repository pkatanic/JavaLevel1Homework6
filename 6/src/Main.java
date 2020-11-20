import java.io.*;

public class Main {
    public static void main(String args[])
    {
        String s1 = "myfile.txt";
        String s2 = "employee.txt";

        String s3 = "merged.txt";

        File[] files = new File[2];
        files[0] = new File(s1);
        files[1] = new File(s2);

        File mergedFile = new File(s3);

        mergeFiles(files, mergedFile);

    }
    public static void mergeFiles(File[] files, File mergedFile)
    {
        FileWriter fwrite = null;
        BufferedWriter out = null;
        try
        {
            fwrite = new FileWriter(mergedFile,true);
            out = new BufferedWriter(fwrite);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        for(File f: files)
        {
            System.out.println("склеиваем файлы: " + f.getName());
            FileInputStream fs;
            try
            {
                fs = new FileInputStream(f);
                BufferedReader in = new BufferedReader(new InputStreamReader(fs));

                String line;
                while ((line = in.readLine())!= null) {
                    out.write(line);
                    out.newLine();
                }
                in.close();
            }
            catch(IOException e1)
            {
                e1.printStackTrace();
            }
        }
        System.out.print("\n Файлы  склеенный в третьем файле.");
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
