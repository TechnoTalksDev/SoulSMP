package net.technotalks.soulsmp

import io.papermc.paper.event.player.AsyncChatEvent
import org.bukkit.ChatColor
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.block.BlockPlaceEvent
import org.bukkit.event.entity.PlayerDeathEvent

class Events: Listener {

    @EventHandler
    fun onChatMessage(e: AsyncChatEvent) {
        val message = e.message().toString()

        if (message.contains("drill", ignoreCase = true)) {
            e.isCancelled = true
            val player = e.player

            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cWe don't talk about the drill around these parts..."))
        }
    }

    @EventHandler
    fun onPlayerDeath(e: PlayerDeathEvent) {
        val player = e.player
        if (player.killer != null) {
            player.world.dropItem(player.location, SoulSMP.soul.getStack())
        }
        else if (SoulSMP.dev) {
            player.world.dropItem(player.location, SoulSMP.soul.getStack())
        }
    }

    @EventHandler
    fun onBlockPlace(e: BlockPlaceEvent) {

        val dablock = e.itemInHand.itemMeta.displayName
        val soulblock = SoulSMP.soul.getStack().itemMeta.displayName

        if (soulblock == dablock) {
            e.isCancelled = true
        }

    }

}