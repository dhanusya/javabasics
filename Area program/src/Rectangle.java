
public class Rectangle {
	int length;
	int width;
	int side;
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		if(length>0.0 && width<20.0)
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		if(length>0.0 && width<20.0)
		this.width = width;
	}
	public Rectangle(int side){
		this.side=side;
	}
	public Rectangle(int length,int width){
		this.length=length;
		this.width=width;
		}
	public int findArea()
	{
		return(length*width);
	}
	public static void main(String args[]){
		Rectangle s=new Rectangle(12,6);
		Rectangle s1=new Rectangle(4,6);
		s.findArea();
		s1.findArea();
		System.out.println(s.findArea());
		System.out.println(s1.findArea());
		
		
	}
	

}





