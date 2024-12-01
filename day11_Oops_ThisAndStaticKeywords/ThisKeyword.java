package day11_Oops_ThisAndStaticKeywords;

public class ThisKeyword {
	int x,y;
	
	/*ThisKeyword(int x,int y){
		x=x;
		y=y;
	}*/
	
	/*ThisKeyword(int x,int y){
		this.x=x;
		this.y=y;
	}*/
	
	void setData(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		ThisKeyword t1=new ThisKeyword();
		t1.setData(10,20);
		t1.display();
	}

}
