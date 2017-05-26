package bg.proxiad.courses.web.model;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ScoringServiceTest {

	@Test
	public void test() {
		ScoringService service = new ScoringServiceImpl();
		Assert.assertEquals(0, service.listOngoingMatches().size());
		
		Match match = service.createMatch("Gosho", "Tosho", 3);
		Assert.assertEquals(1, service.listOngoingMatches().size());
		Assert.assertEquals("Gosho", match.getPlayers()[0]);
		Assert.assertEquals("Tosho", match.getPlayers()[1]);
		Assert.assertEquals(3, match.getGamesNumber());
	}

}
