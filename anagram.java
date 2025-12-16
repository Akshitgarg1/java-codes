import java.util.Arrays;

class Anagram {
    public static void main(String[] args) throws java.lang.Exception{
        boolean res = isAnagram("now", "own");
        System.out.println(res);
    }
    static boolean isAnagram(String a, String b) {
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();
        if (a.length() != b.length()) {
            return false;
        }
        char[] array1 = a.toCharArray();
        //char[] array2 = b.toCharArray();
        //Arrays.sort(array1);
        //Arrays.sort(array2);
        //return Arrays.equals(array1, array2);
        for(char c:array1)
        {
            int i=b.indexOf(c);
            if(i==-1)
            {
                return false;
            }
            b=b.substring(0,i)+b.substring(i+1,b.length());
        }
        return true;
    }
}
