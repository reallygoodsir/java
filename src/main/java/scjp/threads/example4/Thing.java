package scjp.threads.example4;

public class Thing {
    private static int staticField;
    private int nonstaticField;

    public static synchronized int getStaticField() {
        return staticField;
    }

    public static synchronized void setStaticField(int sf) {
        staticField = sf;
    }

    public synchronized int getNonstaticField() {
        return nonstaticField;
    }

    public synchronized void setNonstaticField(int nonstaticField) {
        this.nonstaticField = nonstaticField;
    }
}
