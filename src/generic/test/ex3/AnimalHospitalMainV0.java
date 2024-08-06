package generic.test.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 200);
        Cat cat = new Cat("야옹이1", 100);

        dogHospital.set(dog);
        dogHospital.checkUp();

        catHospital.set(cat);
        catHospital.checkUp();

        // 문제1: 개 병원에 고양이 전달
        // dogHospital.set(cat);

        // 문제2: 개 타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 300));
        System.out.println("biggerDog = " + biggerDog);
    }
}
