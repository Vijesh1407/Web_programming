
import java.io.FileInputStream;

public class Stream2
{
    public static void main(String[] args) {
        try
        {
        FileInputStream fi=new FileInputStream("mydata.txt");
        int i;
        while((i=fi.read())!=-1)
        {
            System.out.print((char)i);
        }
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}