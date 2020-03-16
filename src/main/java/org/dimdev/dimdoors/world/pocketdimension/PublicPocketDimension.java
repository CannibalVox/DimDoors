package org.dimdev.dimdoors.world.pocketdimension;

import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.dimension.DimensionType;
import org.dimdev.dimdoors.world.ModBiomes;
import org.dimdev.dimdoors.world.ModDimensions;
import org.dimdev.pocketlib.PocketWorldDimension;

public class PublicPocketDimension extends PocketWorldDimension {
    public PublicPocketDimension(World world, DimensionType dimensionType) {
        super(world, dimensionType, 0);
    }

    @Override
    protected Biome getBiome() {
        return ModBiomes.BLACK_VOID;
    }

    @Override
    public DimensionType getType() {
        return ModDimensions.PUBLIC;
    }
}
