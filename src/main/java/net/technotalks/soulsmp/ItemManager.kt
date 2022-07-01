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
            meta.setCustomModelData(69421)
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

    class SoulAxe {
        fun getStack(): ItemStack {
            val stack = ItemStack(Material.NETHERITE_AXE, 1)
            val meta = stack.itemMeta
            meta.displayName(Component.text("§bSoul Axe"))
            val lore: MutableList<Component> = ArrayList()
            lore.add(Component.text("Souls do§c great harm..."))
            lore.add(Component.text("When they are in§c agony"))
            meta.lore(lore)
            meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true)
            meta.addEnchant(Enchantment.KNOCKBACK, 5, true)
            val dmg = meta as org.bukkit.inventory.meta.Damageable
            dmg.damage = dmg.damage/4
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            meta.setCustomModelData(69422)
            stack.itemMeta = meta
            return stack
        }

        fun register() {
            val sr = ShapedRecipe(NamespacedKey.minecraft("soul_axe"), getStack())
            sr.shape(
                "SSA",
                "STA",
                "ATA"
            )

            sr.setIngredient('S', SoulSMP.soul.getStack())
            sr.setIngredient('T', Material.STICK)
            Bukkit.getServer().addRecipe(sr)
        }

    }

    class SoulBow {
        fun getStack(): ItemStack {
            val stack = ItemStack(Material.BOW, 1)
            val meta = stack.itemMeta
            meta.displayName(Component.text("§bSoul Bow"))
            val lore: MutableList<Component> = ArrayList()
            lore.add(Component.text("Souls do§c great harm..."))
            lore.add(Component.text("When they are in§c agony"))
            meta.lore(lore)
            meta.addEnchant(Enchantment.ARROW_DAMAGE, 15, true)
            meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true)
            meta.addEnchant(Enchantment.ARROW_KNOCKBACK, 5, true)
            meta.addEnchant(Enchantment.ARROW_FIRE, 1, true)
            val dmg = meta as org.bukkit.inventory.meta.Damageable
            dmg.damage = dmg.damage/4
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            meta.setCustomModelData(69423)
            stack.itemMeta = meta
            return stack
        }

        fun register() {
            val sr = ShapedRecipe(NamespacedKey.minecraft("soul_bow"), getStack())
            sr.shape(
                "AST",
                "SAT",
                "AST"
            )

            sr.setIngredient('S', SoulSMP.soul.getStack())
            sr.setIngredient('T', Material.STRING)
            Bukkit.getServer().addRecipe(sr)
        }

    }
    class SoulCrossbow {
        fun getStack(): ItemStack {
            val stack = ItemStack(Material.CROSSBOW, 1)
            val meta = stack.itemMeta
            meta.displayName(Component.text("§bSoul Crossbow"))
            val lore: MutableList<Component> = ArrayList()
            lore.add(Component.text("Souls do§c great harm..."))
            lore.add(Component.text("When they are in§c agony"))
            meta.lore(lore)
            meta.addEnchant(Enchantment.QUICK_CHARGE, 5, true)
            meta.addEnchant(Enchantment.MULTISHOT, 1, true)
            meta.addEnchant(Enchantment.PIERCING, 5, true)
            val dmg = meta as org.bukkit.inventory.meta.Damageable
            dmg.damage = dmg.damage/4
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            meta.setCustomModelData(69424)
            stack.itemMeta = meta
            return stack
        }

        fun register() {
            val sr = ShapedRecipe(NamespacedKey.minecraft("soul_crossbow"), getStack())
            sr.shape(
                "SIS",
                "RTR",
                "ASA"
            )

            sr.setIngredient('S', SoulSMP.soul.getStack())
            sr.setIngredient('T', Material.TRIPWIRE_HOOK)
            sr.setIngredient('R', Material.STRING)
            sr.setIngredient('I', Material.IRON_INGOT)
            Bukkit.getServer().addRecipe(sr)
        }

    }
    class SoulTrident {
        fun getStack(): ItemStack {
            val stack = ItemStack(Material.TRIDENT, 1)
            val meta = stack.itemMeta
            meta.displayName(Component.text("§bSoul Trident"))
            val lore: MutableList<Component> = ArrayList()
            lore.add(Component.text("Souls do§c great harm..."))
            lore.add(Component.text("When they are in§c agony"))
            meta.lore(lore)
            meta.addEnchant(Enchantment.LOYALTY, 3, true)
            meta.addEnchant(Enchantment.RIPTIDE, 5, true)
            meta.addEnchant(Enchantment.IMPALING, 10, true)
            meta.addEnchant(Enchantment.VANISHING_CURSE, 1, true)
            val dmg = meta as org.bukkit.inventory.meta.Damageable
            dmg.damage = dmg.damage/4
            meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES, ItemFlag.HIDE_ENCHANTS)
            meta.setCustomModelData(69425)
            stack.itemMeta = meta
            return stack
        }

        fun register() {
            val sr = ShapedRecipe(NamespacedKey.minecraft("soul_trident"), getStack())
            sr.shape(
                "SSS",
                "ASA",
                "ATA"
            )

            sr.setIngredient('S', SoulSMP.soul.getStack())
            sr.setIngredient('T', Material.STICK)
            Bukkit.getServer().addRecipe(sr)
        }

    }
}