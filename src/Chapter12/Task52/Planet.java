package Chapter12.Task52;
public class Planet extends HeavenlyBody{
    public Planet(String heavenlyBodyName, double orbitalPeriod) {
        super(heavenlyBodyName, orbitalPeriod, BodyType.PLANET);
    }

    @Override
    public boolean addSatellite(HeavenlyBody heavenlyBody) {
        return heavenlyBody.getKey().getBodyType() == BodyType.MOON && super.addSatellite(heavenlyBody);
    }
}
