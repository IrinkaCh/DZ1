//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
//и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
//Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class Task2 {
    public static int[] differenceElofArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        if (array1.length != array2.length)
            throw new RuntimeException(
                    "Массивы не равны друг другу! Дальнейшие операции приведут к выходу за пределы массива.");
        for (int i = 0; i < array1.length; i++)
            result[i] = array1[i] - array2[i];
        return result;
    }

    public static void main(String[] args) {
        int[] arr = differenceElofArrays(new int[] { 2, 5 }, new int[] { 3, 1, 1 });
    }
}
