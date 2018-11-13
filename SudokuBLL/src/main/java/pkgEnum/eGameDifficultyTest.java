package pkgEnum;


import static org.junit.Assert.*;

import org.junit.Test;


public class eGameDifficultyTest {

	@Test
	public void get_Test1() {
		eGameDifficulty easy = eGameDifficulty.EASY;
		eGameDifficulty medium = eGameDifficulty.MEDIUM;
		eGameDifficulty hard = eGameDifficulty.HARD;
		assertTrue(eGameDifficulty.get(0) == null);
		assertTrue(eGameDifficulty.get(99) == null);
		assertTrue(eGameDifficulty.get(100) == easy);
		assertTrue(eGameDifficulty.get(499) == easy);
		assertTrue(eGameDifficulty.get(500) == medium);
		assertTrue(eGameDifficulty.get(1000) == hard);
		assertTrue(eGameDifficulty.get(1001) == hard);
		assertTrue(eGameDifficulty.get(Integer.MAX_VALUE) == hard);
	}


}
