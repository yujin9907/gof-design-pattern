package template;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay s = new StringDisplay("문자열");
        AbstractDisplay  c = new CharDisplay('C');

        s.print();
        c.print();
    }
}
