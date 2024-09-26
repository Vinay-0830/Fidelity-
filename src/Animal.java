public class Animal {
    public void eat(){
        System.out.println("this animal eats food");
    }

}
//multilevel inheritance
//class Mammal extends Animal {
//    public void walk(){
//        System.out.println("this mammal is walking");
//    }
//}

class Dog extends Animal {
    public void bark(){
        System.out.println("this dog is barking");
    }
//    method overriding
    public void eat(){
        System.out.println("this dog eats bones");
    }
}

class Cat extends Animal {
    void meow(){
        System.out.println("this cat is meowing");
    }
//    method overriding
    public void eat(){
        System.out.println("this cat eats fish");
    }
}


