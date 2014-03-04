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
        gemAmethyst = new BaseItem(GCProperties.itemAmethystID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemAmethyst").setTextureName("gemscraft:itemAmethyst");
        gemRuby = new BaseItem(GCProperties.itemRubyID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemRuby").setTextureName("gemscraft:itemRuby");
        gemSapphire = new BaseItem(GCProperties.itemSapphireID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemSapphire").setTextureName("gemscraft:itemSapphire");
        gemEmerald = new BaseItem(GCProperties.itemEmeraldID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemEmerald").setTextureName("gemscraft:itemEmerald");
        gemTopaz = new BaseItem(GCProperties.itemTopazID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemTopaz").setTextureName("gemscraft:itemTopaz");
        itemPyrite = new BaseItem(GCProperties.itemPyriteID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemPyrite").setTextureName("gemscraft:itemPyrite");
        blackDiamond = new BaseItem(GCProperties.itemBlackDiamondID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemBlackDiamond").setTextureName("gemscraft:itemBlackDiamond");
        diamondStick = new BaseItem(GCProperties.itemDiamondStickID - 256).setCreativeTab(CreativeTabs.tabMaterials).setUnlocalizedName("gc_itemDiamondStick").setTextureName("gemscraft:itemDiamondStick");
        atshovel = new ItemGemShovel(GCProperties.amethystToolsBaseID - 256, GCEnums.toolAMETHYST).setUnlocalizedName("gc_shovelAmethyst").setTextureName("gemscraft:shovelAmethyst");
        atpickaxe = new ItemGemPickaxe(GCProperties.amethystToolsBaseID - 255, GCEnums.toolAMETHYST).setUnlocalizedName("gc_pickaxeAmethyst").setTextureName("gemscraft:pickaxeAmethyst");
        ataxe = new ItemGemAxe(GCProperties.amethystToolsBaseID - 254, GCEnums.toolAMETHYST).setUnlocalizedName("gc_axeAmethyst").setTextureName("gemscraft:axeAmethyst");
        atsword = new ItemGemSword(GCProperties.amethystToolsBaseID - 253, GCEnums.toolAMETHYST).setUnlocalizedName("gc_swordAmethyst").setTextureName("gemscraft:swordAmethyst");
        athoe = new ItemGemHoe(GCProperties.amethystToolsBaseID - 252, GCEnums.toolAMETHYST).setUnlocalizedName("gc_hoeAmethyst").setTextureName("gemscraft:hoeAmethyst");
        rtshovel = new ItemGemShovel(GCProperties.rubyToolsBaseID - 256, GCEnums.toolRUBY).setUnlocalizedName("gc_shovelRuby").setTextureName("gemscraft:shovelRuby");
        rtpickaxe = new ItemGemPickaxe(GCProperties.rubyToolsBaseID - 255, GCEnums.toolRUBY).setUnlocalizedName("gc_pickaxeRuby").setTextureName("gemscraft:pickaxeRuby");
        rtaxe = new ItemGemAxe(GCProperties.rubyToolsBaseID - 254, GCEnums.toolRUBY).setUnlocalizedName("gc_axeRuby").setTextureName("gemscraft:axeRuby");
        rtsword = new ItemGemSword(GCProperties.rubyToolsBaseID - 253, GCEnums.toolRUBY).setUnlocalizedName("gc_swordRuby").setTextureName("gemscraft:swordRuby");
        rthoe = new ItemGemHoe(GCProperties.rubyToolsBaseID - 252, GCEnums.toolRUBY).setUnlocalizedName("gc_hoeRuby").setTextureName("gemscraft:hoeRuby");
        stshovel = new ItemGemShovel(GCProperties.sapphireToolsBaseID - 256, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_shovelSapphire").setTextureName("gemscraft:shovelSapphire");
        stpickaxe = new ItemGemPickaxe(GCProperties.sapphireToolsBaseID - 255, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_pickaxeSapphire").setTextureName("gemscraft:pickaxeSapphire");
        staxe = new ItemGemAxe(GCProperties.sapphireToolsBaseID - 254, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_axeSapphire").setTextureName("gemscraft:axeSapphire");
        stsword = new ItemGemSword(GCProperties.sapphireToolsBaseID - 253, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_swordSapphire").setTextureName("gemscraft:swordSapphire");
        sthoe = new ItemGemHoe(GCProperties.sapphireToolsBaseID - 252, GCEnums.toolSAPPHIRE).setUnlocalizedName("gc_hoeSapphire").setTextureName("gemscraft:hoeSapphire");
        etshovel = new ItemGemShovel(GCProperties.emeraldToolsBaseID - 256, GCEnums.toolEMERALD).setUnlocalizedName("gc_shovelEmerald").setTextureName("gemscraft:shovelEmerald");
        etpickaxe = new ItemGemPickaxe(GCProperties.emeraldToolsBaseID - 255, GCEnums.toolEMERALD).setUnlocalizedName("gc_pickaxeEmerald").setTextureName("gemscraft:pickaxeEmerald");
        etaxe = new ItemGemAxe(GCProperties.emeraldToolsBaseID - 254, GCEnums.toolEMERALD).setUnlocalizedName("gc_axeEmerald").setTextureName("gemscraft:axeEmerald");
        etsword = new ItemGemSword(GCProperties.emeraldToolsBaseID - 253, GCEnums.toolEMERALD).setUnlocalizedName("gc_swordEmerald").setTextureName("gemscraft:swordEmerald");
        ethoe = new ItemGemHoe(GCProperties.emeraldToolsBaseID - 252, GCEnums.toolEMERALD).setUnlocalizedName("gc_hoeEmerald").setTextureName("gemscraft:hoeEmerald");
        ttshovel = new ItemGemShovel(GCProperties.topazToolsBaseID - 256, GCEnums.toolTOPAZ).setUnlocalizedName("gc_shovelTopaz").setTextureName("gemscraft:shovelTopaz");
        ttpickaxe = new ItemGemPickaxe(GCProperties.topazToolsBaseID - 255, GCEnums.toolTOPAZ).setUnlocalizedName("gc_pickaxeTopaz").setTextureName("gemscraft:pickaxeTopaz");
        ttaxe = new ItemGemAxe(GCProperties.topazToolsBaseID - 254, GCEnums.toolTOPAZ).setUnlocalizedName("gc_axeTopaz").setTextureName("gemscraft:axeTopaz");
        ttsword = new ItemGemSword(GCProperties.topazToolsBaseID - 253, GCEnums.toolTOPAZ).setUnlocalizedName("gc_swordTopaz").setTextureName("gemscraft:swordTopaz");
        tthoe = new ItemGemHoe(GCProperties.topazToolsBaseID - 252, GCEnums.toolTOPAZ).setUnlocalizedName("gc_hoeTopaz").setTextureName("gemscraft:hoeTopaz");
        ptshovel = new ItemGemShovel(GCProperties.pyriteToolsBaseID - 256, GCEnums.toolPYRITE).setUnlocalizedName("gc_shovelPyrite").setTextureName("gemscraft:shovelPyrite");
        ptpickaxe = new ItemGemPickaxe(GCProperties.pyriteToolsBaseID - 255, GCEnums.toolPYRITE).setUnlocalizedName("gc_pickaxePyrite").setTextureName("gemscraft:pickaxePyrite");
        ptaxe = new ItemGemAxe(GCProperties.pyriteToolsBaseID - 254, GCEnums.toolPYRITE).setUnlocalizedName("gc_axePyrite").setTextureName("gemscraft:axePyrite");
        ptsword = new ItemGemSword(GCProperties.pyriteToolsBaseID - 253, GCEnums.toolPYRITE).setUnlocalizedName("gc_swordPyrite").setTextureName("gemscraft:swordPyrite");
        pthoe = new ItemGemHoe(GCProperties.pyriteToolsBaseID - 252, GCEnums.toolPYRITE).setUnlocalizedName("gc_hoePyrite").setTextureName("gemscraft:hoePyrite");
        bdshovel = new ItemGemShovel(GCProperties.blackDiamondToolsBaseID - 256, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_shovelBlackDiamond").setTextureName("gemscraft:shovelBlackDiamond");
        bdpickaxe = new ItemGemPickaxe(GCProperties.blackDiamondToolsBaseID - 255, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_pickaxeBlackDiamond").setTextureName("gemscraft:pickaxeBlackDiamond");
        bdaxe = new ItemGemAxe(GCProperties.blackDiamondToolsBaseID - 254, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_axeBlackDiamond").setTextureName("gemscraft:axeBlackDiamond");
        bdsword = new ItemGemSword(GCProperties.blackDiamondToolsBaseID - 253, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_swordBlackDiamond").setTextureName("gemscraft:swordBlackDiamond");
        bdhoe = new ItemGemHoe(GCProperties.blackDiamondToolsBaseID - 252, GCEnums.toolBLACKDIAMOND).setUnlocalizedName("gc_hoeBlackDiamond").setTextureName("gemscraft:hoeBlackDiamond");
        aahelmet = new ItemGemArmor(GCProperties.amethystArmorBaseID - 256, GCEnums.armorAMETHYST, 3, 0).setUnlocalizedName("gc_helmetAmethyst").setTextureName("gemscraft:helmetAmethyst");
        aaplate = new ItemGemArmor(GCProperties.amethystArmorBaseID - 255, GCEnums.armorAMETHYST, 3, 1).setUnlocalizedName("gc_chestAmethyst").setTextureName("gemscraft:chestAmethyst");
        aaleggings = new ItemGemArmor(GCProperties.amethystArmorBaseID - 254, GCEnums.armorAMETHYST, 3, 2).setUnlocalizedName("gc_legsAmethyst").setTextureName("gemscraft:legsAmethyst");
        aaboots = new ItemGemArmor(GCProperties.amethystArmorBaseID - 253, GCEnums.armorAMETHYST, 3, 3).setUnlocalizedName("gc_bootsAmethyst").setTextureName("gemscraft:bootsAmethyst");
        rahelmet = new ItemGemArmor(GCProperties.rubyArmorBaseID - 256, GCEnums.armorRUBY, 3, 0).setUnlocalizedName("gc_helmetRuby").setTextureName("gemscraft:helmetRuby");
        raplate = new ItemGemArmor(GCProperties.rubyArmorBaseID - 255, GCEnums.armorRUBY, 3, 1).setUnlocalizedName("gc_chestRuby").setTextureName("gemscraft:chestRuby");
        raleggings = new ItemGemArmor(GCProperties.rubyArmorBaseID - 254, GCEnums.armorRUBY, 3, 2).setUnlocalizedName("gc_legsRuby").setTextureName("gemscraft:legsRuby");
        raboots = new ItemGemArmor(GCProperties.rubyArmorBaseID - 253, GCEnums.armorRUBY, 3, 3).setUnlocalizedName("gc_bootsRuby").setTextureName("gemscraft:bootsRuby");
        sahelmet = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 256, GCEnums.armorSAPPHIRE, 3, 0).setUnlocalizedName("gc_helmetSapphire").setTextureName("gemscraft:helmetSapphire");
        saplate = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 255, GCEnums.armorSAPPHIRE, 3, 1).setUnlocalizedName("gc_chestSapphire").setTextureName("gemscraft:chestSapphire");
        saleggings = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 254, GCEnums.armorSAPPHIRE, 3, 2).setUnlocalizedName("gc_legsSapphire").setTextureName("gemscraft:legsSapphire");
        saboots = new ItemGemArmor(GCProperties.sapphireArmorBaseID - 253, GCEnums.armorSAPPHIRE, 3, 3).setUnlocalizedName("gc_bootsSapphire").setTextureName("gemscraft:bootsSapphire");
        eahelmet = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 256, GCEnums.armorEMERALD, 3, 0).setUnlocalizedName("gc_helmetEmerald").setTextureName("gemscraft:helmetEmerald");
        eaplate = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 255, GCEnums.armorEMERALD, 3, 1).setUnlocalizedName("gc_chestEmerald").setTextureName("gemscraft:chestEmerald");
        ealeggings = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 254, GCEnums.armorEMERALD, 3, 2).setUnlocalizedName("gc_legsEmerald").setTextureName("gemscraft:legsEmerald");
        eaboots = new ItemGemArmor(GCProperties.emeraldArmorBaseID - 253, GCEnums.armorEMERALD, 3, 3).setUnlocalizedName("gc_bootsEmerald").setTextureName("gemscraft:bootsEmerald");
        tahelmet = new ItemGemArmor(GCProperties.topazArmorBaseID - 256, GCEnums.armorTOPAZ, 3, 0).setUnlocalizedName("gc_helmetTopaz").setTextureName("gemscraft:helmetTopaz");
        taplate = new ItemGemArmor(GCProperties.topazArmorBaseID - 255, GCEnums.armorTOPAZ, 3, 1).setUnlocalizedName("gc_chestTopaz").setTextureName("gemscraft:chestTopaz");
        taleggings = new ItemGemArmor(GCProperties.topazArmorBaseID - 254, GCEnums.armorTOPAZ, 3, 2).setUnlocalizedName("gc_legsTopaz").setTextureName("gemscraft:legsTopaz");
        taboots = new ItemGemArmor(GCProperties.topazArmorBaseID - 253, GCEnums.armorTOPAZ, 3, 3).setUnlocalizedName("gc_bootsTopaz").setTextureName("gemscraft:bootsTopaz");
        bdhelmet = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 256, GCEnums.armorBLACKDIAMOND, 3, 0).setUnlocalizedName("gc_helmetBlackDiamond").setTextureName("gemscraft:helmetBlackDiamond");
        bdplate = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 255, GCEnums.armorBLACKDIAMOND, 3, 1).setUnlocalizedName("gc_chestBlackDiamond").setTextureName("gemscraft:chestBlackDiamond");
        bdleggings = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 254, GCEnums.armorBLACKDIAMOND, 3, 2).setUnlocalizedName("gc_legsBlackDiamond").setTextureName("gemscraft:legsBlackDiamond");
        bdboots = new ItemGemArmor(GCProperties.blackDiamondArmorBaseID - 253, GCEnums.armorBLACKDIAMOND, 3, 3).setUnlocalizedName("gc_bootsBlackDiamond").setTextureName("gemscraft:bootsBlackDiamond");
    }
}