package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	EASY(100), MEDIUM(500), HARD(1000);
	
	private final int iDifficultyValue;
	
	private static final Map<Integer,eGameDifficulty> lookup = new HashMap<Integer,eGameDifficulty>();
	static {
		for(eGameDifficulty d: eGameDifficulty.values()) {
			lookup.put(d.getiDifficultyValue(),d);
		}
	}
	
private eGameDifficulty (int iDifficultyValue) {
	this.iDifficultyValue=iDifficultyValue;
}
	
public int getiDifficultyValue() {
	return iDifficultyValue;
}

public static eGameDifficulty get(int iDifficultyValue) {
	eGameDifficulty difficulty = null;
	if (iDifficultyValue >= HARD.getiDifficultyValue()) {
		difficulty = HARD;
	} else if (iDifficultyValue >= MEDIUM.getiDifficultyValue()) {
		difficulty = MEDIUM;
	} else if (iDifficultyValue >= EASY.getiDifficultyValue()) {
		difficulty = EASY;
	}
	return difficulty;
}
}

	

