package net.poopooskin.mccourse.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.poopooskin.mccourse.MCCourse;
import net.poopooskin.mccourse.item.custom.ChainsawItem;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, MCCourse.MOD_ID);

    public static final RegistryObject<Item> AZURITE = ITEMS.register("azurite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_AZURITE = ITEMS.register("raw_azurite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CHAINSAW = ITEMS.register("chainsaw",
            () -> new ChainsawItem(new Item.Properties().durability(32)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
