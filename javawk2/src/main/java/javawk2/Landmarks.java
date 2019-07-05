package javawk2;

import java.util.Random;

public class Landmarks extends Swamp{
	
	
	
	private String landmarkName;
	
	
	public Landmarks(String landmarkName, Double x, Double y)
	{
		super();
		setX(x);
		setY(y);
		this.landmarkName=landmarkName;
	}



	public String getLandmarkName() {
		return landmarkName;
	}


	public void setLandmarkName(String landmarkName) {
		this.landmarkName = landmarkName;
	}
	
	

}
