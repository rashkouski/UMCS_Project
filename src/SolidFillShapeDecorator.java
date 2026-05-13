public class SolidFillShapeDecorator extends ShapeDecorator{
    private String color;
    public SolidFillShapeDecorator(Shape decoratedshape,String color){
        super(decoratedshape);
        this.color=color;
    }

    public String toSvg(String parameters){
        String fillParam = String.format("fill=\"%s\" %s", color, parameters);
        return decoratedShape.toSvg(fillParam);
    }
    public String toSvg(){
        return "";
    }


}
