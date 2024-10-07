public class Main
{
    public static void main(String[] args)
    {
        String words = lastFirstN("cream", "butter", 3);
        System.out.println(words);

        stringManip ("hello", "hello"); 

    }
    
    public static String lastFirstN(String s1, String s2, int n)
    {
        int lastFirst = s1.length() - n;
        String output = s1.substring(lastFirst);

        String output2 = s2.substring(0,n);

        return (output + output2);
    }

    public static void stringManip (final String s, final String p)
    {
        System.out.println(s.toUpperCase());
        String firstLetter = p.substring(0,1);
        firstLetter = firstLetter.toUpperCase();

        String lower = p.toLowerCase();
        String restOfp = lower.substring(1);
        System.out.println(firstLetter + restOfp);
    }
}