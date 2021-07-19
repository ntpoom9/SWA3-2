public class Box {
	
	double width,height,depth;
	
	Box(Box ob){
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	Box(double w,double h,double d){
		
		width = w;
		height = h;
		depth = d;
	}
	
	double volume() {
		return width * height * depth;
	}
	
}
