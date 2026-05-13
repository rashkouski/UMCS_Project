public class Segment {
    private Point a;
    private Point b;

    public Segment(Point a, Point b) {
        this.a = new Point(a);
        this.b = new Point(b);
    }

    // Аксессоры (геттеры)
    public Point getA() { return a; }
    public Point getB() { return b; }

    public Segment perpendicular() {
        // 1. Находим середину отрезка
        double midX = (a.getX() + b.getX()) / 2;
        double midY = (a.getY() + b.getY()) / 2;

        // 2. Вектор направления (от A до B)
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();

        // 3. Создаем перпендикулярный вектор той же длины
        // Новые координаты концов относительно середины: (-dy/2, dx/2) и (dy/2, -dx/2)
        Point p1 = new Point(midX - dy / 2, midY + dx / 2);
        Point p2 = new Point(midX + dy / 2, midY - dx / 2);

        return new Segment(p1, p2);
    }
    public double length(){
        double dx = b.getX() - a.getX();
        double dy = b.getY() - a.getY();
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }

}
