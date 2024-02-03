package com.example.springboot.entity;

import java.util.HashMap;
import java.util.Map;

public enum Category {
    VEGETABLES(0),
    FRUITS(1),
    STATIONARY(2),
    SNACKS(3),
    CERALS(4),
    ESSENTAILS(5),
    SKINCARE(6),
    BABYCARE(7),
    BEVERAGES(8),
    NUTS(9),
    POOJAIITEMS(10),
	SOAP(11);

    private int value;
    private static Map map = new HashMap<>();

    private Category(int value) {
        this.value = value;
    }

    static {
        for (Category category : Category.values()) {
            map.put(category.value, category);
        }
    }

    public static Category valueOf(int category) {
        return (Category) map.get(category);
    }

    public int getValue() {
        return value;
    }
}
