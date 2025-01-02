package net.kalachi.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.kalachi.tutorialmod.block.ModBlocks;
import net.kalachi.tutorialmod.item.ModItemGroups;
import net.kalachi.tutorialmod.item.ModItems;
import net.minecraft.client.model.ModelUtil;
import net.minecraft.client.util.ModelIdentifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES,600);
	}
}