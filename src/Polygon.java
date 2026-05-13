public class Polygon implements Shape {
    protected Vec2[] points; // Используем Vec2 вместо Point

    public Polygon(Vec2[] points) {
        this.points = points; // Для краткости опустим глубокое копирование, если не требуется
    }
    @Override
    public BoundingBox boundingBox() {
        double minX = points[0].x();
        double maxX = points[0].x();
        double minY = points[0].y();
        double maxY = points[0].y();

        for (Vec2 p : points) {
            minX = Math.min(minX, p.x());
            maxX = Math.max(maxX, p.x());
            minY = Math.min(minY, p.y());
            maxY = Math.max(maxY, p.y());
        }
        return new BoundingBox(minX, minY, maxX - minX, maxY - minY);
    }

    // Этот метод "закроет" требование интерфейса Shape
    @Override
    public String toSvg() {
        return toSvg(""); // Вызываем твой метод с параметрами, передавая пустую строку
    }

    // Твой метод с параметрами остается как есть
    @Override
    public String toSvg(String parameters) {
        StringBuilder sb = new StringBuilder();
        for (Vec2 p : points) {
            sb.append(p.x()).append(",").append(p.y()).append(" ");
        }
        return String.format("<polygon points=\"%s\" %s />", sb.toString().trim(), parameters);
    }
}