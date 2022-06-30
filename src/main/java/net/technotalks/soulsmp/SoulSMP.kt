package net.technotalks.soulsmp

import org.bukkit.Bukkit.getPluginManager
import org.bukkit.plugin.java.JavaPlugin

class SoulSMP : JavaPlugin() {

    companion object {
        val soul = ItemManager.Soul()
        val soulSword = ItemManager.SoulSword()
        val dev = true
    }

    override fun onEnable() {
        getPluginManager().registerEvents(Events(), this)
        soulSword.register()
        logger.info("Souls ready to go...")
        logger.warning("DEV MODE ENABLED SOULS WILL DROP FOR NORMAL DEATHS!")
    }

    override fun onDisable() {
        logger.info("Souls leaving...")
    }
}