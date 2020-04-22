public class Point {
        private final float x,y;
        public Point(){
            this.x=0;
            this.y=0;
        }
        public Point(float x, float y){
            this.x = x;
            this.y = y;
        }
        public float getX(){
            return x;
        }
        public float getY(){
            return y;
        }
        public boolean isIdentical(Point other){
            boolean b = (this.x == other.x && this.y == other.y);
            return b;
        }
    }