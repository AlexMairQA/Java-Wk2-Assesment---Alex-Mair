package javawk2;



import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AssesmentTest {
	@Before
	public void init() {
		MagicCompass compass= MagicCompass.getInstanceOf();
		compass.calculateCurrentPosition(0d, 0d);
	}
	
	
	@Test
	public void compassOutput() {
		MagicCompass compass= MagicCompass.getInstanceOf();
		compass.calculateCurrentPosition(0d, 0d);
		String correct=compass.move('N');
		assertTrue("Dial reading", correct.contains("The dial reads"));
	}
	
	@Test
	public void distanceToLandmark() {
		MagicCompass compass= MagicCompass.getInstanceOf();
		compass.calculateCurrentPosition(0d, 0d);
		String correct=compass.distanceToNearestLandmark();
		assertTrue("Dial reading for distance to nearest landmark", correct.contains("The dial reads"));
	}
	

}
