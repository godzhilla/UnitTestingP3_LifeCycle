import org.example.ScoreCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScoreCollectionTest {

    @Test
    void testAddScore(){
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.addScore(75);
        scoreCollection.addScore(60);
        Assertions.assertEquals(75, scoreCollection.scores.get(0));
        Assertions.assertEquals(60, scoreCollection.scores.get(1));
    }
    @Test
    void testAverageScore(){
        ScoreCollection scoreCollection = new ScoreCollection();
        scoreCollection.addScore(90);
        scoreCollection.addScore(75);
        Assertions.assertEquals(82.5, scoreCollection.avergeScore());

    }
}
