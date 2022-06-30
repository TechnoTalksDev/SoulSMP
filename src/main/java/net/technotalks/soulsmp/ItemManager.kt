package net.technotalks.soulsmp

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.enchantments.Enchantment
import org.bukkit.inventory.ItemFlag
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe

class ItemManager {
    //Soul Item
    class Soul {
        fun getStack(): ItemStack {
            val stack = ItemStack(Material.SOUL_LANTERN, 1)
            val meta = stack.itemMeta
            meta.displayName(Component.text("§bSoul"))
            val lore: MutableList<Component> = ArrayList()
            lore.add(Component.text("A mysterious object..."))
            meta.lore(lore)
            meta.addEnchant(Enchantment.DAMAGE_ALL, 5, true)
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            meta.setCustomModelData(69420)
            stack.itemMeta = meta
            return stack
        }

    }

    //Soul Sword
    class SoulSword {
        fun getStack(): ItemStack {
            val stack = ItemStack(Material.NETHERITE_SWORD, 1)
            val meta = stack.itemMeta
            meta.displayName(Component.text("§bSoul Sword"))
            val lore: MutableList<Component> = ArrayList()
            lore.add(Component.text("Souls do§c great harm..."))
            lore.add(Component.text("When they are in§c agony"))
            meta.lore(lore)
            meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true)
            val dmg = meta as org.bukkit.inventory.meta.Damageable
            dmg.damage = dmg.damage/4
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            stack.itemMeta = meta
            return stack
        }

        fun register() {
            val sr = ShapedRecipe(NamespacedKey.minecraft("soul_sword"), getStack())
            sr.shape(
                "ASA",
                "ASA",
                "ATA"
            )

            sr.setIngredient('S', SoulSMP.soul.getStack())
            sr.setIngredient('T', Material.STICK)
            Bukkit.getServer().addRecipe(sr)
        }

    }
}