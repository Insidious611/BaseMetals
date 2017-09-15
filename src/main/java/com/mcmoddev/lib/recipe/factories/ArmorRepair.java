package com.mcmoddev.lib.recipe.factories;

import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import com.mcmoddev.lib.init.Materials;
import com.mcmoddev.lib.material.MMDMaterial;
import com.mcmoddev.lib.recipe.BootsRepairRecipe;
import com.mcmoddev.lib.recipe.LeggingsRepairRecipe;
import com.mcmoddev.lib.recipe.ChestplateRepairRecipe;
import com.mcmoddev.lib.recipe.HelmetRepairRecipe;
import com.mcmoddev.lib.recipe.ShieldRepairRecipe;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.JsonUtils;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;

public class ArmorRepair implements IRecipeFactory {

	@Override
	public IRecipe parse(JsonContext context, JsonObject json) {
		String material = JsonUtils.getString(json, "material");
		String type = JsonUtils.getString(json, "armorType").toLowerCase();
		MMDMaterial mat = Materials.getMaterialByName(material);
		
		switch(type) {
		case "boots":
			return new BootsRepairRecipe(mat);
		case "leggings":
			return new LeggingsRepairRecipe(mat);
		case "chestplate":
			return new ChestplateRepairRecipe(mat);
		case "helmet":
			return new HelmetRepairRecipe(mat);
		case "shield":
			return new ShieldRepairRecipe(mat);
		default:
			throw new JsonSyntaxException("Unknown Armor Type '"+type+"' specified!");
		}
	}

}
