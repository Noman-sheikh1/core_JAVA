package basicOfjava;

public class typeCastingExample {
    public static void main(String[] args){
        byte a=23;
        int b=a;
        float c=2.3f;
        double d=c;
        c=(float)d;
        System.out.println(a);
        System.out.println(b);

        System.out.println(c);
        System.out.println(d);

    }
}
