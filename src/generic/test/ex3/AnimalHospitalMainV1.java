package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 animalHospital1 = new AnimalHospitalV1();
        AnimalHospitalV1 animalHospital2 = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍이1", 200);
        Cat cat = new Cat("야옹이1", 100);

        animalHospital1.set(dog);
        animalHospital1.checkUp();

        animalHospital2.set(cat);
        animalHospital2.checkUp();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat);

        // 문제2: 개 타입 반환
        animalHospital1.set(dog);
        Dog biggerDog = (Dog) animalHospital1.bigger(new Dog("멍멍이2", 300));
        System.out.println("biggerDog = " + biggerDog);
    }
}
