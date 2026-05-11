class Point {
    public double x;
    public double y;

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