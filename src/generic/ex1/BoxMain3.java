package generic.ex1;

public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> genericBox = new GenericBox<Integer>();
        genericBox.set(100);
        Integer integer = genericBox.get();
        System.out.println("integer = " + integer);

        GenericBox<String> genericBox2 = new GenericBox<String>();
        genericBox2.set("hello");
        String string = genericBox2.get();
        System.out.println("string = " + string);
    }
}
