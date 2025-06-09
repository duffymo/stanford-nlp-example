package nlp.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PartOfSpeechExampleTest {

    @Test
    public void testTagSuccess() {
        // setup
        String text = "The quick brown fox jumped over the lazy dog.";
        String [] expected = {
                "The_DT",
                "quick_JJ",
                "brown_JJ",
                "fox_NN",
                "jumped_VBD",
                "over_IN",
                "the_DT",
                "lazy_JJ",
                "dog_NN",
                "._."
        };
        // exercise
        String [] actual = PartOfSpeechExample.tag(text);
        // assert
        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; ++i) {
            Assertions.assertEquals(expected[i], actual[i]);
        }
    }
}
