package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        // 위처럼 Animal dog = new Dog();이렇게 안해도 아래가 가능한거임ㅇㅇ
        // animal을 상속받았기에, Animal타입이 가능함
        Animal[] animalArr = {dog, cat, caw, duck};

        //변하지 않는 부분
        for (Animal animal : animalArr) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
        }
    }
}
