import java.util.Scanner; //Shaima Zeyad
public class Main {
    public static void main(String[] args) {
        System.out.println("\\\\\\\\\\ parallel line points ex: (-1,-2)(1,2)--(-2,0)(0,4) \n" +
                "\\\\\\\\\\ prependicular line points ex: (0,-4)(-1,-7) -- (3,0)(-3,2)");
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t****First point x and y****");
        System.out.print("please enter x: ");
        float first = sc.nextFloat();
        System.out.print("please enter y: ");
        float second = sc.nextFloat();
        Point point1 = new Point(first,second);
        System.out.print(point1.getX()); //get methods
        System.out.print(point1.getY());
        System.out.println("\t\t****Second point x and y****");
        System.out.print("please enter x: ");
        float third = sc.nextFloat();
        System.out.print("please enter y: ");
        float forth = sc.nextFloat();
        Point point2 = new Point(third,forth);
        int a;
        while (true){
        if (point1.isIdentical(point2)){
            System.out.println("points are identical No LINE, choose to reassign points: 1 or 2");
            a=sc.nextInt();
            switch (a){
                case 1:
                    System.out.println("\t\t****First point x and y****");
                    System.out.print("please enter x: ");
                    first = sc.nextFloat();
                    System.out.print("please enter y: ");
                    second = sc.nextFloat();
                    point1 = new Point(first,second);
                    break;
                case 2:
                    System.out.println("\t\t****Second point x and y****");
                    System.out.print("please enter x: ");
                    third = sc.nextFloat();
                    System.out.print("please enter y: ");
                    forth = sc.nextFloat();
                    point2 = new Point(third,forth);
                    break;

            }
        }

        else{
            System.out.println("points are not identical");
            break;}}
        System.out.println("\t\t****Third point x and y****");
        System.out.print("please enter x: ");
        float fifth = sc.nextFloat();
        System.out.print("please enter y: ");
        float sixth = sc.nextFloat();
        System.out.println("\t\t****Forth point x and y****");
        System.out.print("please enter x: ");
        float seventh = sc.nextFloat();
        System.out.print("please enter y: ");
        float eighth = sc.nextFloat();
        Point point3 = new Point(fifth,sixth);
        Point point4 = new Point(seventh,eighth);
        int b;
        while (true){
            if (point3.isIdentical(point4)){
                System.out.println("points are identical No LINE, choose to reassign points: 3 or 4");
                b=sc.nextInt();
                switch (b){
                    case 1:
                        System.out.println("\t\t****Third point x and y****");
                        System.out.print("please enter x: ");
                        fifth = sc.nextFloat();
                        System.out.print("please enter y: ");
                        sixth = sc.nextFloat();
                        point3 = new Point(fifth,sixth);
                        break;
                    case 2:
                        System.out.println("\t\t****Fourth point x and y****");
                        System.out.print("please enter x: ");
                        seventh = sc.nextFloat();
                        System.out.print("please enter y: ");
                        eighth = sc.nextFloat();
                        point4 = new Point(seventh,eighth);
                        break;
                }
            }
            else{
                System.out.println("points are not identical");
                break;}}

        Line line1 = new Line(point1,point2);
        Line line2 = new Line(point3,point4);

        if (line1.isParallel(line2))
            System.out.print("lines are parallel - ");
        else
            System.out.print("lines are not parallel - ");

        if (line1.isPrependicular(line2))
            System.out.println("lines are prependicular ");
        else
            System.out.println("lines are not prependicular ");

    }
}
