package ua.naryshkina.practise13;
import com.google.gson.annotations.SerializedName;

public class Box {
    private String from;
    private String material;
    private String color;

    @SerializedName("max-lifting-capacity")
    private MaxLiftingCapacity maxLiftingCapacity;

    private Cargo cargo;

    @SerializedName("delivery-date")
    private String deliveryDate;

    // Геттеры и сеттеры

    @Override
    public String toString() {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", maxLiftingCapacity=" + maxLiftingCapacity + '\'' +
                ", cargo=" + cargo + '\'' +
                ", deliveryDate='" + deliveryDate + '\'' +
                '}';
    }

    static class MaxLiftingCapacity {


        @Override
        public String toString() {
            return "{" +
                    "unit='" + "kg" + '\'' +
                    ", value=" + 150 +
                    '}';
        }
    }

    static class Cargo {

        @Override
        public String toString() {
            return "{" +
                    "name='" + "electronics" + '\'' +
                    ", clazz='" + "C-1" + '\'' +
                    '}';
        }
    }
}
