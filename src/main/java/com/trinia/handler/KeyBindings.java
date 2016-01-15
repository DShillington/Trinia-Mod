package com.trinia.handler;
import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
public class KeyBindings {
    public static KeyBinding openGUI;
    public static void init() {
	    openGUI = new KeyBinding("key.openGUI", Keyboard.KEY_Z, "key.categories.yourMod");
	    ClientRegistry.registerKeyBinding(openGUI);
    }
}