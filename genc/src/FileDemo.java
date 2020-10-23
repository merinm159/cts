import java.io.*;
public class FileDemo
{
    public static void main(String[] args)
    {
        
        try{
            FileInputStream file =new FileInputStream(new File("log.txt"));
            int line;
            while((line=file.read())!=-1){
                System.out.print((char)line);
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}