// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//  и возвращающий новый массив, каждый элемент которого равен частному элементов 
//  двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо 
//  как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, 
//  которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class ex_les1_3 {
    public static void divArray(int[] args1, int[] args2) throws Exception {
        if (args1.length != args2.length)
            throw new Exception("Массивы разной длины");
        int[] args3 = new int[args1.length];
        for (int i = 0; i < args1.length; i++) {
            if (args2[i] == 0)
                throw new Exception("На ноль делить нельзя");
            args3[i] = args1[i] / args2[i];
            System.out.print(args3[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] newArray1 = new int[] { 44, 86, 100, 10 };
        int[] newArray2 = { 56, 20, 25, 100 };
        try {
            divArray(newArray1, newArray2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
