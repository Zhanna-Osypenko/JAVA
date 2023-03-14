public class StringsExamples {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";

        System.out.println("1.equals => " + a.equals(b));
        System.out.println("1. ==   => " + (a == b)); // ==   -   сравнение по ссылке

        // 2. new -> хранение переменных со своим адресом в куче

        String c = new String("java");
        String d = new String("java");
        System.out.println("2. equals => " + c.equals(d));
        System.out.println("2. ==   => " + (c == d));

//        int q = 10;
//        int w = 10;
//        System.out.println("int == " + (q == w));
//
        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.substring(1,3));


    }
}
