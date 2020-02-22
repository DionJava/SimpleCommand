package me.dionjava.simpleproject;

import org.bukkit.plugin.java.JavaPlugin;

import me.dionjava.simpleproject.commands.SimpleCommand;

public class Main extends JavaPlugin{
	public void onEnable() {
		getCommand("simple").setExecutor(new SimpleCommand());
		System.out.println("SimpleProject On");
	}
	
	public void onDisable() {
		System.out.println("SimpleProject Off");
	}

}
