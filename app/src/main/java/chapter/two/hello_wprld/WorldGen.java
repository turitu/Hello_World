package chapter.two.hello_wprld;

/**
 * Created by mlandin on 2/20/14.
 */
public class WorldGen {
    String planetName = "Earth";
    int planetMass;
    double planetGravity;

    int planetColonies;
    long planetPopulation;
    int planetBases;
    int planetMilitary;
    boolean planetProtection;

    public WorldGen(String planetName, int planetMass, double planetGravity) {
        this.planetGravity = planetGravity;
        this.planetName = planetName;
        this.planetMass = planetMass;

        planetColonies = 0;
        planetPopulation = 0;
        planetBases = 0;
        planetMilitary = 0;
        planetProtection = false;
    }

    public void setPlanetColonies(int numColonies) {
        this.planetColonies += numColonies;
    }

    public int getPlanetColonies() {
        return planetColonies;
    }

    public void setPlanetMilitary(int numBases) {
        this.planetBases += numBases;
    }

    public int getPlanetMilitary() {
        return planetBases;
    }

    public void turnForceFieldOn() {
        this.planetProtection = true;
    }
    public void turnForceFieldOff() {
        this.planetProtection = false;
    }

    public boolean getForceFieldState() {
        return planetProtection;
    }
    public void setColonyImmigration(long numColonists) {
        this.planetPopulation = numColonists;
    }

    public long getColonyImmigration() {
        return planetPopulation;
    }


    public void setBaseProtection(int numForces) {
        planetMilitary += numForces;
    }

    public int getBaseProtection() {
        return planetMilitary;
    }
}
