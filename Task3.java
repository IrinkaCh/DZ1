//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
//и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
//Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: 
//При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

public class Task3 {
    public static int[] divisionElofArrays(int[] array1, int[] array2) {
        int[] result = new int[array1.length];
        if (array1.length != array2.length)
            throw new RuntimeException(
                    "Массивы не равны друг другу! Дальнейшие операции приведут к выходу за пределы массива.");
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0)
                throw new RuntimeException("Внимание! Массив делителей имеет одно или несколько значений равных 0");
            result[i] = array1[i] / array2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = divisionElofArrays(new int[] { 2, 5, 1 }, new int[] { 0, 8, 2 });
    }
}
