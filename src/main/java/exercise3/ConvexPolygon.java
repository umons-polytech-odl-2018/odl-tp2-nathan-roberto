package exercise3;

public class ConvexPolygon {

	private Point[] vertices;

	public Point[] getVertices(){ return vertices; }


	ConvexPolygon(Point[] vertices){
		this.vertices = vertices;
	}
	public double area(){
		float area = 0;
		for(int i = 0; i < vertices.length-1; i++){
			area += (vertices[i].getX() * vertices[i+1].getY());
			area -= (vertices[i].getY() * vertices[i+1].getX());
		}
		area = area/2;
		return (double)area;

	}
	public double perimeter(){
		int xprec = vertices[vertices.length-1].getX(),x,y;
		int yprec = vertices[vertices.length-1].getY();
		double length = 0;
		for(Point element : vertices){
			y = element.getY();
			x = element.getX();
			length += Math.sqrt((yprec + y)*(yprec + y) +(xprec + x)*(xprec + x));
			yprec = y;
			xprec = x;
		}
		return length;
	}

}
