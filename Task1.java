
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Task1 {
    public static int divede(int a, int b) { // Функция целочисленного деления (на 0)
        if (b == 0)
            throw new RuntimeException(" Неверная операция! Деление на 0");
        return a / b;
    }

    public static int getCountLineinfile(String fileName) { // функция ведет подсчет кол-ва строк в файле(если он
                                                            // существует)
        int count = 1;
        if (!Files.exists(Paths.get(fileName))) {
            throw new RuntimeException(" Ошибка! Данный фаил не существует!");
        }
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            while (fr.ready()) {
                if ((char) fr.read() == '\n')
                    count++;
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (count == 0) {
            System.out.println("Файл пустой. Дальнейшая работа невозможна!");
            System.exit(1);
        }
        return count;
    }

    public static int[][] reversArray(int[][] array) { // функция меняет местами строки и столбцы, не вход принимает
                                                       // квадратный массив
        int[][] newArray = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++)
            if (array.length != array[i].length)
                throw new RuntimeException(
                        "Массив не квадратный! Дальнейшее выполнение функции приведет к выходу за пределы массива!");
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++)
                newArray[j][i] = array[i][j];
        return newArray;

    }

    public static void main(String[] args) {
        int result = divede(100, 0);
        int count = getCountLineinfile("test.txt");
        int[][] array = reversArray(new int[][] { { 8, 2, 9 }, { 4, 3, 7 }, { 5, 1 } });
    }
}