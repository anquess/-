package lyrics;
import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LyricsFactoryTest {
	String actual = "";
	PrintStream fakePrintStream;
	List<String> expected = Arrays.asList(
			null,
			null,
			"　今幸あれ",
			"われら",
			"　大空に",
			"歓び　ともに",
			"航空保安大学校\n");


	@Test
	public void singAddSame0行目はnullTest() throws Exception {
		int line = 0;
		// Act
		actual = LyricsFactory.singAddSame(line);
		// Assert
        assertEquals(expected.get(line), actual);
	}

	@Test
	public void singAddSame1行目はnullTest() throws Exception {
		int line = 1;
		// Act
		actual = LyricsFactory.singAddSame(line);
		// Assert
        assertEquals(expected.get(line), actual);
	}

	@Test
	public void singAddSame2行目はnullTest() throws Exception {
		int line = 2;
		// Act
		actual = LyricsFactory.singAddSame(line);
		// Assert
        assertEquals(expected.get(line), actual);
	}

	@Test
	public void singAddSame3行目はnullTest() throws Exception {
		int line = 3;
		// Act
		actual = LyricsFactory.singAddSame(line);
		// Assert
        assertEquals(expected.get(line), actual);
	}

	@Test
	public void singAddSame4行目はnullTest() throws Exception {
		int line = 4;
		// Act
		actual = LyricsFactory.singAddSame(line);
		// Assert
        assertEquals(expected.get(line), actual);
	}

	@Test
	public void singAddSame5行目はnullTest() throws Exception {
		int line = 5;
		// Act
		actual = LyricsFactory.singAddSame(line);
		// Assert
        assertEquals(expected.get(line), actual);
	}

	@Test
	public void singAddSame6行目はnullTest() throws Exception {
		int line = 6;
		// Act
		actual = LyricsFactory.singAddSame(line);
		// Assert
        assertEquals(expected.get(line), actual);
	}


}
