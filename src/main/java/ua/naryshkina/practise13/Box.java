package ua.naryshkina.practise13;
import com.google.gson.annotations.SerializedName;

public class Box {
    private String from;
    private String material;
    private String color;

    @SerializedName("max-lifting-capacity")
    private MaxLiftingCapacity maxLiftingCapacity;

    @SerializedName("delivery-date")
    private String deliveryDate;

    private Cargo cargo;

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity +
                ", deliveryDate='" + deliveryDate + '\'' +
                ", cargo=" + cargo +
                '}';
    }

    static class MaxLiftingCapacity {
        private String unit;
        private int value;

        @Override
        public String toString() {
            return "{" +
                    "unit='" + unit + '\'' +
                    ", value=" + value +
                    '}';
        }
    }

    static class Cargo {
        private String name;

        @SerializedName("class")
        private String clazz;

        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", clazz='" + clazz + '\'' +
                    '}';
        }
    }
}
