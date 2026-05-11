public class Segment {
    public Point a;
    public Point b;

    public double length(){
        double dx = b.x - a.x;
        double dy = b.y - a.y;
        return Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
    }
    public static Segment maxSeg(Segment[] arr){
        Segment segMax = arr[0];
        for(int i=1;i< arr.length;i++){
            if(segMax.length()<arr[i].length()) segMax=arr[i];
        }
        return segMax;
    }

}
