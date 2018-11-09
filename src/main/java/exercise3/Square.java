package exercise3;

public class Square extends ConvexPolygon implements Drawable {
	public Square(Point upperLeft, int sideLenght){
		super(new Point[]{
			upperLeft,
			new Point(upperLeft.getX()+sideLenght, upperLeft.getY()),
			new Point(upperLeft.getX(), upperLeft.getY()-sideLenght),
			new Point(upperLeft.getX()+sideLenght, upperLeft.getY()-sideLenght)
		});
	}
}
