package homework;

public class unit41 {
    public static void main(String[] args) {
        noise();
    }

    public static void noise() {
        Animal animal = new Dog();
        Cat cat = (Cat) animal; // 子類別間並無繼承關係，所以無法轉型，會在執行時期出現錯誤
        System.out.println(cat.noise());
    }

    static class Animal {
        public String noise() {
            return "peep";
        }
    }

    static class Dog extends Animal {
        public String noise() {
            return "bark";
        }
    }

    static class Cat extends Animal {
        public String noise() {
            return "meow";
        }
    }
}
