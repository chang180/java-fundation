package homework.unit45;

public class GenericB<T> {
    public T foo;
    public void setFoo(T foo) {
        this.foo = foo;
    }
    public T getFoo() {
        return foo;
    }

    public static void main(String[] args) {
        GenericB<Cat> bar = new GenericB<Cat>();
        bar.setFoo(new Cat());
        Cat c = bar.getFoo();
    }
}
interface Pet{}
class Cat implements Pet{}

// Code
// ? extends Pet
// T extends Pet
// ? implements Pet
// T implements Pet
// Pet extends T
// ?
// T
// <?>
// <Pet>
