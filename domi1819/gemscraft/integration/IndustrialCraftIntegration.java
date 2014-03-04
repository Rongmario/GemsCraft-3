package domi1819.gemscraft.integration;

import domi1819.gemscraft.GCBlocks;
import domi1819.gemscraft.GCItems;
import domi1819.gemscraft.util.GCProperties;
import domi1819.gemscraft.util.MultiLanguageRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ic2.api.recipe.IMachineRecipeManager;

public class IndustrialCraftIntegration
{
    public static Item topazDust, amethystDust, blackDiamondDust;
    public static boolean pluginLoaded;
    
    public static void initPlugin()
    {
        try 
        {
        	Class.forName("ic2.core.Ic2Items").getField("airCell").get(null);
            pluginLoaded = true;
        }
        catch(Exception e) { pluginLoaded = false; }
        
        if (pluginLoaded) postInit();
        
    }
    
    public static void postInit()
    {
        System.out.println("[GemsCraft] IC2-Beta module loaded!");
        
        topazDust = new ItemGemDust(GCProperties.dustTopazID - 256).setUnlocalizedName("gc_dustTopaz");
        blackDiamondDust = new ItemGemDust(GCProperties.dustBlackDiamondID - 256).setUnlocalizedName("gc_dustBlackDiamond");
        amethystDust = new ItemGemDust(GCProperties.dustAmethystID - 256).setUnlocalizedName("gc_dustAmethyst");
        MultiLanguageRegistry.addObjectNames(topazDust, "Topaz Dust", "Topasstaub");
        MultiLanguageRegistry.addObjectNames(amethystDust, "Amethyst Dust", "Amethyststaub");
        MultiLanguageRegistry.addObjectNames(blackDiamondDust, "Black Diamond Dust", "Schwarzer Diamant-Staub");
        
        try
        { //TODO - CANT BE ASKED DOING IC2 MODULE AT THE MOMENT
            /*Class.forName("ic2.api.recipe.IMachineRecipeManager");
            IMachineRecipeManager<ItemStack> maceratorRecipes = (IMachineRecipeManager<ItemStack>)Class.forName("ic2.api.recipe.Recipes").getField("macerator").get(null);
            maceratorRecipes.addRecipe(new ItemStack(GCProperties.itemAmethystID, 1, 0), new ItemStack(GCProperties.dustAmethystID, 1, 0));
            maceratorRecipes.addRecipe(new ItemStack(GCProperties.itemTopazID, 1, 0), new ItemStack(GCProperties.dustTopazID, 1, 0));
            maceratorRecipes.addRecipe(new ItemStack(GCProperties.itemBlackDiamondID, 1, 0), new ItemStack(GCProperties.dustBlackDiamondID, 1, 0));
            maceratorRecipes.addRecipe(new ItemStack(GCBlocks.blockGemOre, 1, 0), new ItemStack(GCProperties.dustAmethystID, 2, 0));
            maceratorRecipes.addRecipe(new ItemStack(GCBlocks.blockGemOre, 1, 4), new ItemStack(GCProperties.dustTopazID, 2, 0));
            maceratorRecipes.addRecipe(new ItemStack(GCBlocks.blockGemOre, 1, 6), new ItemStack(GCProperties.dustBlackDiamondID, 2, 0));*/
        }
        catch(Exception e) {}
    }
}
