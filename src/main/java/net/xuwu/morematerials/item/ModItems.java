package net.xuwu.morematerials.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xuwu.morematerials.MoreMaterials;

public class ModItems {
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        MoreMaterials.MOD_ID);

        public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> TURQUOISE = ITEMS.register("turquoise",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> BORON_INGOT = ITEMS.register("boron_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> BRASS_INGOT = ITEMS.register("brass_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> CHROMIUM = ITEMS.register("chromium",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> COBALT_INGOT = ITEMS.register("cobalt_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> EUROPIUM_INGOT = ITEMS.register("europium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> IRIDIUM = ITEMS.register("iridium",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> MAGNESIUM = ITEMS.register("magnesium",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> NICKEL_INGOT = ITEMS.register("nickel_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> PALLADIUM_INGOT = ITEMS.register("palladium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> PLATINUM_INGOT = ITEMS.register("platinum_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> RHODIUM_INGOT = ITEMS.register("rhodium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> SCANDIUM_INGOT = ITEMS.register("scandium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> SILICON_INGOT = ITEMS.register("silicon_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> SILVER_INGOT = ITEMS.register("silver_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> TELLURIUM_INGOT = ITEMS.register("tellurium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> THORIUM_INGOT = ITEMS.register("thorium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> THULIUM_INGOT = ITEMS.register("thulium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> TITANIUM_INGOT = ITEMS.register("titanium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> URANIUM_INGOT = ITEMS.register("uranium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> YTTRIUM_INGOT = ITEMS.register("yttrium_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> ZINC_INGOT = ITEMS.register("zinc_ingot",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static final RegistryObject<Item> ZIRCONIUM = ITEMS.register("zirconium",
                        () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MMT_TAB)));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
