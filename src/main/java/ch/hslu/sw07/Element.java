package ch.hslu.sw07;

/**
 * @author robin
 */

public abstract class Element implements Comparable<Element> {

    private Temperatur temperature = new Temperatur();
    private String name;
    private double meltingpoint;
    private double boilingpoint;

    protected Element(String name, double meltingpoint, double boilingpoint, double tempCel) {
        this.name = name;
        this.temperature.setTempCels(tempCel);
        this.meltingpoint = meltingpoint;
        this.boilingpoint = boilingpoint;
    }

    public final String getState() {
        if (this.temperature.getTempCels() <= meltingpoint) {
            return "fest";
        } else if (this.temperature.getTempCels() <= boilingpoint) {
            return "flüssig";
        } else {
            return "gasförmig";
        }
    }

    public final String getName() {
        return this.name;
    };

    public final double getTempCels() {
        return this.temperature.getTempCels();
    }

    public String toString() {
        return this.getName() + " Zustand:" + this.getState();
    }

    /**
     * Zwei Element-Objekte werden anhand ihrer Temperatur verglichen
     */
    @Override
    public int compareTo(Element o) {
        return Double.compare(this.temperature.getTempCels(), o.getTempCels());
    }
}