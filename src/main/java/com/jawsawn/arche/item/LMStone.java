package com.jawsawn.arche.item;

import com.jawsawn.arche.Arche;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Jason on 1/24/2018.
 */
public class LMStone extends Philo {

    public LMStone() {
        setRegistryName("lminiumstone");
        setUnlocalizedName(Arche.MODID + ".lminiumstone");
        this.setCreativeTab(Arche.tabArche).setMaxDamage(64).setMaxStackSize(1).setNoRepair();
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
