
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Stream4
{
    public static void main(String[] args) {
        try
        {
            FileInputStream fi=new FileInputStream("mydata.txt");
            BufferedInputStream bi=new BufferedInputStream(fi);
            FileOutputStream fo=new FileOutputStream("destination.txt");
            BufferedOutputStream bo=new BufferedOutputStream(fo);
            int i;
            while((i=bi.read())!=-1)
            {
                bo.write(i);
            }
            System.out.println("File copied successfully.");
            bo.flush();
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
}