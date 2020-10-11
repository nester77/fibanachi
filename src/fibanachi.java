public class fibanachi {
    public static void main(String... args) {
        System.out.println("Hello World");
        int a=0;
        int b=1;
        System.out.print(a);
        while ((a+b)<10000) {
            int c=0;
            System.out.print(","+b);
            c=a;
            a=b;
            b=c+b;
        }
    }





}

