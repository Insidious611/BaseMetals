package cyano.basemetals.init;

import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import com.mcmoddev.basemetals.init.ItemGroups;
import com.mcmoddev.basemetals.init.Materials;
import com.mcmoddev.basemetals.util.Config.Options;
import com.mcmoddev.lib.material.MMDMaterial;

import net.minecraft.block.Block;

public class Blocks extends com.mcmoddev.basemetals.init.Blocks {

	// Backwards Compatibility
	public static Block adamantine_block;
	public static Block adamantine_ore;

	public static Block antimony_block;
	public static Block antimony_ore;

	public static Block aquarium_block;

	public static Block bismuth_block;
	public static Block bismuth_ore;

	public static Block brass_block;

	public static Block bronze_block;

	public static Block coldiron_block;
	public static Block coldiron_ore;

	public static Block copper_block;
	public static Block copper_ore;

	public static Block cupronickel_block;

	public static Block electrum_block;

	public static Block invar_block;

	public static Block lead_block;
	public static Block lead_ore;

	public static Block mithril_block;

	public static Block nickel_block;
	public static Block nickel_ore;

	public static Block pewter_block;

	public static Block platinum_block;
	public static Block platinum_ore;

	public static Block silver_block;
	public static Block silver_ore;

	public static Block starsteel_block;
	public static Block starsteel_ore;

	public static Block steel_block;
	public static Block steel_plate;

	public static Block tin_block;
	public static Block tin_ore;

	public static Block zinc_block;
	public static Block zinc_ore;

	private static boolean initDone = false;

	private Blocks() {
		throw new IllegalAccessError("Not a instantiable class");
	}

	/**
	 *
	 */
	public static void init() {
		if (initDone) {
			return;
		}

		Materials.init();
		ItemGroups.init();

		@Nonnull
		MMDMaterial material;

		if (Options.enableAdamantine) {
			material = Materials.adamantine;
			adamantine_block = material.block;
			adamantine_ore = material.ore;
		}

		if (Options.enableAntimony) {
			material = Materials.antimony;
			antimony_block = material.block;
			antimony_ore = material.ore;
		}

		if (Options.enableAquarium) {
			material = Materials.aquarium;
			aquarium_block = material.block;
		}

		if (Options.enableBismuth) {
			material = Materials.bismuth;
			bismuth_block = material.block;
			bismuth_ore = material.ore;
		}

		if (Options.enableBrass) {
			material = Materials.brass;
			brass_block = material.block;
		}

		if (Options.enableBronze) {
			material = Materials.bronze;
			bronze_block = material.block;
		}

		if (Options.enableColdIron) {
			material = Materials.coldiron;
			coldiron_block = material.block;
			coldiron_ore = material.ore;
		}

		if (Options.enableCopper) {
			material = Materials.copper;
			copper_block = material.block;
			copper_ore = material.ore;
		}

		if (Options.enableCupronickel) {
			material = Materials.cupronickel;
			cupronickel_block = material.block;
		}
		
		if (Options.enableElectrum) {
			material = Materials.electrum;
			electrum_block = material.block;
		}

		if (Options.enableInvar) {
			material = Materials.invar;
			invar_block = material.block;
		}

		if (Options.enableLead) {
			material = Materials.lead;
			lead_block = material.block;
			lead_ore = material.ore;
		}

		if (Options.enableMithril) {
			material = Materials.mithril;
			mithril_block = material.block;
		}

		if (Options.enableNickel) {
			material = Materials.nickel;
			nickel_block = material.block;
			nickel_ore = material.ore;
		}

		if (Options.enablePewter) {
			material = Materials.pewter;
			pewter_block = material.block;
		}

		if (Options.enablePlatinum) {
			material = Materials.platinum;
			platinum_block = material.block;
			platinum_ore = material.ore;
		}

		if (Options.enableSilver) {
			material = Materials.silver;
			silver_block = material.block;
			silver_ore = material.ore;
		}

		if (Options.enableStarSteel) {
			material = Materials.starsteel;
			starsteel_block = material.block;
			starsteel_ore = material.ore;
		}

		if (Options.enableSteel) {
			material = Materials.steel;
			steel_block = material.block;
			steel_plate = material.plate; // For Power Advantage
		}
		
		if (Options.enableTin) {
			material = Materials.tin;
			tin_block = material.block;
			tin_ore = material.ore;
		}

		if (Options.enableZinc) {
			material = Materials.zinc;
			zinc_block = material.block;
			zinc_ore = material.ore;
		}


		initDone = true;
	}

	/**
	 * Gets a map of all blocks added, sorted by material
	 * 
	 * @deprecated
	 * @return An unmodifiable map of added items catagorized by material
	 */
	@Deprecated
	public static Map<MMDMaterial, List<Block>> getBlocksByMetal() {
		return getBlocksByMaterial();
	}
}
