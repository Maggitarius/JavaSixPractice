package net.maggitarius.coolmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab COOL_TAB = new CreativeModeTab("CoolMod Tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.AMBER.get());
        }
    };
}
