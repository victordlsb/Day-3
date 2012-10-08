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

rect.upLeft = p1;
rect.downRight = p2;

double area = Math.abs(rect.upLeft.x-rect.downRight.x)*Math.abs(rect.upLeft.y-rect.downRight.y);
println ("\nThe area of the rectangle is: " + area);