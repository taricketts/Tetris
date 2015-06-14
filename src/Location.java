public class Location {
	
private int x;
private int y;

	public Location(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Location(){
		this.x = 0;
		this.y = 0;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public void setXY(int x, int y){
		this.x = x;
		this.y = y;
	}
}
