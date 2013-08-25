package usefulgravel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = UsefulGravel.modid, name = "Useful Gravel", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class UsefulGravel {
	
	public static final String modid = "squealy_UsefulGravel";
	
	//Blocks
	public static Block condensedGravel;
	
	//Ingots/Resources
	public static Item metalChunk;
	public static Item opIngot;
	public static Item leadIngot;
	
	//Tools
	public static Item leadSword;
	public static Item bropherSword;
	public static Item leadPickaxe;
	public static Item leadAxe;
	public static Item leadShovel;
	public static Item leadHoe;
	
	
	
	
	
	
	
	public static EnumToolMaterial LEADSWORD = EnumHelper.addToolMaterial("LEAD", 2, 300, 2, 2, 14);
	public static EnumToolMaterial OPSWORD = EnumHelper.addToolMaterial("OP", 10, 10000, 10, 600, 14);
	public static EnumToolMaterial LEADPICKAXE = EnumHelper.addToolMaterial("LEADPick", 2, 300, 4, 1, 14);
	public static EnumToolMaterial LEADAXE = EnumHelper.addToolMaterial("LEADAxe", 2, 300, 4, 1, 14);
	public static EnumToolMaterial LEADSHOVEL = EnumHelper.addToolMaterial("LEADShovel", 2, 300, 4, 1, 14);
	public static EnumToolMaterial LEADHOE = EnumHelper.addToolMaterial("LEADPick", 2, 300, 4, 1, 14);
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		condensedGravel = new BlockCondensedGravel(600, Material.clay).setUnlocalizedName("condensedGravel");
		
		
		
		metalChunk = new ItemMetalChunk(5100).setUnlocalizedName("metalChunk");
		leadIngot = new ItemLeadIngot(5101).setUnlocalizedName("leadIngot");
		leadSword = new ItemleadSword(5102, LEADSWORD).setUnlocalizedName("leadSword");
		bropherSword = new ItemBropherSword(5103, OPSWORD).setUnlocalizedName("bropherSword");
		opIngot = new ItemOpIngot(5103).setUnlocalizedName("opIngot");
		leadPickaxe = new ItemLeadPickaxe(5104, LEADPICKAXE).setUnlocalizedName("leadPickaxe");
		leadAxe = new ItemLeadAxe(5105, LEADAXE).setUnlocalizedName("leadAxe");
		leadShovel = new ItemLeadShovel(5106, LEADSHOVEL).setUnlocalizedName("leadShovel");
		leadHoe = new ItemLeadHoe(5107, LEADHOE).setUnlocalizedName("leadHoe");
		
		
		GameRegistry.registerBlock(condensedGravel, modid + condensedGravel.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(condensedGravel, "Condensed Gravel");
		GameRegistry.addShapelessRecipe(new ItemStack(condensedGravel), new Object[]{
			new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel), new ItemStack(Block.gravel),	
		});
		
		GameRegistry.addRecipe(new ItemStack(leadIngot), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', UsefulGravel.metalChunk
		});
		
		GameRegistry.addRecipe(new ItemStack(Item.bucketEmpty), new Object[]{
			"   ",
			"X X",
			" X ",
			'X', UsefulGravel.leadIngot
		});
		
		
		GameRegistry.addRecipe(new ItemStack(leadSword), new Object[]{
			" X ",
			" X ",
			" S ",
			'X', UsefulGravel.leadIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(opIngot), new Object[]{
			"XXX",
			"XXX",
			"XXX",
			'X', Block.blockDiamond
		});
		
		GameRegistry.addRecipe(new ItemStack(bropherSword), new Object[]{
			" X ",
			" X ",
			" S ",
			'X', UsefulGravel.opIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(leadPickaxe), new Object[]{
			"XXX",
			" S ",
			" S ",
			'X', UsefulGravel.leadIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(leadHoe), new Object[]{
			"XX ",
			" S ",
			" S ",
			'X', UsefulGravel.leadIngot, 'S', Item.stick
		});
		
		GameRegistry.addRecipe(new ItemStack(leadAxe), new Object[]{
			"XX ",
			"XS ",
			" S ",
			'X', UsefulGravel.leadIngot, 'S', Item.stick
		});
		GameRegistry.addRecipe(new ItemStack(leadShovel), new Object[]{
			" X ",
			" S ",
			" S ",
			'X', UsefulGravel.leadIngot, 'S', Item.stick
		});
		
		FurnaceRecipes.smelting().addSmelting(Block.gravel.blockID, 0, new ItemStack(metalChunk), 0.2F);
		
		
		
		LanguageRegistry.addName(metalChunk, "Metal Chunks");
		LanguageRegistry.addName(leadIngot, "Lead Ingot");
		LanguageRegistry.addName(leadSword, "Lead Sword");
		LanguageRegistry.addName(bropherSword, "OP Sword");
		LanguageRegistry.addName(opIngot, "OP Ingot");
		LanguageRegistry.addName(leadPickaxe, "Lead Pickaxe");
		LanguageRegistry.addName(leadAxe, "Lead Axe");
		LanguageRegistry.addName(leadShovel, "Lead Shovel");
		LanguageRegistry.addName(leadHoe, "Lead Hoe");
	}

}
 