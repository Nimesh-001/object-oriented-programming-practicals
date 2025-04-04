public class Bb implements Aa {

    private int a,b,c;
    private double s,area;

    public Bb(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s=0;

    }

    @Override
    public void getarea() {
        s=(double) (a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("area="+area);

    }
}
