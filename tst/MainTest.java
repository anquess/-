import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MainTest {

	@Test
	public void mainメソッドを実行して校歌が表示されるtest() throws Exception{
		// Arrange
		final List<String> actual = new ArrayList<String>();
		PrintStream fakePrintStream = new PrintStream("ファイル名はここではどうでもいい") {
			@Override
			public void println(String str) {
				actual.add(str);
				}
		};

		// Act
		System.setOut(fakePrintStream);
		Main.main(null);

		// Assert
		List<String> expected = Arrays.asList("青き海原　はるかに望み", "きらめく翼よ　今幸あれ",
				"雲つらぬく轟き　見守るわれら", "夢はてしなき　大空に", "翔ける歓び　ともに",
				"航空保安大学校\n", "緑の大地に　そよ風かおり", "豊けき学び舎　今幸あれ",
				"声かけあい励まし　青春われら", "歌こだまする　大空に", "学ぶ歓び　ともに",
				"航空保安大学校\n", "真白き雲間に　新たな道を", "広がる世界よ　今幸あれ",
				"音速超えゆく時代の　若人われら", "星めぐり逢う　大空に", "生きる歓び　ともに",
				"航空保安大学校\n");
        assertEquals(expected, actual);
	}

}
