import java.util.StringJoiner;

public class Witcher {
    private String name;
    private String originLocation;

    private String sign = "N/A";
    private String mainWeapon = "N/A";
    private String secondaryWeapon = "N/A";

    @Override
    public String toString() {
        return new StringJoiner(", ", Witcher.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("originLocation='" + originLocation + "'")
                .add("sign='" + sign + "'")
                .add("mainWeapon='" + mainWeapon + "'")
                .add("secondaryWeapon='" + secondaryWeapon + "'")
                .toString();
    }

    public interface  NameFieldBuilder {
        OriginLocationFieldBuilder withName(String name);
    }

    public interface OriginLocationFieldBuilder {
        OptionalFieldBuilder withOriginLocation(String originLocation);
    }

    public interface OptionalFieldBuilder {
        OptionalFieldBuilder withSign(String sign);
        OptionalFieldBuilder withMainWeapon(String mainWeapon);
        OptionalFieldBuilder withSecondaryWeapon(String secondaryWeapon);
        Witcher build();
    }

    public static class Builder implements NameFieldBuilder, OriginLocationFieldBuilder, OptionalFieldBuilder {

        private Witcher witcher;

        private Builder() {
            witcher = new Witcher();
        }

        public static NameFieldBuilder witcher() {
            return new Builder();
        }

        public OriginLocationFieldBuilder withName(String name) {
            witcher.name = name;
            return this;
        }

        public OptionalFieldBuilder withOriginLocation(String originLocation) {
            witcher.originLocation = originLocation;
            return this;
        }

        public OptionalFieldBuilder withSign(String sign) {
            witcher.sign = sign;
            return this;
        }

        public OptionalFieldBuilder withMainWeapon(String mainWeapon) {
            witcher.mainWeapon = mainWeapon;
            return this;
        }

        public OptionalFieldBuilder withSecondaryWeapon(String secondaryWeapon) {
            witcher.secondaryWeapon = secondaryWeapon;
            return this;
        }

        public Witcher build() {
            return witcher;
        }
    }

}
