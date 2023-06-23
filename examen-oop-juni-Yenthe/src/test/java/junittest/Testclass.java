package junittest;
import static org.junit.Assert.assertSame;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.
import helloWorld.Cities;
public class Testclass {
Cities tracktable = new Cities();


@Test 
public void TestTrackFuplicate() {
	//geen idee
	
	
}

@Test 
public void TestTrackbestaand() {
		assertNotNull(Cities.Composer);

	
}
@Test 
public void TestTracknaam() {
		assertGreaterThan(3, Cities.Name.length);

	
}
@Test 
public void TestTrackbestaand() {
	assertGreaterThan(5000, Cities.Miliseconds);

	
}
@Test
public void TestTrackSpam() {
	
	assertNotSame("fuck", Cities.Name);
}



}