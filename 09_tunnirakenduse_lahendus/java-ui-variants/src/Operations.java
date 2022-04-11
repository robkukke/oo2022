public abstract class Operations {
    private final String title;
    Operations(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }

    abstract double operate(int a, int b);
    static class OpAdd extends Operations {
        OpAdd() {
            super("+");
        }
        double operate(int a, int b) {
            return a + b;
        }
    }
    static class OpSub extends Operations {
        OpSub() {
            super("-");
        }
        double operate(int a, int b) {
            return a - b;
        }
    }
    static class OpMul extends Operations {
        OpMul() {
            super("*");
        }
        double operate(int a, int b) {
            return a * b;
        }
    }
    static class OpDiv extends Operations {
        OpDiv() {
            super("/");
        }
        double operate(int a, int b) {
            return ((double) a) / b;
        }
    }
}