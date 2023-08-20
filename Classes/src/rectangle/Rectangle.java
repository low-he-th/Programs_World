package rectangle;

public class Rectangle {
double length;
double width;
public  Rectangle(Double length,Double width) {
	this.length=length;
	this.width=width;
}
double calculateArea()
{
	return length*width;
}
double calculatePerimeter() {
	return 2*(length+width);
}
}
