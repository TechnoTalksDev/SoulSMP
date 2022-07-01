package net.technotalks.soulsmp

import org.bukkit.Bukkit.getPluginManager
import org.bukkit.plugin.java.JavaPlugin

class SoulSMP : JavaPlugin() {

    companion object {
        val soul = ItemManager.Soul()
        val soulSword = ItemManager.SoulSword()
        val soulAxe = ItemManager.SoulAxe()
        val soulBow = ItemManager.SoulBow()
        val soulCrossbow = ItemManager.SoulCrossbow()
        val soulTrident = ItemManager.SoulTrident()
        val dev = true
    }

    override fun onEnable() {
        logger.warning("KOTLIN STDLIB PLUGIN IS REQUIRED!!!")
        getPluginManager().registerEvents(Events(), this)
        soulSword.register()
        soulAxe.register()
        soulBow.register()
        soulCrossbow.register()
        soulTrident.register()
        logger.info("Souls ready to go...")
        logger.warning("DEV MODE ENABLED!")
    }

    override fun onDisable() {
        logger.info("Souls leaving...")
    }
}