package com.eeweeeef6.stickmanmod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public
class StickmanEntities {
    public static final EntityType<StickmanEntity> STICKMAN = Registry.register(
    Registry.ENTITY_TYPE,
    new Identifier(StickmanMod.MOD_ID, "stickman"),
    EntityType.Builder.create(StickmanEntity::new, SpawnGroup.CREATURE).setDimensions(0.6f, 1.8f).build("stickman"));

    public static void registerEntities() {
        // Registration is done in the EntityType.Builder.create call
    }
}
