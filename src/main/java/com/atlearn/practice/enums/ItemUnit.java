package com.atlearn.practice.enums;

import java.util.EnumSet;

public enum ItemUnit {
    Each, Kg, G, Package;


    public static EnumSet<ItemUnit> getAll() {
        return EnumSet.allOf(ItemUnit.class);
    }

    public static EnumSet<ItemUnit> get2() {
        return EnumSet.of(ItemUnit.Kg, ItemUnit.Package);
    }

}
