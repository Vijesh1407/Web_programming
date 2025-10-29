public class SwitchCase{
    public static void main(String[] args) {
        int a=5;
        switch(a%2)
        {
            case 0:
                System.out.println(a+" is even");
                break;
            case 1:
                System.out.println(a+" is odd");
                break;
        }
    }
}