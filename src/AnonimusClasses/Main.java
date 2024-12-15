package AnonimusClasses;

public class Main {
    public static void main(String[] args) {
        Printer message = new Printer() {
            @Override
            public void print() {
                System.out.println("Hi, I'm a student");
            }
        };
        message.print();

        Printer message2 = () -> System.out.println("Hi, I'm also a student");
        message2.print();

        PrinterPlus message3 = (m) -> {
            String name = m;
            System.out.println("В имени " + m + " - " + m.length() + " букв");
            return name;
        };
        message3.message("Никита");

    }
}
