package ua.naryshkina.practise13;

import com.google.gson.Gson;

public class GsonBox {
    public static void main(String[] args) {
        String json = """
                {
                    "from": "China",
                    "material": "steel",
                    "color": "black",
                    "max-lifting-capacity": {
                        "unit": "kg",
                        "value": 170
                    },
                    "cargo": {
                        "name": "electronics",
                        "clazz": "C-1"
                    },
                    "delivery-date": "2021-09-20T11:07:00"
                }
                """;

        Gson gson = new Gson();
        System.out.println(gson.fromJson(json, Box.class));
    }
}