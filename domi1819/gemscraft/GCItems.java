package domi1819.gemscraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import domi1819.gemscraft.items.*;
import domi1819.gemscraft.util.BaseItem;
import domi1819.gemscraft.util.GCEnums;
import domi1819.gemscraft.util.GCProperties;

public class GCItems
{
    public static Item gemAmethyst, gemRuby, gemSapphire, gemEmerald, gemTopaz, itemPyrite, blackDiamond, diamondStick;
    public static Item atshovel, atpickaxe, ataxe, atsword, athoe, aahelmet, aaplate, aaleggings, aaboots;
    public static Item rtshovel, rtpickaxe, rtaxe, rtsword, rthoe, rahelmet, raplate, raleggings, raboots;
    public static Item stshovel, stpickaxe, staxe, stsword, sthoe, sahelmet, saplate, saleggings, saboots;
    public static Item etshovel, etpickaxe, etaxe, etsword, ethoe, eahelmet, eaplate, ealeggings, eaboots;
    public static Item ttshovel, ttpickaxe, ttaxe, ttsword, tthoe, tahelmet, taplate, taleggings, taboots;
    public static Item ptshovel, ptpickaxe, ptaxe, ptsword, pthoe; 
    public static Item bdshovel, bdpickaxe, bdaxe, bdsword, bdhoe, bdhelmet, bdplate, bdleggings, bdboots;
    
    public static void initItems()
    {
        gemAmethyst = new BaseItem(GCProperties.itemAmethystID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemAmethyst").func_111206_d("gemscraft:itemAmethyst");
        gemRuby = new BaseItem(GCProperties.itemRubyID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemRuby").func_111206_d("gemscraft:itemRuby");
        gemSapphire = new BaseItem(GCProperties.itemSapphireID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemSapphire").func_111206_d("gemscraft:itemSapphire");
        gemEmerald = new BaseItem(GCProperties.itemEmeraldID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemEmerald").func_111206_d("gemscraft:itemEmerald");
        gemTopaz = new BaseItem(GCProperties.itemTopazID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemTopaz").func_111206_d("gemscraft:itemTopaz");
        itemPyrite = new BaseItem(GCProperties.itemPyriteID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemPyrite").func_111206_d("gemscraft:itemPyrite");
        blackDiamond = new BaseItem(GCProperties.itemBlackDiamondID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemBlackDiamond").func_111206_d("gemscraft:itemBlackDiamond");
        diamondStick = new BaseItem(GCProperties.itemDiamondStickID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemDiamondStick").func_111206_d("gemscraft:itemDiamondStick");
        atshovel = new ItemGemShovel(GCProperties.amethystToolsBaseID - 256, GCEnums.toolAMETHYST).setUnlocalizedName("gc_shovelAmethyst").func_111206_d("gemscraft:shovelAmethyst");
        atpickaxe = new ItemGemPickaxe(GCProperties.amethystToolsBaseID - 255, GCEnums.toolAMETHYST).setUnlocalizedName("gc_pickaxeAmethyst").func_111206_d("gemscraft:pickaxeAmethyst");
        ataxe = new ItemGemAxe(GCProperties.amethystToolsBaseID - 254, GCEnums.toolAMETHYST).setUnlocalizedName("gc_axeAmethyst").func_111206_d("gemscraft:axeAmethyst");
        atsword = new ItemGemSword(GCProperties.amethystToolsBaseID - 253, GCEnums.toolAMETHYST).setUnlocalizedName("gc_swordAmethyst").func_111206_d("gemscraft:swordAmethyst");
        athoe = new ItemGemHoe(GCProperties.amethystToolsBaseID - 252, GCEnums.toolAMETHYST).setUnlocalizedName("gc_hoeAmethyst").func_111206_d("gemscraft:hoeAmethyst");
        rtshovel = new ItemGemShovel(GCProperties.rubyToolsBaseID - 256, GCEnums.toolRUBY).setUnlocalizedName("gc_shovelRuby").func_111206_d("gemscraft:shovelRuby");
        rtpickaxe = new ItemGemPickaxe(GCProperties.rubyToolsBaseID - 255, GCEnums.toolRUBY).setUnlocalizedName("gc_pickaxeRuby").func_111206_d("gemscraft:pickaxeRuby");
        rtaxe = new ItemGemAxe(GCProperties.rubyToolsBaseID - 254, GCEnums.toolRUBY).setUnlocalizedName("gc_axeRuby").func_111206_d("gemscraft:axeRuby");
        rtsword = new ItemGemSword(GCProperties.rubyToolsBaseID - 253, GCEnums.toolRUBY).setUnlocalizedName("gc_swordRuby").func_111206_d("gemscraft:swordRuby");
        rthoe = new ItemGemHoe(GCProperties.rubyToolsBaseID - 252, GCEnums.toolRUBY).setUnlocalizedName("gc_hoeRuby").func_111206_d("gemscraft:hoeRuby");
        stshovel = new ItemGemShovel(GCProperties.sapphireToolsBaseID - 256, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_shovelSapphire").func_111206_d("gemscraft:shovelSapphire");
        stpickaxe = new ItemGemPickaxe(GCProperties.sapphireToolsBaseID - 255, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_pickaxeSapphire").func_111206_d("gemscraft:pickaxeSapphire");
        staxe = new ItemGemAxe(GCProperties.sapphireToolsBaseID - 254, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_axeSapphire").func_111206_d("gemscraft:axeSapphire");
        stsword = new ItemGemSword(GCProperties.sapphireToolsBaseID - 253, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_swordSapphire").func_111206_d("gemscraft:swordSapphire");
        sthoe = new ItemGemHoe(GCProperties.sapphireToolsBaseID - 252, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_hoeSapphire").func_111206_d("gemscraft:hoeSapphire");
        etshovel = new ItemGemShovel(GCProperties.emeraldToolsBaseID - 256, GCEnums.toolEMERALD).setUnlocalizedName("gc_shovelEmerald").func_111206_d("gemscraft:shovelEmerald");
        etpickaxe = new ItemGemPickaxe(GCProperties.emeraldToolsBaseID - 255, GCEnums.toolEMERALD).setUnlocalizedName("gc_pickaxeEmerald").func_111206_d("gemscraft:pickaxeEmerald");
        etaxe = new ItemGemAxe(GCProperties.emeraldToolsBaseID - 254, GCEnums.toolEMERALD).setUnlocalizedName("gc_axeEmerald").func_111206_d("gemscraft:axeEmerald");
        etsword = new ItemGemSword(GCProperties.emeraldToolsBaseID - 253, GCEnums.toolEMERALD).setUnlocalizedName("gc_swordEmerald").func_111206_d("gemscraft:swordEmerald");
        ethoe = new ItemGemHoe(GCProperties.emeraldToolsBaseID - 252, GCEnums.toolEMERALD).setUnlocalizedName("gc_hoeEmerald").func_111206_d("gemscraft:hoeEmerald");
        ttshovel = new ItemGemShovel(GCProperties.topazToolsBaseID - 256, GCEnums.toolTOPAZ).setUnlocalizedName("gc_shovelTopaz").func_111206_d("gemscraft:shovelTopaz");
        ttpickaxe = new ItemGemPickaxe(GCProperties.topazToolsBaseID - 255, GCEnums.toolTOPAZ).setUnlocalizedName("gc_pickaxeTopaz").func_111206_d("gemscraft:pickaxeTopaz");
        ttaxe = new ItemGemAxe(GCProperties.topazToolsBaseID - 254, GCEnums.toolTOPAZ).setUnlocalizedName("gc_axeTopaz").func_111206_d("gemscraft:axeTopaz");
        ttsword = new ItemGemSword(GCProperties.topazToolsBaseID - 253, GCEnums.toolTOPAZ).setUnlocalizedName("gc_swordTopaz").func_111206_d("gemscraft:swordTopaz");
        tthoe = new ItemGemHoe(GCProperties.topazToolsBaseID - 252, GCEnums.toolTOPAZ).setUnlocalizedName("gc_hoeTopaz").func_111206_d("gemscraft:hoeTopaz");
        ptshovel = new ItemGemShovel(GCProperties.pyriteToolsBaseID - 256, GCEnums.toolPYRITE).setUnlocalizedName("gc_shovelPyrite").func_111206_d("gemscraft:shovelPyrite");
        ptpickaxe = new ItemGemPickaxe(GCProperties.pyriteToolsBaseID - 255, GCEnums.toolPYRITE).setUnlocalizedName("gc_pickaxePyrite").func_111206_d("gemscraft:pickaxePyrite");
        ptaxe = new ItemGemAxe(GCProperties.pyriteToolsBaseID - 254, GCEnums.toolPYRITE).setUnlocalizedName("gc_axePyrite").func_111206_d("gemscraft:axePyrite");
        ptsword = new ItemGemSword(GCProperties.pyriteToolsBaseID - 253, GCEnums.toolPYRITE).setUnlocalizedName("gc_swordPyrite").func_111206_d("gemscraft:swordPyrite");
        pthoe = new ItemGemHoe(GCProperties.pyriteToolsBaseID - 252, GCEnums.toolPYRITE).setUnlocalizedName("gc_hoePyrite").func_111206_d("gemscraft:hoePyrite");
        bdshovel = new ItemGemShovel(GCProperties.blackDiamondToolsBaseID - 256, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_shovelBlackDiamond").func_111206_d("gemscraft:shovelBlackDiamond");
        bdpickaxe = new ItemGemPickaxe(GCProperties.blackDiamondToolsBaseID - 255, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_pickaxeBlackDiamond").func_111206_d("gemscraft:pickaxeBlackDiamond");
        bdaxe = new ItemGemAxe(GCProperties.blackDiamondToolsBaseID - 254, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_axeBlackDiamond").func_111206_d("gemscraft:axeBlackDiamond");
        bdsword = new ItemGemSword(GCProperties.blackDiamondToolsBaseID - 253, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_swordBlackDiamond").func_111206_d("gemscraft:swordBlackDiamond");
        bdhoe = new ItemGemHoe(GCProperties.blackDiamondToolsBaseID - 252, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_hoeBlackDiamond").func_111206_d("gemscraft:hoeBlackDiamond");
        aahelmet = new ItemGemArmor(GCProperties.amethystArmorBaseID - 256, GCEnums.armorAMETHYST, 3, 0).setUnlocalizedName("gc_helmetAmethyst").func_111206_d("gemscraft:helmetAmethyst");
        aaplate = new ItemGemArmor(GCProperties.amethystArmorBaseID - 255, GCEnums.armorAMETHYST, 3, 1).setUnlocalizedName("gc_chestAmethyst").func_111206_d("gemscraft:chestAmethyst");
        aaleggings = new ItemGemArmor(GCProperties.amethystArmorBaseID - 254, GCEnums.armorAMETHYST, 3, 2).setUnlocalizedName("gc_legsAmethyst").func_111206_d("gemscraft:legsAmethyst");
        aaboots = new ItemGemArmor(GCProperties.amethystArmorBaseID - 253, GCEnums.armorAMETHYST, 3, 3).setUnlocalizedName("gc_bootsAmethyst").func_111206_d("gemscraft:bootsAmethyst");
        rahelmet = new ItemGemArmor(GCProperties.rubyArmorBaseID - 256, GCEnums.armorRUBY, 3, 0).setUnlocalizedName("gc_helmetRuby").func_111206_d("gemscraft:helmetRuby");
        raplate = new ItemGemArmor(GCProperties.rubyArmorBaseID - 255, GCEnums.armorRUBY, 3, 1).setUnlocalizedName("gc_chestRuby").func_111206_d("gemscraft:chestRuby");
        raleggings = new ItemGemArmor(GCProperties.rubyArmorBaseID - 254, GCEnums.armorRUBY, 3, 2).setUnlocalizedName("gc_legsRuby").func_111206_d("gemscraft:legsRuby");
        raboots = new ItemGemArmor(GCProperties.rubyArmorBaseID - 253, GCEnums.armorRUBY, 3, 3).setUnlocalizedName("gc_bootsRuby").func_111206_d("gemscraft:bootsRuby");
        sahelmet = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 256, GCEnums.armorSAPPHIRE, 3, 0).setUnlocalizedName("gc_helmetSapphire").func_111206_d("gemscraft:helmetSapphire");
        saplate = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 255, GCEnums.armorSAPPHIRE, 3, 1).setUnlocalizedName("gc_chestSapphire").func_111206_d("gemscraft:chestSapphire");
        saleggings = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 254, GCEnums.armorSAPPHIRE, 3, 2).setUnlocalizedName("gc_legsSapphire").func_111206_d("gemscraft:legsSapphire");
        saboots = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 253, GCEnums.armorSAPPHIRE, 3, 3).setUnlocalizedName("gc_bootsSapphire").func_111206_d("gemscraft:bootsSapphire");
        eahelmet = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 256, GCEnums.armorEMERALD, 3, 0).setUnlocalizedName("gc_helmetEmerald").func_111206_d("gemscraft:helmetEmerald");
        eaplate = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 255, GCEnums.armorEMERALD, 3, 1).setUnlocalizedName("gc_chestEmerald").func_111206_d("gemscraft:chestEmerald");
        ealeggings = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 254, GCEnums.armorEMERALD, 3, 2).setUnlocalizedName("gc_legsEmerald").func_111206_d("gemscraft:legsEmerald");
        eaboots = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 253, GCEnums.armorEMERALD, 3, 3).setUnlocalizedName("gc_bootsEmerald").func_111206_d("gemscraft:bootsEmerald");
        tahelmet = new ItemGemArmor(GCProperties.topazArmorBaseID - 256, GCEnums.armorTOPAZ, 3, 0).setUnlocalizedName("gc_helmetTopaz").func_111206_d("gemscraft:helmetTopaz");
        taplate = new ItemGemArmor(GCProperties.topazArmorBaseID - 255, GCEnums.armorTOPAZ, 3, 1).setUnlocalizedName("gc_chestTopaz").func_111206_d("gemscraft:chestTopaz");
        taleggings = new ItemGemArmor(GCProperties.topazArmorBaseID - 254, GCEnums.armorTOPAZ, 3, 2).setUnlocalizedName("gc_legsTopaz").func_111206_d("gemscraft:legsTopaz");
        taboots = new ItemGemArmor(GCProperties.topazArmorBaseID - 253, GCEnums.armorTOPAZ, 3, 3).setUnlocalizedName("gc_bootsTopaz").func_111206_d("gemscraft:bootsTopaz");
        bdhelmet = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 256, GCEnums.armorBLACKDIAMOND, 3, 0).setUnlocalizedName("gc_helmetBlackDiamond").func_111206_d("gemscraft:helmetBlackDiamond");
        bdplate = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 255, GCEnums.armorBLACKDIAMOND, 3, 1).setUnlocalizedName("gc_chestBlackDiamond").func_111206_d("gemscraft:chestBlackDiamond");
        bdleggings = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 254, GCEnums.armorBLACKDIAMOND, 3, 2).setUnlocalizedName("gc_legsBlackDiamond").func_111206_d("gemscraft:legsBlackDiamond");
        bdboots = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 253, GCEnums.armorBLACKDIAMOND, 3, 3).setUnlocalizedName("gc_bootsBlackDiamond").func_111206_d("gemscraft:bootsBlackDiamond");
    }
}