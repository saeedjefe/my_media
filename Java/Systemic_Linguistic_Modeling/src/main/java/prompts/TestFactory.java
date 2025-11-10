package prompts;

public class TestFactory {

    static String question = "Access to clear water is basic human right." +
            "Therefore every home should have a water supply that " +
            "is provided free of charge.";

    public static IeltsWritingTask2 produce(){

       return new IeltsWritingTask2.Builder().setBook(19).setTest(2).setTypes(WT2TYPES.AGREE_0R_DISAGREE).setText(question).build();

    }
}
