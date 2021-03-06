package totemic_commons.pokefenn.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import totemic_commons.pokefenn.ModBlocks;
import totemic_commons.pokefenn.ModItems;
import totemic_commons.pokefenn.Totemic;
import totemic_commons.pokefenn.lib.Strings;
import totemic_commons.pokefenn.lib.Textures;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 16/02/14
 * Time: 17:48
 */
public class BlockTotemLeaves extends BlockLeaves
{
    public BlockTotemLeaves(int id)
    {
        super(id);
        setCreativeTab(Totemic.tabsTotem);
        setUnlocalizedName(Strings.TOTEM_LEAVES_NAME);
        setLightOpacity(0);
        setHardness(0.2F);
    }

    private Icon opaqueIcon;
    private Icon transparentIcon;

    @Override
    public int idDropped(int par1, Random par2Random, int par3)
    {
        if (par2Random.nextInt(8) == 1)
            return ModBlocks.totemSapling.blockID;
        else
            return ModItems.subItems.itemID;
    }

    @Override
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!par1World.isRemote)
        {
            ArrayList<ItemStack> items = getBlockDropped(par1World, par2, par3, par4, par5, par7);

            for (ItemStack item : items)
            {
                if (par1World.rand.nextFloat() <= par6)
                {
                    this.dropBlockAsItem_do(par1World, par2, par3, par4, item);
                }
            }
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess iba, int x, int y, int z, int side)
    {
        return/* Block.leaves.graphicsLevel || */super.shouldSideBeRendered(iba, x, y, z, side);
        //return true;
    }


    @Override
    public void getSubBlocks(int blockId, CreativeTabs creativeTab, List subTypes)
    {
        subTypes.add(new ItemStack(blockId, 1, 0));
    }

    @Override
    public boolean isOpaqueCube()
    {
        //return !Block.leaves.graphicsLevel;
        return false;
    }

    @Override
    public Icon getIcon(int side, int meta)
    {
        return Block.leaves.graphicsLevel ? transparentIcon : opaqueIcon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister register)
    {
        opaqueIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.TOTEM_LEAVES_OPAQUE);
        transparentIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.TOTEM_LEAVES_TRANSPARENT);
    }


}
