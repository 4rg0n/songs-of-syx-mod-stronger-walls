package com.github.argon.sos.walls;

import lombok.NoArgsConstructor;
import script.SCRIPT;
import util.info.INFO;

/**
 * Required for loading the mod as "SCRIPT".
 * This does nothing... all the magic happens by overwriting
 * {@link settlement.tilemap.TBuilding} and {@link settlement.tilemap.TFortification}
 */
@NoArgsConstructor
@SuppressWarnings("unused") // used by the game via reflection
public final class StrongerWallsScript implements SCRIPT {

	private final INFO info = new INFO("Stronger Walls 5x", "Quintuples the durability of walls and fortifications.");

	@Override
	public CharSequence name() {
		return info.name;
	}

	@Override
	public CharSequence desc() {
		return info.desc;
	}

	@Override
	public void initBeforeGameCreated() {

	}

	@Override
	public SCRIPT_INSTANCE createInstance() {
		return new Instance();
	}
}