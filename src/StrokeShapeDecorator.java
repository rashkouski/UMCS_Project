public class StrokeShapeDecorator extends ShapeDecorator {
    private String color;
    private double width;

    public StrokeShapeDecorator(Shape decoratedShape,String color,double width){
        super(decoratedShape);
        this.width=width;
        this.color=color;
    }

    public String toSvg(String parameters){
        String strokeParams=String.format(java.util.Locale.ENGLISH,
                "stroke=\"%s\" stroke-width=\"%f\" ", color, width);
        return decoratedShape.toSvg(strokeParams+parameters);
    }
    public String toSvg(){
        return "";
    }


}
