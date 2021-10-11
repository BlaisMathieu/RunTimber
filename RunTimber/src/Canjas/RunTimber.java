package Canjas;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class RunTimber extends JavaPlugin {
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PluginListener(this), (Plugin) this);
    }
}
