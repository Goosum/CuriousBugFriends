package com.goosum.curiousbugfriends.item.custom;

import com.goosum.curiousbugfriends.entity.base.BugFriend;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BeetleFriendshipToken extends Item {

    public BeetleFriendshipToken(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.literal(BugFriend.friendname));

        super.appendHoverText(itemStack, level, components, tooltipFlag);
    }
}
