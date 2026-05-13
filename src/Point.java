class Point {
    private double x;
    private double y;
    //Konstruktor
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        this.x=0;
        this.y=0;
    }
    public Point(Point other){
        this.x=other.x;
        this.y=other.y;
    }
    //Aksesory
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    //Mutatory
    public void setX(double x){
        this.x=x;
    }
    public void setY(double y){
        this.y=y;
    }
    public void translate(double dx,double dy){
        this.x+=dx;
        this.y+=dy;
    }
    public Point translated(double dx,double dy){
        Point newPoint = new Point();
        newPoint.x = this.x+dx;
        newPoint.y = this.y+dy;
        return newPoint;
    }
    // Метод, который превращает данные точки в красивую строку
    public String toString() {
        return "Punkt ma współrzędne: x = " + x + ", y = " + y;
    }
    public String toSVG(){
        return "<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"5\" />";
    }

}