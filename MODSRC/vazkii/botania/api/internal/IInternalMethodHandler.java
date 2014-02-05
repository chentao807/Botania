/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 * 
 * File Created @ [Jan 14, 2014, 6:34:34 PM (GMT)]
 */
package vazkii.botania.api.internal;

import java.util.List;

import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.Icon;
import vazkii.botania.api.lexicon.LexiconPage;

/**
 * Any methods that refer to internal methods in Botania are here.
 * This is defaulted to a dummy handler, whose methods do nothing.
 * This handler is set to a proper one on PreInit. Make sure to
 * make your mod load after Botania if you have any intention of
 * doing anythign with this on PreInit.
 */
public interface IInternalMethodHandler {

	public LexiconPage textPage(String key);

	public LexiconPage imagePage(String key, String resource);

	public LexiconPage recipesPage(String key, List<IRecipe> recipes);

	public LexiconPage recipePage(String key, IRecipe recipe);

	public Icon getSubTileIconForName(String name);

}
