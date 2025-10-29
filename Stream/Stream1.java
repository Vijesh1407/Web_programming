
import java.io.FileOutputStream;

public class Stream1
{
    public static void main(String[] args) {
        try
        {
        FileOutputStream fo=new FileOutputStream("mydata.txt");
        String str="Hello, Java Streams!";
        byte barr[]=str.getBytes();
        fo.write(barr);
        System.out.println("Written to file successfully.");
        fo.close();
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}