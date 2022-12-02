// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class ex_les1_1 {
    public static void showNum() throws Exception {
        int[] arr = new int[] { 13, 14, 15, 16, 17, 18 };
        try {
            System.out.println(arr[15]);
        } catch (Exception e) {
            System.out.println("Индекс числа выходит за пределы массива");
        }
    }

    public static void subNum(int a, int b) {
        int sub = 0;
        try {
            sub = a / b;
            System.out.println(sub);
        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя");
        }

    }

    public static void newStr() {
        String str = null;
        try {
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Значение строки нулевое");
        }
    }

    public static void main(String[] args) throws Exception {
        showNum();
        subNum(7, 0);
        newStr();
    }
}
