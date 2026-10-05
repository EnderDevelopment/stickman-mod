package com.eeweeeef6.stickmanmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public
class StickmanMod implements ModInitializer {
    public static final String MOD_ID = "stickmanmod";
    public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
    public static final ItemGroup STICKMAN_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "stickman_group"), () -> new ItemStack(StickmanItems.STICKMAN_CREATOR));

    @Override
    public void onInitialize() {
        LOGGER.info("Stickman Mod Initialized");
        StickmanItems.registerItems();
        StickmanEntities.registerEntities();
    }
}
