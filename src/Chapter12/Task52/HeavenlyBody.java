package Chapter12.Task52;

import java.util.HashSet;
import java.util.Set;

public abstract class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;

    public enum BodyType {
        PLANET,
        DRAFT_PLANET,
        MOON
    }

    public HeavenlyBody(String heavenlyBodyName, double orbitalPeriod, BodyType bodyType) {
        this.key = new Key(heavenlyBodyName, bodyType);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public boolean addSatellite(HeavenlyBody heavenlyBody) {
        return this.satellites.add(heavenlyBody);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<HeavenlyBody>(satellites);
    }

    public Key getKey() {
        return key;
    }

    public static Key makeKey(String name, BodyType bodyType) {
        return new Key(name, bodyType);
    }

    @Override
    public int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof HeavenlyBody) {
            HeavenlyBody heavenlyBody = (HeavenlyBody) obj;
            return this.key.equals(heavenlyBody.getKey());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.key.getName() +  ": " + this.key.bodyType + ", " + orbitalPeriod;
    }

    public static final class Key {
        private String name;
        private BodyType bodyType;

        private Key(String name, BodyType bodyType) {
            this.name = name;
            this.bodyType = bodyType;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key = (Key) obj;
            return this.name.equals(key.getName()) && this.bodyType == key.getBodyType();
        }

        @Override
        public String toString() {
            return name + ": " + bodyType;
        }
    }
}
