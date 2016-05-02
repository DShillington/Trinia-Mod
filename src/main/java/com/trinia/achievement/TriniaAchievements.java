package com.trinia.achievement;

import com.trinia.items.TriniaItems;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.StatBase;
import net.minecraftforge.common.AchievementPage;

public class TriniaAchievements {
	
	public static final AchievementPage TA = new AchievementPage("Trinia Achievements");
	public static Achievement achievementEnter;

	
	public static void init() {
		AchievementPage.registerAchievementPage(TA);
		registerMiscAchievements();
	}

	public static void registerMiscAchievements() {
		achievementEnter = addAchievement("Enter Trinia", "giantMushroom", 0, 0, new ItemStack(TriniaItems.bridroneIngot), (Achievement)null);
		
	}

	public static Achievement addAchievement(String n, String id, int x, int y, ItemStack icon, Achievement a) {
		Achievement achievement = new Achievement(n, id, x, y, icon, a);
		achievement.registerStat();
		TA.getAchievements().add(achievement);
		return achievement;
	}
}