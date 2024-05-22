package net.bambuki.magiccraft.item.custom;


import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.level.Explosion;

public class ExplosivePowerPickAxeItem extends PickaxeItem {
    public ExplosivePowerPickAxeItem(Tier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        BlockState state = context.getLevel().getBlockState(context.getClickedPos());

        if (!context.getLevel().isClientSide && state.getDestroySpeed(context.getLevel(), context.getClickedPos()) > 0.0F) {
            context.getLevel().explode(null, context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), 4.0F, Explosion.BlockInteraction.BREAK);
        }

        return super.useOn(context);
    }
}