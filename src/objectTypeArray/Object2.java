package objectTypeArray;

public class Object2 {

    public static void main(String ar[]) {

        Object y[][] = {
                {10, 20, 30, "ram"},
                {"mehul", 11, 123.5}
        };

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {
                System.out.println(y[i][j]);
            }
        }
    }
}