package prototype_2;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = shapeMap.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// para cada shape verifica o BD e cria o shape
	// shapeMap.put(shapeKey, shape);
	// por exemplo, adicionando 3 shapes:
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		Square square = new Square();
		square.setId("2");
		shapeMap.put(square.getId(), square);
		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		shapeMap.put(rectangle.getId(), rectangle);
	}
}