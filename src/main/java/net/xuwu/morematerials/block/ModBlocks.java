package net.xuwu.morematerials.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.xuwu.morematerials.MoreMaterials;
import net.xuwu.morematerials.item.ModCreativeModeTab;
import net.xuwu.morematerials.item.ModItems;
import net.xuwu.morematerials.sound.ModSounds;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreMaterials.MOD_ID);



    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> TOPAZ_BLOCK = registerBlock("topaz_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> TURQUOISE_BLOCK = registerBlock("turquoise_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> PEARL_BLOCK = registerBlock("pearl_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(5f,6f).requiresCorrectToolForDrops().sound(SoundType.METAL)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> RUBY_ORE = registerBlock("ruby_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> SAPPHIRE_ORE = registerBlock("sapphire_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> TOPAZ_ORE = registerBlock("topaz_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> TURQUOISE_ORE = registerBlock("turquoise_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(3f,3f).requiresCorrectToolForDrops().sound(SoundType.STONE)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> PEARL_ORE = registerBlock("pearl_ore",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(1f,2f).requiresCorrectToolForDrops().sound(ModSounds.PEARL)), ModCreativeModeTab.MMT_TAB);

    public static final RegistryObject<Block> BLOCK = registerBlock("block",
            () -> new OreBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(15f,20f).requiresCorrectToolForDrops().sound(ModSounds.BLOCK)), ModCreativeModeTab.MMT_TAB);


    private  static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return  toReturn;
    }

    private  static  <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                         CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
}

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
