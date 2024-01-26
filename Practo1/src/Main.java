import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.IOException;
// Импортрируем необходимые классы

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Создаем объект Scanner для чтения данных с клавиатуры
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("students.txt", true)); // Создаем объект PrintWriter для записи данных в файл "students.txt"
            System.out.println("Введите количество студентов:"); // Печатаем приглашение для ввода количества студентов
            int countStudents = sc.nextInt(); // Читаем количество студентов, введенных пользователем
            sc.nextLine(); // Очищаем буфер после считывания числа
            for (int i = 0; i < countStudents; i++) { // Запускаем цикл для ввода данных о каждом студенте
                System.out.print("Введите имя студента:"); // Печатаем приглашение для ввода имени студента
                String name = sc.nextLine(); // Читаем имя студента, введенное пользователем
                System.out.print("Введите возраст студента:"); // Печатаем приглашение для ввода возраста студента
                int age = sc.nextInt(); // Читаем возраст студента, введенный пользователем
                System.out.print("Введите средний балл студента:"); // Печатаем приглашение для ввода среднего балла студента
                double middleball = sc.nextDouble(); // Читаем средний балл студента, введенный пользователем
                pw.printf("имя: %s, возраст: %d, средний балл: %f\n", name, age, middleball); // Записываем информацию о студенте в файл "students.txt"
                sc.nextLine();
            }
            pw.close(); // Закрываем PrintWriter после завершения записи данных в файл
        } catch (IOException e) { // Обрабатываем возможное исключение ввода-вывода
            System.out.println("Ошибка: " + e.getMessage()); // Печатаем сообщение об ошибке
        } finally { // Выполняем код в блоке finally независимо от того, произошло ли исключение или нет
            sc.close(); // Закрываем объект Scanner
        }
    }
}
