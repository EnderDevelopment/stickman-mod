package com.eeweeeef6.stickmanmod;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.world.World;

public
class StickmanEntity extends PathAwareEntity {
    public StickmanEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // Implement Stickman AI goals here
    }
}
