package totemic_commons.pokefenn.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import totemic_commons.pokefenn.Totemic;
import totemic_commons.pokefenn.lib.Strings;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 08/12/13
 * Time: 19:19
 */
public class ItemSubItems extends ItemNormal
{

    private static final String[] ITEMS_NAMES = new String[]{"leaf", "chlorophyllicIngot", "infusedStick"};

    @SideOnly(Side.CLIENT)
    private Icon[] icons;

    public ItemSubItems(int id)
    {

        super(id);
        setHasSubtypes(true);
        maxStackSize = 64;
        setCreativeTab(Totemic.tabsTotem);

    }

    @Override
    public String getUnlocalizedName(ItemStack itemStack)
    {

        StringBuilder unlocalizedName = new StringBuilder();
        int meta = MathHelper.clamp_int(itemStack.getItemDamage(), 0, ITEMS_NAMES.length - 1);

        unlocalizedName.append("item.");
        unlocalizedName.append(Strings.RESOURCE_PREFIX);
        unlocalizedName.append(ITEMS_NAMES[meta]);

        return unlocalizedName.toString();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIconFromDamage(int meta)
    {

        int j = MathHelper.clamp_int(meta, 0, ITEMS_NAMES.length - 1);
        return icons[j];
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister)
    {

        icons = new Icon[ITEMS_NAMES.length];

        for (int i = 0; i < ITEMS_NAMES.length; ++i)
        {
            icons[i] = iconRegister.registerIcon(Strings.RESOURCE_PREFIX + ITEMS_NAMES[i]);
        }
    }


    @Override
    @SideOnly(Side.CLIENT)
    public void getSubItems(int id, CreativeTabs creativeTab, List list)
    {

        for (int meta = 0; meta < ITEMS_NAMES.length; ++meta)
        {
            list.add(new ItemStack(id, 1, meta));
        }


    }

}
