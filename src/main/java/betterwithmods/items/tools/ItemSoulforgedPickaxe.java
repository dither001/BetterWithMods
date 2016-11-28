package betterwithmods.items.tools;

import betterwithmods.BWMItems;
import betterwithmods.client.BWCreativeTabs;
import com.google.common.collect.ImmutableSet;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Set;

public class ItemSoulforgedPickaxe extends ItemPickaxe {
    public ItemSoulforgedPickaxe() {
        super(BWMItems.SOULFORGED_STEEL);
        setCreativeTab(BWCreativeTabs.BWTAB);
    }

    @Override
    public int getHarvestLevel(ItemStack stack, String toolClass, @Nullable EntityPlayer player, @Nullable IBlockState blockState) {
        int level = super.getHarvestLevel(stack, toolClass, player, blockState);
        if (level == -1 && toolClass != null && getToolClasses(stack).contains(toolClass))
            return this.toolMaterial.getHarvestLevel();
        else
            return level;
    }

    @Override
    public Set<String> getToolClasses(ItemStack stack) {
        return ImmutableSet.of("pickaxe", "shovel");
    }
}
