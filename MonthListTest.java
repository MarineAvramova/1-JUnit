import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MonthListTest {

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setting up...");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testArrayListShouldHave11positions() {
		MonthList list = new MonthList("MonthList");
		list.addMonth();
		assertEquals(12, list.getMonths().size());
	}
	
	@Test
	void testArrayListShouldNotHaveNull() {
		MonthList list = new MonthList("MonthList");
		list.addMonth();
		for(String month : list.getMonths()) {
			assertFalse(month == null);
		}
	}
	
	@Test
	void testArrayListPosition8ContainAugust() {
		MonthList list = new MonthList("MonthList");
		list.addMonth();
		System.out.println(list.getMonths());
		//for(String month : list.getMonths()) {
		assertEquals("August", list.getMonths().get(7), "August is in index 7");
		//}
	}
}
