package sing;

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class SingTest {
	String actual = "";
	PrintStream fakePrintStream;
	List<String> expected = Arrays.asList(
			"青き海原　はるかに望み",
			"きらめく翼よ　今幸あれ",
			"雲つらぬく轟き　見守るわれら",
			"夢はてしなき　大空に",
			"翔ける歓び　ともに",
			"航空保安大学校\n",
			"緑の大地に　そよ風かおり",
			"豊けき学び舎　今幸あれ",
			"声かけあい励まし　青春われら",
			"歌こだまする　大空に",
			"学ぶ歓び　ともに",
			"航空保安大学校\n",
			"真白き雲間に　新たな道を",
			"広がる世界よ　今幸あれ",
			"音速超えゆく時代の　若人われら",
			"星めぐり逢う　大空に",
			"生きる歓び　ともに",
			"航空保安大学校\n");


	@Before
	public void setUp() throws Exception{
		// Arrange
		fakePrintStream = new PrintStream("ファイル名はここではどうでもいい") {
			@Override
			public void println(String str) {
				actual = str;
			}
		};
	}
	/***** singLine1メソッド *****/
	@Test
	public void singLine1メソッド引数0を実行して1番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine1(0);
		// Assert
        assertEquals(expected.get(0), actual);
	}
	@Test
	public void singLine1メソッド引数0を実行して2番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine1(1);
		// Assert
        assertEquals(expected.get(6), actual);
	}
	@Test
	public void singLine1メソッド引数0を実行して3番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine1(2);
		// Assert
        assertEquals(expected.get(12), actual);
	}

	/***** singLine2メソッド *****/
	@Test
	public void singLine2メソッド引数0を実行して1番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine2(0);
		// Assert
        assertEquals(expected.get(1), actual);
	}
	@Test
	public void singLine2メソッド引数0を実行して2番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine2(1);
		// Assert
        assertEquals(expected.get(7), actual);
	}
	@Test
	public void singLine2メソッド引数0を実行して3番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine2(2);
		// Assert
        assertEquals(expected.get(13), actual);
	}

	/***** singLine3メソッド *****/
	@Test
	public void singLine3メソッド引数0を実行して1番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine3(0);
		// Assert
        assertEquals(expected.get(2), actual);
	}
	@Test
	public void singLine3メソッド引数0を実行して2番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine3(1);
		// Assert
        assertEquals(expected.get(8), actual);
	}
	@Test
	public void singLine3メソッド引数0を実行して3番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine3(2);
		// Assert
        assertEquals(expected.get(14), actual);
	}

	/***** singLine4メソッド *****/
	@Test
	public void singLine4メソッド引数0を実行して1番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine4(0);
		// Assert
        assertEquals(expected.get(3), actual);
	}
	@Test
	public void singLine4メソッド引数0を実行して2番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine4(1);
		// Assert
        assertEquals(expected.get(9), actual);
	}
	@Test
	public void singLine4メソッド引数0を実行して3番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine4(2);
		// Assert
        assertEquals(expected.get(15), actual);
	}

	/***** singLine5メソッド *****/
	@Test
	public void singLine5メソッド引数0を実行して1番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine5(0);
		// Assert
        assertEquals(expected.get(4), actual);
	}
	@Test
	public void singLine5メソッド引数0を実行して2番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine5(1);
		// Assert
        assertEquals(expected.get(10), actual);
	}
	@Test
	public void singLine5メソッド引数0を実行して3番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine5(2);
		// Assert
        assertEquals(expected.get(16), actual);
	}

	/***** singLine6メソッド *****/
	@Test
	public void singLine6メソッド引数0を実行して1番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine6(0);
		// Assert
        assertEquals(expected.get(5), actual);
	}
	@Test
	public void singLine6メソッド引数0を実行して2番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine6(1);
		// Assert
        assertEquals(expected.get(11), actual);
	}
	@Test
	public void singLine6メソッド引数0を実行して3番1行目が表示されるtest(){
		// Act
		System.setOut(fakePrintStream);
		Sing.singLine6(2);
		// Assert
        assertEquals(expected.get(17), actual);
	}
}

