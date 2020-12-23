package nectoliacore;


import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class NectoliaListeners implements Listener {
	
	@EventHandler
    public void onPlayerConsumeEvent(PlayerItemConsumeEvent event) {
		Player player = event.getPlayer();
		if (event.getItem().equals(Nectoliacore.getInstance().getConfig().getItemStack("Main.item.speed"))) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 600, 2));
		}
		if (event.getItem().equals(Nectoliacore.getInstance().getConfig().getItemStack("Main.item.force"))) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 600, 2));
		}
		if (event.getItem().equals(Nectoliacore.getInstance().getConfig().getItemStack("Main.item.regen"))) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 600, 2));
		}
		if (event.getItem().equals(Nectoliacore.getInstance().getConfig().getItemStack("Main.item.fire"))) {
			player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 600, 2));
		}
	}
}

