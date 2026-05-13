import java.util.Locale;

public class Ellipse implements Shape {
    private Vec2 center;
    private double rx;
    private double ry;

    // Конструктор...
    public Ellipse(Vec2 center, double rx, double ry) {
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }


    @Override
    public BoundingBox boundingBox() {
        // Раньше тут скорее всего было return null;
        double x = center.x() - rx;
        double y = center.y() - ry;
        return new BoundingBox(x, y, rx * 2, ry * 2);
    }

    @Override
    public String toSvg() {
        return "";
    }

    @Override
    public String toSvg(String parameters) {
        return String.format(Locale.ENGLISH,
                "<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\" />",
                center.x(), center.y(), rx, ry);
    }
}