package exercise3;

public class ConvexPolygon implements Drawable{
	private Point[] vertices;

	public Point[] getVertices(){ return vertices; }

	ConvexPolygon(Point[] vertices){
		this.vertices = vertices;
	}
}
