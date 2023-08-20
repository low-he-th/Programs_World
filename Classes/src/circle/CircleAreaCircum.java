package circle;

public class CircleAreaCircum {
double radius;
String colour;
public CircleAreaCircum(double radius,String colour) {
	this.radius=radius;
	this.colour=colour;
}
double radius() {
	return radius;
}
double calculatearea() 
{
	return  Math.PI*radius*radius;
}
double calculatecircumference()
{
	return 2*Math.PI*radius;
}

}
