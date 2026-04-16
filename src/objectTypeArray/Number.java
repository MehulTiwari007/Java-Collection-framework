package objectTypeArray;

public class Number {
    public static void main(String ar[]) {

        Object x[] = {10, 20, 30, 40, 50.8};

        for(Object i : x) {
            System.out.println(i);
        }
    }
}