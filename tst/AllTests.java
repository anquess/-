import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ MainTest.class, lyrics.LyricsFactoryTest.class, sing.SingTest.class })
public class AllTests {

}
