package com.eeweeeef6.stickmanmod;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class StickmanItems {
    public static final Item STICKMAN_CREATOR = new Item(new Item.Settings().group(StickmanMod.STICKMAN_GROUP));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(StickmanMod.MOD_ID, "stickman_creator"), STICKMAN_CREATOR);
    }
}
