package com.sean.shared.network.game.event.impl;

import com.sean.game.model.sync.reference.Appearance;
import com.sean.shared.network.game.event.Message;

public class PlayerDesignEvent  extends Message {

	/**
	 * The appearance.
	 */
	private final Appearance appearance;

	/**
	 * Creates the player design message.
	 *
	 * @param appearance The appearance.
	 */
	public PlayerDesignEvent(Appearance appearance) {
		this.appearance = appearance;
	}

	/**
	 * Gets the appearance.
	 *
	 * @return The appearance.
	 */
	public Appearance getAppearance() {
		return appearance;
	}	
	
	
}
