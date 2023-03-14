public class StringsHW {
    public static void main(String[] args) {
        String a = "Hello, Java! It's a Java Basic course";
        String a1 = new String("Hello, Java! It's a Java Basic course");

        System.out.println("1. String a length is => " + a.length());
        System.out.println("1. new String a1 length is => " + a1.length());
        System.out.println("2. Symbol ! => " + a.charAt(11));
        System.out.println("3. Part itsajava => " + a.substring(13,24));
        System.out.println("4. Part javabasiccourse => " + a.substring(20));



    }
}
