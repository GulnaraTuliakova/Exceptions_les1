// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//  и возвращающий новый массив, каждый элемент которого равен разности элементов 
//  двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
//   как-то оповестить пользователя.

public class ex_les1_2 {
    public static void subArray(int[] args1, int[] args2) throws Exception {
        if (args1.length != args2.length)
            throw new Exception("Массивы разной длины");
        int[] args3 = new int[args1.length];
        for (int i = 0; i < args1.length; i++) {
            args3[i] = args1[i] - args2[i];
            System.out.print(args3[i] + "  ");
        }
    }

    public static void main(String[] args) {
        int[] newArray1 = new int[] { 44, 86, 100, 155, 241 };
        int[] newArray2 = { 56, 21, 25, 14 };
        try {
            subArray(newArray1, newArray2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
