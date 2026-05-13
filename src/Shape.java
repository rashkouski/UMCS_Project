public interface Shape {
    BoundingBox boundingBox();

    // Этот метод "закроет" требование интерфейса Shape
    String toSvg();

    String toSvg(String parameters);
}
