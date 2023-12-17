package homework.unit42;

interface Foo {
    int bar();
}

public class Beta {
    class A implements Foo {
        public int bar() {
            return 1;
        }
    }

    public int fubar(Foo foo) {
        return foo.bar();
    }

    public void testFoo() {
        class A implements Foo {
            public int bar() {
                return 2;
            }
        }
        System.out.println(fubar(new A()));
    }

    public static void main(String[] args) {
        new Beta().testFoo();
    }
}

// Which of the following statements are true? (Choose all that apply)
// A. Compilation fails.
// B. The code complies and the output is 2.
// C. If lines 8-12 are removed, compilation fails.
// D. If lines 19-22 are removed, compilation fails.
// E. If lines 8-12 are removed, the code would compile and the output would be 2.
// F. If lines 19-22 are removed, the code would compile and the output would be 1.

// Answer
// B, E, F
