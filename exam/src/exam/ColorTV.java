package exam;

public class ColorTV extends TV {
int color;
	public ColorTV(int size,int color) {
		super(size);
		this.color=color;
		// TODO Auto-generated constructor stub
	}

	public void printProperty() {
		// TODO Auto-generated method stub
		System.out.print(getSize()+" 인치  "+color+" 컬러");
		
	}

}
