
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream5
{
    public static void main(String[] args) {
        try
        {
        FileInputStream fi=new FileInputStream("Java Input SN.pdf");
        FileOutputStream fo=new FileOutputStream("Java Input SN Copy.pdf");
        int i;
        while((i=fi.read())!=-1)
        {
            fo.write(i);
        }
        System.out.println("File copied successfully.");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}