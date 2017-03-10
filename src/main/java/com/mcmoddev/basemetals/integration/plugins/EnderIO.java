package com.mcmoddev.basemetals.integration.plugins;

import com.mcmoddev.basemetals.BaseMetals;
import com.mcmoddev.lib.integration.MMDPlugin;
import com.mcmoddev.lib.integration.IIntegration;

/**
 *
 * @author Jasmine Iwanek
 *
 */
@MMDPlugin(addonId = BaseMetals.MODID, pluginId = EnderIO.PLUGIN_MODID)
public class EnderIO extends com.mcmoddev.lib.integration.plugins.EnderIOBase implements IIntegration {

	private static boolean initDone = false;

	/**
	 *
	 */
	@Override
	public void init() {
		if (initDone || !com.mcmoddev.basemetals.util.Config.Options.enableEnderIO) {
			return;
		}

		// TODO: Verify blocks, Slabs, Ingots, Oreblocks
		addSagMillRecipe("adamantine");
		addSagMillRecipe("antimony");
		addSagMillRecipe("aquarium");
		addSagMillRecipe("bismuth");
		addSagMillRecipe("brass");
		addSagMillRecipe("bronze");
		addSagMillRecipe("coldiron");
		addSagMillRecipe("copper");
		addSagMillRecipe("cupronickel");
		addSagMillRecipe("electrum");
		addSagMillRecipe("invar");
		addSagMillRecipe("lead");
		addSagMillRecipe("mithril");
		addSagMillRecipe("nickel");
		addSagMillRecipe("pewter");
		addSagMillRecipe("platinum");
		addSagMillRecipe("silver");
		addSagMillRecipe("starsteel");
		addSagMillRecipe("steel");
		addSagMillRecipe("tin");
		addSagMillRecipe("zinc");

		initDone = true;
	}
}
