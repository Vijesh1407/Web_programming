import java.util.*;
public class StringAnagram
{
    public static boolean areAnagrams(String s1,String s2)
    {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(char c:s1.toCharArray())
        {
            mp.put(c,mp.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray())
        {
            if(!mp.containsKey(c)) return false;
            mp.put(c,mp.getOrDefault(c,0)-1);
            if(mp.get(c)==0) mp.remove(c);
        }
        return mp.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter string 1:");
        String s1=sc.next();
        System.out.print("Enter string 2:");
        String s2=sc.next();
        boolean ans=areAnagrams(s1,s2);
        if(ans) System.out.println("Anagrams");
        else System.out.println("Not anagrams");
    }
}