package com.nitka.mcguns.mod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

import static net.minecraft.block.AbstractBlock.*;

public class WeaponWorkbenchBlock extends Block {
    public WeaponWorkbenchBlock() {
        super(
                AbstractBlock.Properties.of(Material.STONE)
        );
    }

    @Override
    public ActionResultType use(BlockState blockState, World world, BlockPos p_225533_3_, PlayerEntity player, Hand hand, BlockRayTraceResult blockRayTraceResult) {
        //player.openMenu();

        return ActionResultType.SUCCESS;
    }
}
