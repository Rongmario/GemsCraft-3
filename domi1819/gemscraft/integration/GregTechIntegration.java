package domi1819.gemscraft.integration;

import domi1819.gemscraft.GCItems;
import domi1819.gemscraft.util.GCProperties;
import domi1819.gemscraft.util.MultiLanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class GregTechIntegration
{
    public static int itemElementCellID, itemAirCellID, itemElementDustID, itemMiscID;
    
    public static void initPlugin()
    {
        itemElementCellID = 0;
        try 
        {
            ItemStack elementCellStack = (ItemStack)Class.forName("gregtechmod.GT_Mod").getMethod("getGregTechItem", int.class, int.class, int.class).invoke(null, 2, 1, 0);
            itemElementCellID =  elementCellStack.itemID;
            ItemStack airCellStack = (ItemStack)Class.forName("ic2.core.Ic2Items").getField("airCell").get(null);
            itemAirCellID = airCellStack.itemID;
            ItemStack elementDustStack = (ItemStack)Class.forName("gregtechmod.GT_Mod").getMethod("getGregTechItem", int.class, int.class, int.class).invoke(null, 1, 1, 0);
            itemElementDustID = elementDustStack.itemID;
            itemMiscID = itemElementDustID - 1;
        }
        catch(Exception e) {}
        
        if (itemElementCellID != 0) postInit();
        
    }
    
    public static void postInit()
    {
        System.out.println("[GemsCraft] GregTech module loaded! " + itemElementCellID + " " + itemAirCellID);
        try
        {
            Class.forName("gregtechmod.GT_Mod").getMethod("addElectrolyzerRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, new ItemStack(IndustrialCraftIntegration.amethystDust, 2, 0), 2, new ItemStack(itemAirCellID, 1, 0), new ItemStack(itemElementCellID, 1, 7), null, null, 200, 128);
            Class.forName("gregtechmod.GT_Mod").getMethod("addElectrolyzerRecipe", ItemStack.class, int.class, ItemStack.class, ItemStack.class, ItemStack.class, ItemStack.class, int.class, int.class).invoke(null, new ItemStack(IndustrialCraftIntegration.topazDust, 7, 0), 5, new ItemStack(itemElementDustID, 2, 18), new ItemStack(itemAirCellID, 3, 0), new ItemStack(itemElementCellID, 1, 0), new ItemStack(itemElementCellID, 1, 7), 500, 128);

            Class.forName("gregtechmod.GT_Mod").getMethod("addImplosionRecipe", new Class[]{ItemStack.class, Integer.TYPE, ItemStack.class, ItemStack.class}).invoke(null, new Object[]{new ItemStack(IndustrialCraftIntegration.amethystDust, 1, 0), Integer.valueOf(1), new ItemStack(GCItems.gemAmethyst), null});
            Class.forName("gregtechmod.GT_Mod").getMethod("addImplosionRecipe", new Class[]{ItemStack.class, Integer.TYPE, ItemStack.class, ItemStack.class}).invoke(null, new Object[]{new ItemStack(IndustrialCraftIntegration.topazDust, 1, 0), Integer.valueOf(1), new ItemStack(GCItems.gemTopaz), null});
            Class.forName("gregtechmod.GT_Mod").getMethod("addImplosionRecipe", new Class[]{ItemStack.class, Integer.TYPE, ItemStack.class, ItemStack.class}).invoke(null, new Object[]{new ItemStack(IndustrialCraftIntegration.blackDiamondDust, 2, 0), Integer.valueOf(4), new ItemStack(GCItems.blackDiamond, 2, 0), null});
            
        }
        catch(Exception e) {}
    }
}
