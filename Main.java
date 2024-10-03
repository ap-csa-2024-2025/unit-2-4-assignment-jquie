public class Main
{
    public static void main(String[] args)
    {
        String words = lastFirstN("cream", "butter", 3);
        System.out.println(words);
    }
    
    public static String lastFirstN(String s1, String s2, int n)
    {
        int lastFirst = s1.length() - n;
        String output = s1.substring(lastFirst);

        int lastSecond = s2.length() - n;
        String output2 = s2.substring(0,n);

        return (output + output2);
    }
}