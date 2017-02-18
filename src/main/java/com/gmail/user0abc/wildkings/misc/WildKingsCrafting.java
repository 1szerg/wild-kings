package com.gmail.user0abc.wildkings.misc;

import com.gmail.user0abc.wildkings.block.WildKingsBlocks;
import com.gmail.user0abc.wildkings.item.WildKingsItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * @author Sergii Ivanov
 */
public class WildKingsCrafting {

    public static void preInit() {
        registerRecipes();
    }

    private static void registerRecipes() {
        Utils.log("Registering recipes");
        GameRegistry.addShapelessRecipe(new ItemStack(WildKingsItems.gear),
                WildKingsItems.kingsBlood,
                Items.GOLD_INGOT,
                Items.IRON_INGOT,
                Items.IRON_INGOT,
                Items.IRON_INGOT);

        GameRegistry.addRecipe(new ItemStack(WildKingsItems.gear, 1),
                "RIR",
                "IBI",
                "RIR",
                'I', Items.IRON_INGOT, 'B', WildKingsItems.kingsBlood, 'R', Items.REDSTONE);

        GameRegistry.addShapedRecipe(new ItemStack(WildKingsBlocks.autoWorkbench),
                "ISI",
                "SGS",
                "IPI",
                'I', Items.IRON_INGOT,
                'S', Blocks.PLANKS,
                'G', WildKingsItems.gear,
                'P', Blocks.CRAFTING_TABLE);
        GameRegistry.addShapedRecipe(new ItemStack(WildKingsBlocks.breaker),
                "ISI",
                "SGS",
                "IPI",
                'I', Items.IRON_INGOT,
                'S', Blocks.STONE,
                'G', WildKingsItems.gear,
                'P', Items.DIAMOND_PICKAXE);
        GameRegistry.addShapedRecipe(new ItemStack(WildKingsBlocks.feeder),
                "ISI",
                "SGS",
                "IPI",
                'I', Items.IRON_INGOT,
                'S', Blocks.STONE,
                'G', WildKingsItems.gear,
                'P', Blocks.DROPPER);
        GameRegistry.addShapedRecipe(new ItemStack(WildKingsBlocks.planter),
                "ISI",
                "SGS",
                "IPI",
                'I', Items.IRON_INGOT,
                'S', Blocks.PLANKS,
                'G', WildKingsItems.gear,
                'P', Blocks.DISPENSER);
        GameRegistry.addShapedRecipe(new ItemStack(WildKingsBlocks.fisher),
                "ISI",
                "SGS",
                "IPI",
                'I', Items.IRON_INGOT,
                'S', Blocks.PLANKS,
                'G', WildKingsItems.gear,
                'P', Items.FISHING_ROD);

    }
}
