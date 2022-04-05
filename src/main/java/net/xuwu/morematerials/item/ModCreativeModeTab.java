package net.xuwu.morematerials.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab MMT_TAB = new CreativeModeTab("mmttab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };
}
