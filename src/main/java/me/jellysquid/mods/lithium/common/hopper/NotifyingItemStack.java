package me.jellysquid.mods.lithium.common.hopper;

import me.jellysquid.mods.lithium.common.entity.item.ItemStackSubscriber;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;

public interface NotifyingItemStack {
    void lithium$subscribe(ItemStackSubscriber subscriber);

    void lithium$subscribeWithIndex(ItemStackSubscriber subscriber, int index);

    void lithium$unsubscribe(ItemStackSubscriber subscriber);

    void lithium$unsubscribeWithIndex(ItemStackSubscriber subscriber, int index);

    void lithium$notifyItemEntityStackSwap(ItemEntity itemEntity, ItemStack oldStack);
}
