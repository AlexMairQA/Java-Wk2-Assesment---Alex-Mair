package javawk2;

public class PlayerPOV {
	
	public static void play() {
	
	MagicCompass compass= MagicCompass.getInstanceOf();
	
	compass.calculateCurrentPosition(0d, 0d);
	
	System.out.println(compass.distanceToNearestLandmark());
	}

}
