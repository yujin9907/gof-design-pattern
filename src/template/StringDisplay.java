package template;

public class StringDisplay extends AbstractDisplay{
    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    public StringDisplay() {
    }
    @Override
    public void open() {
        System.out.println("string open");
    }

    @Override
    public void print() {
        System.out.println(this.str);
    }

    @Override
    public void close() {
        System.out.println("string close");
    }
}

