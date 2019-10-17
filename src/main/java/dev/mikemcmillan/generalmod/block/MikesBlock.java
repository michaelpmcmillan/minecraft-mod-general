package dev.mikemcmillan.generalmod.block;

import dev.mikemcmillan.generalmod.MikesMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MikesBlock extends Block
{
    public static final String itemName = "mikes_block";
    
    public MikesBlock() {
        super(Block.Properties
            .create(Material.IRON)
            .hardnessAndResistance(5)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE));
        setRegistryName(MikesMod.ModId, itemName);
    }
}