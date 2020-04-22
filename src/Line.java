public class Line {
    private final Point point1;
    private final Point point2;
    final private float slope;
    public Line(Point point1, Point point2){
        this.point1 = point1;
        this.point2 = point2;
        this.slope = (point2.getY() - point1.getY()) / (point2.getX() - point1.getX());
    }

    public boolean isParallel(Line line1){
        if (this.slope == line1.slope)
            return true;
        else
            return false;
    }
    public boolean isPrependicular(Line line1){
        if (this.slope == (-1 / line1.slope))
            return true;
        else
            return false;
    }

}
