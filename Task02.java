//     парсим текст на слова
//     печатаем слова в порядке возрастания длины
//     throw new UnsupportedOperationException();
// }
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task02 
{

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Введите набор слов: ");
        String str = myScanner.nextLine();
        myScanner.close();  

        List<String> words = new ArrayList<>(Arrays.asList(str.split(" ")));

        System.out.println("Список без сортировки: ");
        System.out.println(words);

        words.sort((first, second) -> Integer.compare(first.length(), second.length()));

        System.out.println("Список после сортровки: ");
        System.out.println(words);
    }
}

            
