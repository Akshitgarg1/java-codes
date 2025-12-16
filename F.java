
class F {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Akshit";
        String s3="      Garg";

        System.out.println("length of s1:"+s1.length());
        String s=s1.concat(s2);
        System.out.println("concatinated string:"+s);
        String r=s1.replace("o","a");
        System.out.println("reaplace:"+r);
        String t=s3.trim();
        System.out.println("trimmed:"+t);
        String p=s2.toLowerCase();
        System.out.println("lowercase:"+s2);
        String sub=s2.substring(2,4);
        System.out.println("substring:"+sub);
        int i=s1.indexOf("e");
        System.out.println("indexof(e):"+i);
        boolean c=s2.contains("ksh");
        System.out.println("contains ksh:"+c);
        
    }
    
}
