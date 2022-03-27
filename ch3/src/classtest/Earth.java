package classtest;

//static final : 상수
//상수 : 대문자로 표현한다.
public class Earth {
	static final double Earth_RADIUS=6400;
	final static double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA=4*Math.PI*Earth_RADIUS*Earth_RADIUS;
	}

}
