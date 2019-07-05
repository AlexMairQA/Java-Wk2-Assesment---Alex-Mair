package javawk2;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MagicCompass extends Swamp{
	
	private List<Landmarks> allTheLandMarks;
	
	Double x, y;
//	Double north=y;
//	Double south=-y;
//	Double west=x;
//	Double east=-x;
	private static MagicCompass compass;
	
	
	
	
	
	private MagicCompass()
	{
		
		this.allTheLandMarks= Arrays.asList(new Landmarks("Treasure Chest", 1d, 1d), new Landmarks("Giant Cave", 3d, 9d), new Landmarks("Peat Bog of Death", 10d, 10d));
	}
	public static MagicCompass getInstanceOf() {
		if(compass==null) {
			compass=new MagicCompass();
		}
		return compass;
	}
	
	
	public String move(Character direction) {
		
		Random walk= new Random();
		Double d=10*walk.nextDouble();
		switch(direction) {
		case 'N':
			compass.calculateCurrentPosition(0d, d);
			break;
		case 'S':
			compass.calculateCurrentPosition(0d, -d);
			break;
		case 'E':
			compass.calculateCurrentPosition(-d, 0d);
		case 'W':
			compass.calculateCurrentPosition(d,0d);
			break;
		default:
			break;
		}
		DecimalFormat df = new DecimalFormat("#0.00");
		return String.format("The dial reads "+df.format(d)+"m");
		
	}
	
	public void calculateCurrentPosition(Double x, Double y) {
		setX(getX()+x);
		setY(getY()+y);
	}
	
	public String distanceToNearestLandmark() {
		int i = 0;
		Double prev=Math.hypot(allTheLandMarks.get(i).getX(), allTheLandMarks.get(i).getY());
		Double x=allTheLandMarks.get(i).getX();
		Double y=allTheLandMarks.get(i).getY();
		Double minVal=null;
		for (; i < allTheLandMarks.size(); i++) {
		minVal=Math.min(prev, Math.hypot(x, y));
		prev=Math.hypot(x, y);
		
		}
		
		DecimalFormat df = new DecimalFormat("#0.00");
		return String.format("The dial reads "+df.format(minVal)+"m");
	}
	
	public Double returnCurrentPosition() {
		return Math.hypot(getX(), getY());
	}
	
	
	
	
}
