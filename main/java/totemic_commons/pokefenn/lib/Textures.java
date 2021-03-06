package totemic_commons.pokefenn.lib;

import net.minecraft.util.ResourceLocation;
import totemic_commons.pokefenn.util.ResourceLocationHelper;

public class Textures
{

    public static final String MODEL_SHEET_LOCATION = "textures/models/";
    public static final String ARMOR_SHEET_LOCATION = "textures/armor/";
    public static final String GUI_SHEET_LOCATION = "textures/gui/";
    public static final String EFFECTS_LOCATION = "textures/effects/";
    public static final String BLOCK_LOCATION = "textures/blocks";

    public static final String TEXTURE_LOCATION = "totemic";

    //Blocks

    public static final String BIG_BAD_TOTEM_HEAD_ICON_ALL = "bigBadTotemHead";
    public static final String BIG_BAD_TOTEM_BASE_ICON_ALL = "bigBadTotemBase";

    public static final String TOTEM_WOOD_TOP_ICON = "totemWoodTop";
    public static final String TOTEM_WOOD_SIDE_ICON = "totemWoodSide";

    public static final String TOTEM_TABLE_SIDE = "totemTableSide";
    public static final String TOTEM_TABLE_BOTTOM = "totemTableBottom";
    public static final String TOTEM_TABLE_TOP = "totemTableTop";

    public static final String CHLOROPHYLL_SOLIDIFIER_TOP_AND_BOT = "chlorophyllSolidifierTopAndBot";
    public static final String CHLOROPHYLL_SOLIDIFIER_SIDES = "chlorophyllSolidifierSide";

    public static final String TOTEM_LEAVES_OPAQUE = "totemLeavesOpaque";
    public static final String TOTEM_LEAVES_TRANSPARENT = "totemLeavesTransparent";

    public static final String INFUSED_WOOD_TOP_AND_BOT = "infusedWoodTopAndBot";
    public static final String INFUSED_WOOD_SIDE = "infusedWoodSide";

    public static final String INFUSED_SAPLING = "infusedSapling";

    //Items
    public static final String BUCKET_CHLOROPHYLL_ICON = "bucketChlorophyll";
    public static final String BOTTLE_CHLOROPHYLL_ICON = "bottleChlorophyll";


    //Fluids

    public static final String FLUID_CHLOROPHYLL_STILL = "chlorophyllStill";
    public static final String FLUID_CHLOROPHYLL_FLOWING = "chlorophyllFlowing";

    //Guis

    public static final ResourceLocation GUI_TOTEM_BASE = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "totemBaseGui.png");

    public static final ResourceLocation GUI_PAINT_BRUSH = ResourceLocationHelper.getResourceLocation(GUI_SHEET_LOCATION + "paintBrushGui.png");

    //Models
    public static final ResourceLocation TEXTURE_TOTEM_SOCKET = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "totemSocket.png");
    public static final ResourceLocation TEXTURE_TOTEM_DRAINING = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "totemDraining.png");
    public static final ResourceLocation TEXTURE_TOTEMIC_STAFF = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "totemicStaff.png");
    public static final ResourceLocation TEXTURE_INFUSED_TOTEMIC_STAFF = ResourceLocationHelper.getResourceLocation(MODEL_SHEET_LOCATION + "infusedTotemicStaff.png");

}
