package totemic_commons.pokefenn.fluid;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.Icon;
import net.minecraftforge.fluids.Fluid;
import totemic_commons.pokefenn.block.BlockChlorophyll;

public class FluidChlorophyll extends Fluid
{

    public FluidChlorophyll(String fluidName)
    {
        super(fluidName);
        setDensity(1000);
        setViscosity(1000);
    }


    @Override
    @SideOnly(Side.CLIENT)
    public Icon getStillIcon()
    {
        return BlockChlorophyll.chlorophyllStillIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getFlowingIcon()
    {
        return BlockChlorophyll.chlorophyllFlowingIcon;
    }


}
