package com.RuneSearch;

import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface Config extends net.runelite.client.config.Config
{
	@ConfigItem(
		keyName = "greeting",
		name = "Welcome Greetings",
		description = "The message to show to the user when they login"
	)
	default String greeting()
	{
		return "Hello";
	}
}
