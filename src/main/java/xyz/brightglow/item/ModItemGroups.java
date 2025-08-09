package xyz.brightglow.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xyz.brightglow.Clockonomy;
import xyz.brightglow.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup CLOCKONOMY_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Clockonomy.MOD_ID, "clockonomy_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.TICK_SUPPLY))
                    .displayName(Text.translatable("itemgroup.clockonomy.clockonomy_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.TICK_SUPPLY);
                        entries.add(ModBlocks.TIME_STONE);
                    }).build());

    {

    }


    public static void registerItemGroups(){
        Clockonomy.LOGGER.info("Registering Item Groups for " + Clockonomy.MOD_ID);
    }
}
