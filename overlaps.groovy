class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}

Rectangle r1 = new Rectangle();
Rectangle r2 = new Rectangle();

Point p1 = new Point();
Point p2 = new Point();
Point p3 = new Point();
Point p4 = new Point();
Point p5 = new Point();

print("Insert the x position of the up left corner of the first rectangle: ");
p1.x = Double.parseDouble(System.console().readLine());
print("Insert the y position of the up left corner of the first rectangle: ");
p1.y = Double.parseDouble(System.console().readLine());

boolean p2_correct = false;

while (!p2_correct){
	print ("\nInsert the x position of the down right corner of the first rectangle: ");
	p2.x = Double.parseDouble(System.console().readLine());
	print ("Insert the y position of the down right corner of the first rectangle: ");
	p2.y = Double.parseDouble(System.console().readLine());
	if (p2.x <= p1.x || p2.y >= p1.y){
		p2_correct = false;
		println ("The position of the point is incorrect, it must be the down right corner of the rectangle, please insert the position");
	}else if(p2_correct == false){
		p2_correct = true;
	}
}

print("\nInsert the x position of the up left corner of the second rectangle: ");
p3.x = Double.parseDouble(System.console().readLine());
print("Insert the y position of the up left corner of the second rectangle: ");
p3.y = Double.parseDouble(System.console().readLine());

boolean p4_correct = false;

while (!p4_correct){
	print ("\nInsert the x position of the down right corner of the second rectangle: ");
	p4.x = Double.parseDouble(System.console().readLine());
	print ("Insert the y position of the down right corner of the second rectangle: ");
	p4.y = Double.parseDouble(System.console().readLine());
	if (p4.x <= p3.x || p4.y >= p3.y){
		p4_correct = false;
		println ("The position of the point is incorrect, it must be the down right corner of the rectangle, please insert the position");
	}else if(p4_correct == false){
		p4_correct = true;
	}
}

print ("\nInsert the x position of the fifth point: ");
p5.x = Double.parseDouble(System.console().readLine());
print ("Insert the y position of the fifth corner: ");
p5.y = Double.parseDouble(System.console().readLine());

r1.upLeft = p1;
r1.downRight = p2;
r2.upLeft = p3;
r2.downRight = p4;

boolean inside_r1=true;
boolean inside_r2=true;

if (p5.x < r1.upLeft.x || p5.x > r1.downRight.x || p5.y > r1.upLeft.y || p5.y < r1.downRight.y ){
	inside_r1=false;
}
if (p5.x < r2.upLeft.x || p5.x > r2.downRight.x || p5.y > r2.upLeft.y || p5.y < r2.downRight.y ){
	inside_r2=false;
}

if(inside_r1 && inside_r2){
	println ("The point is inside both rectangles");
}else if(inside_r1){
	println ("The point is inside the first rectangle only");
}else if(inside_r2){
	println("The point is inside the second rectangle only");
}else{
	println("The point is outside both rectangles");
}

