package com.example;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface BowstringSpoolConfig extends Config
{
	@ConfigItem(
		keyName = "spool",
		name = "Bowstring Spool Counter",
		description = "An overlay of the amount of bowstrings still in the spool"
	)
	default String greeting()
	{
		return "Hello";
	}
}
