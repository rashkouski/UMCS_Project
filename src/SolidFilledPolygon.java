import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyles.parameters;

public class SolidFilledPolygon extends Polygon{
    private String color;

    public SolidFilledPolygon(Vec2[] points,String color) {
        super(points);
        this.color=color;
    }
    public String toSvg(){
        String fillParameter = String.format("fill=\"%s\" %s", color, parameters);
        return super.toSvg();
    }
}
