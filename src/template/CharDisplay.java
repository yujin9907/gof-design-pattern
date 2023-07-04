package template;

public class CharDisplay extends AbstractDisplay{
    private char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.println("char open");
    }

    @Override
    public void print() {
        System.out.println(this.ch);
    }

    @Override
    public void close() {
        System.out.println("char close");
    }
}
