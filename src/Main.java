

// 2. Основной класс, где мы будем выполнять задание
public class Main {
    public static void main(String[] args) {
        // Создаем объект (экземпляр) класса Point
        Point myPoint = new Point();

        // Устанавливаем значения полей (Ustaw pola)
        myPoint.x = 5.5;
        myPoint.y = 10.0;

        // Выводим поля напрямую (Wyświetl pola)
        myPoint.translate(10,10);
        Point p2 = myPoint.translated(1,1);
        Segment seg = new Segment();
        seg.a=myPoint;
        seg.b=p2;
        //System.out.println(myPoint.toString());
        //System.out.println(myPoint.toSVG());
        //System.out.println(p2.toString());
        System.out.println(seg.length());
    }

}