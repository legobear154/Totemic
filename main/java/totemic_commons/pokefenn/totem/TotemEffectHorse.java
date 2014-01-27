package totemic_commons.pokefenn.totem;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import totemic_commons.pokefenn.ModItems;
import totemic_commons.pokefenn.api.ITotemEffect;
import totemic_commons.pokefenn.tileentity.TileTotemBase;
import totemic_commons.pokefenn.util.EntityUtil;

/**
 * Created with IntelliJ IDEA.
 * User: Pokefenn
 * Date: 25/01/14
 * Time: 22:34
 */
public class TotemEffectHorse implements ITotemEffect
{

    @Override
    public void effect(TileTotemBase totemBase)
    {

        int SLOT_TWO = TileTotemBase.SLOT_TWO;

        if (totemBase.getStackInSlot(SLOT_TWO).itemID == ModItems.chlorophyllCrystal.itemID)
        {

            if (EntityUtil.getEntitiesInRange(totemBase.worldObj, totemBase.xCoord, totemBase.yCoord, totemBase.zCoord, 10, 10) != null && totemBase.getStackInSlot(SLOT_TWO).getItemDamage() - TileTotemBase.DECREASE_HORSE >= 0)
            {

                for (Entity entity : EntityUtil.getEntitiesInRange(totemBase.worldObj, totemBase.xCoord, totemBase.yCoord, totemBase.zCoord, 10, 10))
                {
                    if (!(entity instanceof EntityItem) && entity instanceof EntityPlayer)
                    {
                        ((EntityPlayer) entity).addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0));

                    }
                }

            }
        }

    }

}