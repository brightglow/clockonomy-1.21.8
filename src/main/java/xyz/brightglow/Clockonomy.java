package xyz.brightglow;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import xyz.brightglow.block.ModBlocks;
import xyz.brightglow.item.ModItemGroups;
import xyz.brightglow.item.ModItems;

public class Clockonomy implements ModInitializer {
	public static final String MOD_ID = "clockonomy";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		LOGGER.info("All loaded, times a-ticking!");
	}
}