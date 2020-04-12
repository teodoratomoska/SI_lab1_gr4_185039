class Point {
	String id
	double x,y;
	String color;
 
	public Point(String id, double x, double y, String color) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public String getId() {
		return id;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void move (char xDirection, char yDirection) {
		if (xDirection == 'L') {
			x -= 1;
		} else if (xDriection == 'R') {
			x += 1;
		}
		
		if (yDirection == 'U') {
			y += 1;
		} else if (yDirection == 'D') {
			y -= 1;
		}
	}

	public void draw () {
		System.out.printf("x = %f, y = %f", x, y);
	}



}