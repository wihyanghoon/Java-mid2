package generic.test.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {
    public static void main(String[] args) {
        Box<Object> objbox = new Box<>();
        Box<Dog> dogbox = new Box<>();
        Box<Cat> catBox = new Box<>();


        dogbox.set(new Dog("멍멍이", 200));

        WildcardEx.printGenericV1(dogbox);
        WildcardEx.printGenericV2(dogbox);
        Dog dog = WildcardEx.printAndReturnGeneric(dogbox);
    }
}
