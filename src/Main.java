// 1. Описываем чертеж нашей точки
class Point {
    public double x;
    public double y;

    // Метод, который превращает данные точки в красивую строку
    public String toString() {
        return "Punkt ma współrzędne: x = " + x + ", y = " + y;
    }
}

// 2. Основной класс, где мы будем выполнять задание
public class Main {
    public static void main(String[] args) {
        // Создаем объект (экземпляр) класса Point
        Point myPoint = new Point();

        // Устанавливаем значения полей (Ustaw pola)
        myPoint.x = 5.5;
        myPoint.y = 10.0;

        // Выводим поля напрямую (Wyświetl pola)
        System.out.println("Координата X: " + myPoint.x);
        System.out.println("Координата Y: " + myPoint.y);

        // Используем наш метод toString() для вывода всей информации
        System.out.println(myPoint.toString());
    }
}