public class Style {
    public final String fillColor;
    public final String strokeColor;
    public final Double strokeWidth;

    // Конструктор
    public Style(String fillColor, String strokeColor, Double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    // Метод для генерации атрибута style
    public String toSvg() {
        return String.format("fill:%s;stroke:%s;stroke-width:%f",
                fillColor, strokeColor, strokeWidth);
    }
}
