public class Celebrity{
    public static void main(String[]args){
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";

        String c1 = s1.substring(2, s1.length() - 3);
        String c2 = s2.substring(2, s2.length() - 3);
        String c3 = s3.substring(2, s3.length() - 3);

        System.out.println(s1 + " >>> " + c1);
        System.out.println(s2 + " >>> " + c2);
        System.out.println(s3 + " >>> " + c3);
    }
}
