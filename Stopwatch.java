package sample;

public class Stopwatch {

    private final long startTime;

    public Stopwatch() {
        startTime = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - startTime) / 1000.0;
    }

}
