package nlp.example;// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import edu.stanford.nlp.tagger.maxent.MaxentTagger;

import java.io.IOException;

/**
 * Stanford NLP examples here: <a href="https://codingtechroom.com/tutorial/java-basic-nlp-with-stanford-nlp-library">...</a>
 * Trying to solve the problem posed by <a href="https://stackoverflow.com/questions/79657553/identify-if-a-word-is-a-verb-and-change-it-to-the-verbs-noun-form-gerund-in-j?noredirect=1#comment140497061_79657553">...</a>
 */
public class PartOfSpeechExample {

    public static void main(String[] args) {
        try {
            // Create a document
            String text = "The quick brown fox jumped over the lazy dog.";
            String [] tags = tag(text);
            for (int i = 0; i < tags.length; i++) {
                System.out.println(tags[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * See <a href="https://www.devglan.com/artificial-intelligence/stanford-nlp-pos-tagger-example"/>
     * @param text
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static String [] tag(String text) {
        MaxentTagger maxentTagger = new MaxentTagger("english-left3words-distsim.tagger");;
        String tag = maxentTagger.tagString(text);
        return tag.split("\\s+");
    }
}