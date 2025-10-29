import java.util.*;
public class Rand5
{
    public static void main(String[] args) {
        Random rand=new Random();
        String up="ABCDEFGHIJKLMNOPQRSTUVWXYZ",low="abcdefghijklmnopqrstuvwxyz",digi="0123456789",special="!@#$%%^&*()-_=+<>?/",all=up+low+digi+special;
        StringBuilder password=new StringBuilder();
        password.append(up.charAt(rand.nextInt(up.length())));
        password.append(low.charAt(rand.nextInt(low.length())));
        password.append(digi.charAt(rand.nextInt(digi.length())));
        password.append(special.charAt(rand.nextInt(special.length())));
        int len=10;
        for(int i=4;i<10;i++)
        {
            password.append(all.charAt(rand.nextInt(all.length())));
        }
        System.out.print("Generated password:"+password.toString());
    }
}