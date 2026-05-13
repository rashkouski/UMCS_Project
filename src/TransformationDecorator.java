import java.util.Locale;

public class TransformationDecorator extends ShapeDecorator {
    private String transform;

    // Приватный конструктор: только Builder сможет создать этот объект
    private TransformationDecorator(Shape decoratedShape, String transform) {
        super(decoratedShape);
        this.transform = transform;
    }

    @Override
    public String toSvg(String parameters) {
        // Добавляем атрибут transform в SVG тег
        String transformParam = String.format("transform=\"%s\" ", transform);
        return decoratedShape.toSvg(transformParam + parameters);
    }

    @Override
    public String toSvg() {
        return toSvg("");
    }

    // Вложенный класс Builder
    public static class Builder {
        private String transform = "";

        public Builder translate(Vec2 translation) {
            transform += String.format(Locale.ENGLISH, "translate(%f %f) ",
                    translation.x(), translation.y());
            return this; // Возвращаем текущий объект для цепочки вызовов
        }

        public Builder rotate(float angle, Vec2 center) {
            transform += String.format(Locale.ENGLISH, "rotate(%f %f %f) ",
                    angle, center.x(), center.y());
            return this;
        }

        public Builder scale(Vec2 scaleFactor) {
            transform += String.format(Locale.ENGLISH, "scale(%f %f) ",
                    scaleFactor.x(), scaleFactor.y());
            return this;
        }

        // Финальный метод, который создает декоратор
        public TransformationDecorator build(Shape shape) {
            return new TransformationDecorator(shape, transform.trim());
        }
    }
}