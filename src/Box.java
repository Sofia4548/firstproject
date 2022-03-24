public class Box {
    private int height;
    private int width;
    private int length;
    public void calArea()
    {

    }


    public Box(int height, int width, int length) {

        this.height = height;
        this.width = width;
        this.length = length;

    }


    public int  boxArea() {

        return height*length;

    }
    public void boxVol()
    {
        int vol;
        vol= boxArea()*width;
        System.out.println("Volume of Box  is "+vol);
    }
    public static void main(String [] args)
    {
        int area;
        Box b=new Box(20,25,10);
        area=b.boxArea();
        System.out.println("Area is "+area);
        System.out.println("vivek changes");


    }
}
