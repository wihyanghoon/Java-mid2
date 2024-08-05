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

        GenericBox<Double> genericBox3 = new GenericBox<>();
        genericBox3.set(3.14);
        Double d = genericBox3.get();
        System.out.println("d = " + d);

        // 타입 추론: 생성하는 제네릭 타입 생략 가능
        GenericBox<Float> genericBox4 = new GenericBox<>();
    }
}
