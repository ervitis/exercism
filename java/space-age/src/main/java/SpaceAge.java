class SpaceAge {

    double time;
    final double EARTH = 31557600;
    final double MERCURY = 0.2408467;
    final double VENUS = 0.61519726;
    final double MARS = 1.8808158;
    final double JUPITER = 11.862615;
    final double SATURN = 29.447498;
    final double URANUS = 84.016846;
    final double NEPTUNE = 164.79132;

    SpaceAge(double seconds) {
        this.time = seconds;
    }

    double getSeconds() {
        return this.time;
    }

    double onEarth() {
        return this.time / EARTH;
    }

    double onMercury() {
        return onEarth() / MERCURY;
    }

    double onVenus() {
        return onEarth() / VENUS;
    }

    double onMars() {
        return onEarth() / MARS;
    }

    double onJupiter() {
        return onEarth() / JUPITER;
    }

    double onSaturn() {
        return onEarth() / SATURN;
    }

    double onUranus() {
        return onEarth() / URANUS;
    }

    double onNeptune() {
        return onEarth() / NEPTUNE;
    }

}
