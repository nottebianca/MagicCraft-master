package net.bambuki.magiccraft.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.bambuki.magiccraft.block.ModBlocks;



public class DowsingRodItem extends Item {
    public DowsingRodItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        if (!level.isClientSide()) {
            BlockPos positionClicked = pContext.getClickedPos();
            Player player = pContext.getPlayer();
            boolean foundBlock = false;

            for (int i = 0; i <= positionClicked.getY() + 64; i++) {
                BlockPos blockPos = positionClicked.below(i);
                Block blockBelow = level.getBlockState(blockPos).getBlock();

                if (isValuableBlock(blockBelow)) {
                    outputValuableCoordinates(blockPos, player, blockBelow);
                    foundBlock = true;
                    break;
                }
            }

            if (!foundBlock) {
                player.sendSystemMessage(Component.translatable("item.magiccraft.dowsing_rod.no_valuables"));
            }
        }

        pContext.getItemInHand().hurtAndBreak(1, pContext.getPlayer(),
                (player) -> player.broadcastBreakEvent(player.getUsedItemHand()));

        return super.useOn(pContext);
    }

    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block blockBelow) {
        String blockName;
        if (blockBelow == ModBlocks.BLUE_SAPPHIRES_ORE.get()) {
            blockName = "Blue Sapphires Ore";
        } else if (blockBelow == ModBlocks.SCARLET_RUBIES_ORE.get()) {
            blockName = "Scarlet Rubies Ore";
        } else if (blockBelow == ModBlocks.YELLOW_DIAMONDS_ORE.get()) {
            blockName = "Yellow Diamonds Ore";
        } else if (blockBelow == ModBlocks.GREEN_EMERALDS_ORE.get()) {
            blockName = "Green Emeralds Ore";
        } else if (blockBelow == ModBlocks.TIN_ORE.get()) {
            blockName = "Tin Ore";
        } else if (blockBelow == ModBlocks.DEEPSLATE_TIN_ORE.get()) {
            blockName = "Deepslate Tin Ore";
        } else if (blockBelow == ModBlocks.ENDSTONE_TIN_ORE.get()) {
            blockName = "Endstone Tin Ore";
        } else if (blockBelow == ModBlocks.NETHERRACK_TIN_ORE.get()) {
            blockName = "Netherrack Tin Ore";
        }
        else {
            blockName = blockBelow.asItem().getDescriptionId();
        }
        player.sendSystemMessage(Component.literal("Found " + blockName + " at " +
                "(" + blockPos.getX() + ", " + blockPos.getY() + "," + blockPos.getZ() + ")"));
    }



    private boolean isValuableBlock(Block block) {
        return block == Blocks.COAL_ORE
                || block == Blocks.COPPER_ORE
                || block == Blocks.DIAMOND_ORE
                || block == Blocks.IRON_ORE
                || block == ModBlocks.BLUE_SAPPHIRES_ORE.get()
                || block == ModBlocks.SCARLET_RUBIES_ORE.get()
                || block == ModBlocks.GREEN_EMERALDS_ORE.get()
                || block == ModBlocks.DEEPSLATE_TIN_ORE.get()
                || block == ModBlocks.TIN_ORE.get()
                || block == ModBlocks.ENDSTONE_TIN_ORE.get()
                || block == ModBlocks.NETHERRACK_TIN_ORE.get()
                || block == ModBlocks.YELLOW_DIAMONDS_ORE.get();

    }
}
