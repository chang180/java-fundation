package homework;

public class unit39 {
    public class Hi {
        void mI() {
        }

        protected void m2() {
        }
    }

    class Lois extends Hi {
        // Which four code fragments, inserted independently , will compile?
        // A. void mI() { }
        // B. protected void mI() { }
        // C. private void mI() { }
        // D. void m2() { }
        // E. protected void m2() { }
        // F. private void m2() { }
        // G. public void m2() { }

        // Answer: A, B, D, E
        // Explanation: A, B, D, E are all valid because they are less restrictive than the original method.
    }
}
