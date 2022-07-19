
package expor.slice.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import expor.slice.procedures.MissingTextureBlockEntityCollidesInTheBlockProcedure;

public class MissingTextureBlockBlock extends Block {
	public MissingTextureBlockBlock() {
		super(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.SCULK_SENSOR).strength(64000f, 2000000000f).noCollission()
				.hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true).noDrops());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		MissingTextureBlockEntityCollidesInTheBlockProcedure.execute(entity);
	}
}
