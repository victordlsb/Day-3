class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle rect = new Rectangle();
Point p1 = new Point();
Point p2 = new Point();
Point p3 = new Point();

print("Insert the x position of the up left corner: ");
p1.x = Double.parseDouble(System.console().readLine());
print("Insert the y position of the upper left corner: ");
p1.y = Double.parseDouble(System.console().readLine());

boolean p2_correct = false;

while (!p2_correct){
	print ("\nInsert the x position of the down right corner: ");
	p2.x = Double.parseDouble(System.console().readLine());
	print ("Insert the y position of the down right corner: ");
	p2.y = Double.parseDouble(System.console().readLine());
	if (p2.x <= p1.x || p2.y >= p1.y){
		p2_correct = false;
		println ("The position of the point is incorrect, it must be the down right corner of the rectangle, please insert the position");
	}else if(p2_correct == false){
		p2_correct = true;
	}
}

print ("\nInsert the x position of the third point: ");
p3.x = Double.parseDouble(System.console().readLine());
print ("Insert the y position of the third corner: ");
p3.y = Double.parseDouble(System.console().readLine());


rect.upLeft = p1;
rect.downRight = p2;

if (p3.x < rect.upLeft.x || p3.x > rect.downRight.x || p3.y > rect.upLeft.y || p3.y < rect.downRight.y ){
	println ("\nThe third point is outside the rectangle area");
}else{
	println ("\nThe third point is inside the rectangle area");
}