class Point {
	double x;
	double y;
}

Point[] points = new Point[3];
for (i=0;i<points.length;i++){
	points[i] = new Point();
}

for(i=0;i<3;i++){
	print("Insert the x position of the point " + i + ": ");
	points[i].x = Double.parseDouble(System.console().readLine());
	print("Insert the y position of the point " + i + ": ");
	points[i].y = Double.parseDouble(System.console().readLine());
	println ("");
}

double dist01 = Math.sqrt((points[0].x-points[1].x)*(points[0].x-points[1].x)+(points[0].y-points[1].y)*(points[0].y-points[1].y));
double dist02 = Math.sqrt((points[0].x-points[2].x)*(points[0].x-points[2].x)+(points[0].y-points[2].y)*(points[0].y-points[2].y));
double dist12 = Math.sqrt((points[1].x-points[2].x)*(points[1].x-points[2].x)+(points[1].y-points[2].y)*(points[1].y-points[2].y));

if(dist01 > dist02 || dist01 > dist12){
	if(dist02 > dist12){
		println ("Points 1 and 2 are closer to each other than the rest");
	}else{
		println ("Points 0 and 2 are closer to each other than the rest");
	}
} else {
	println ("Points 0 and 1 are closer to each other than the rest");
}