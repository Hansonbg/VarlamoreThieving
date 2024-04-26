package com.barclid;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

@ConfigGroup(PrayerDrainPlugin.CONFIG_GROUP)
public interface PrayerDrainConfig extends Config
{
	@ConfigSection(
			name = "Positioning",
			description = "Provides options to adjust the position of the countdown.",
			position = 0
	)
	String positions = "position modifiers";

	@ConfigItem(
			keyName = "doesNothing",
			section = positions,
			name = "This currently does nothing",
			description = "It might do something some time.",
			position = 1
	)
	default boolean showCountdown() {
		return true;
	}

}
