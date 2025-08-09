package xyz.brightglow.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import xyz.brightglow.Clockonomy;

public class ModItems {
    public static final Item TICK_SUPPLY = registerItem("tick_supply", new Item(new Item.Settings()));


    private static Item registerItem(String  name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(Clockonomy.MOD_ID, name), item);
    }

    public static  void registerModItems() {
        Clockonomy.LOGGER.info("Items initializing for " + Clockonomy.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FUNCTIONAL).register(entries -> {
            entries.add(TICK_SUPPLY);
        });


    }

}
