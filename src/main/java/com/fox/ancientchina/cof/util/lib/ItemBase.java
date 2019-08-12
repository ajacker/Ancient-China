package com.fox.ancientchina.cof.util.lib;

import com.fox.ancientchina.cof.AncientChina_COF;
import com.fox.ancientchina.cof.loader.CreativeTabsLoader;
import com.fox.ancientchina.cof.loader.ItemLoader;
import com.fox.ancientchina.core.util.IModelRegister;
import net.minecraft.item.Item;

import static com.fox.ancientchina.cof.AncientChina_COF.MODID;

/**
 * @author ajacker
 */
public class ItemBase extends Item implements IModelRegister {

    public ItemBase(String name) {
        setUnlocalizedName(MODID + "." + name);
        setRegistryName(name);
        setHasSubtypes(true);
        setCreativeTab(CreativeTabsLoader.TAB_AC_COF_ITEM);
        ItemLoader.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        AncientChina_COF.proxy.registerModel(this, 0, "inventory");
    }
}