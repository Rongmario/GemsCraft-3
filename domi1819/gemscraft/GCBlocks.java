package domi1819.gemscraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import domi1819.gemscraft.blocks.*;
import domi1819.gemscraft.util.GCProperties;

public class GCBlocks
{
    public static Block blockGem, blockGemOre;
    
    public static void initBlocks()
    {
        blockGem = new BlockGem(GCProperties.blockGemID).setHardness(3.0F).setResistance(1.5F).setUnlocalizedName("gc_blockGem");
        blockGemOre = new BlockGemOre(GCProperties.blockGemOreID).setHardness(3.5F).setResistance(1.5F).setUnlocalizedName("gc_blockGemOre");
        Item.itemsList[GCProperties.blockGemID] = new ItemBlockGem(GCProperties.blockGemID - 256).setUnlocalizedName("gc_itemBlockGem");
        Item.itemsList[GCProperties.blockGemOreID] = new ItemBlockGemOre(GCProperties.blockGemOreID - 256).setUnlocalizedName("gc_itemBlockGemOre");
    }
}