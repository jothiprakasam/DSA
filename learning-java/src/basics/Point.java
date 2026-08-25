package basics;

public class Point {
	private int x,y;
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	Point(){};
	public static Point o = new Point(2,3);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		Point p2 = new Point();
		p2.o.y = 6; 
		System.out.println(p2.o.y);
	}
}
