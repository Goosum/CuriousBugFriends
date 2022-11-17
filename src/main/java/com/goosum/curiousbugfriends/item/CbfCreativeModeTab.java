package com.goosum.curiousbugfriends.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CbfCreativeModeTab {

    public static final CreativeModeTab CBF_TAB = new CreativeModeTab("cbftab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(CbfItems.BEETLE_FRIENDSHIP_TOKEN.get());
        }
    };

}
