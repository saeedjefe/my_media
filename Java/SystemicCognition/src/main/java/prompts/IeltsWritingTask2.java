package prompts;

public class IeltsWritingTask2 extends IeltsQuestions{

    private final int book;
    private final int test;
    private final String text;
   WT2TYPES types;

   public IeltsWritingTask2(Builder builder){
     this.book = builder.book;
     this.test = builder.test;
     this.types = builder.types;
       this.text = builder.text;
   }

    public int getTest()  {
        return test;
    }


    public int getBook()  {
        return book;
    }

    public WT2TYPES getTypes()  {
        return types;
    }

    public String getText(){
       return text;
    }

    public static class Builder {
       private int book;
       private int test;
       private String text;
       WT2TYPES  types;

       public Builder setBook(int book) {
           this.book = book;
           return this;
       }

       public Builder setTest(int test){
           this.test = test;
           return this;
       }

       public Builder setTypes(WT2TYPES types){
           this.types = types;
           return this;
       }

       public Builder setText(String text){
           this.text = text;
           return this;
       }

       public IeltsWritingTask2 build(){
           return new IeltsWritingTask2(this);
       }

    }
}

