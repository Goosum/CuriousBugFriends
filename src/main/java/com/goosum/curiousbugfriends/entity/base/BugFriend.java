package com.goosum.curiousbugfriends.entity.base;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

public abstract class BugFriend extends TamableAnimal implements MenuProvider {

    protected BugFriend(EntityType<? extends TamableAnimal> type, Level level) {
        super(type, level);
    }

    public static String friendname;

    protected void outputStayState(Player player) {
        if(isOrderedToSit()) {
            player.sendSystemMessage(Component.literal("Beetle is staying"));
        } else {
            player.sendSystemMessage(Component.literal("Beetle is following"));
        }
    }



    protected void nameFriend() {

    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel p_146743_, AgeableMob p_146744_) {
        return null;
    }
}
