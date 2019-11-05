package ch.hslu.sw07;

/**
 * People got to sleep
 * @author robin
 */
public interface Sleepable {
    /**
     * Is awake?
    */
    boolean isAwake();

    /**
     * Send to Sleep
     */
    void sendToSleep();

    /**
     *  Wake Up.
     */
    void wakeUp();
}
