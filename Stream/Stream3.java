
import java.io.FileOutputStream;

public class Stream3
{
    public static void main(String[] args) {
        try
        {
        FileOutputStream fo=new FileOutputStream("mydata.txt",true);
        String str=" This is appended string.";
        byte barr[]=str.getBytes();
        fo.write(barr);
        System.out.println("Appended successfully.");
        fo.close();
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}