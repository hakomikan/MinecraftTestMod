package com.example.examplemod

import cpw.mods.fml.common.registry.GameRegistry
import net.minecraft.init.Blocks
import cpw.mods.fml.common.Mod
import cpw.mods.fml.common.Mod.EventHandler
import cpw.mods.fml.common.event.FMLInitializationEvent
import net.minecraft.init.Items
import net.minecraft.item.ItemStack

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
class ExampleMod
{
    companion object{
        const val MODID = "examplemod"
        const val VERSION = "1.0"
    }

    @EventHandler
    fun init(event : FMLInitializationEvent) {
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.unlocalizedName)

        GameRegistry.addRecipe(ItemStack(Items.diamond, 32),
                "#",
                "#",
                "#",
                '#', Blocks.dirt)

        GameRegistry.addRecipe(ItemStack(Items.diamond),
                "###",
                '#', Blocks.sand)
    }
}
