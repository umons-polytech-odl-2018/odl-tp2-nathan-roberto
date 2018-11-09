package exercise3;

public class Exercise3 {
	public static void main(String[] args) {
		Point[] vertices = new Point[]{new Point(50, 50), new Point(150, 50), new Point(150, 150), new Point(50, 150)};
		Panel pannel = new Panel(new Drawable[] {new ConvexPolygon(vertices)});
	}
}
