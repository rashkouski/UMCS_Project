public static void main(String[] args) throws IOException {
    // 1. Создаем базу (например, прямоугольник)
    Polygon rect = new Polygon(new Vec2[]{
            new Vec2(0, 0), new Vec2(100, 0),
            new Vec2(100, 50), new Vec2(0, 50)
    });

    // 2. Сначала добавим цвет (старый декоратор)
    Shape coloredRect = new SolidFillShapeDecorator(rect, "purple");

    // 3. Используем Builder для добавления трансформаций
    Shape transformedRect = new TransformationDecorator.Builder()
            .translate(new Vec2(200, 100))  // Сдвинуть
            .rotate(45, new Vec2(250, 125)) // Повернуть на 45 градусов вокруг центра
            .scale(new Vec2(1.5, 1.5))      // Увеличить в 1.5 раза
            .build(coloredRect);            // Обернуть всё это в декоратор

    // 4. Добавляем на сцену
    SvgScene scene = new SvgScene();
    scene.addShape(transformedRect);
    scene.save("transformed_scene.svg");
}