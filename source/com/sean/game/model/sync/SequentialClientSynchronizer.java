package com.sean.game.model.sync;

import com.sean.game.Server;
import com.sean.game.model.npc.Npc;
import com.sean.game.model.player.Player;
import com.sean.game.model.sync.task.NpcSynchronizationTask;
import com.sean.game.model.sync.task.PlayerSynchronizationTask;
import com.sean.game.model.sync.task.PostNpcSynchronizationTask;
import com.sean.game.model.sync.task.PostPlayerSynchronizationTask;
import com.sean.game.model.sync.task.PreNpcSynchronizationTask;
import com.sean.game.model.sync.task.PrePlayerSynchronizationTask;
import com.sean.game.model.sync.task.SynchronizationTask;
import com.sean.shared.utility.MobList;

/**
 * An implementation of {@link ClientSynchronizer} which runs in a single thread
 * (the {@link GameService} thread from which this is called). Each client is
 * processed sequentially. Therefore this class will work well on machines with
 * a single core/processor. The {@link ParallelClientSynchronizer} will work
 * better on machines with multiple cores/processors, however, both classes will
 * work.
 * 
 * @author Graham
 * @author Major
 */
public final class SequentialClientSynchronizer extends ClientSynchronizer {

	/**
	 * Creates the sequential client synchronizer
	 */
	public SequentialClientSynchronizer(Server server) {
		super(server);
	}

	@Override
	public void synchronize() {
		MobList<Player> players = server.getGameWorld().getPlayers();
		MobList<Npc> npcs = server.getGameWorld().getNpcs();

		for (Player player : players) {
			SynchronizationTask task = new PrePlayerSynchronizationTask(player);
			task.run();
		}

		for (Npc npc : npcs) {
			SynchronizationTask task = new PreNpcSynchronizationTask(npc);
			task.run();
		}

		for (Player player : players) {
			SynchronizationTask task = new PlayerSynchronizationTask(server, player);
			task.run();
		}

		for (Player player : players) {
			SynchronizationTask task = new NpcSynchronizationTask(server, player);
			task.run();
		}

		for (Player player : players) {
			SynchronizationTask task = new PostPlayerSynchronizationTask(player);
			task.run();
		}

		for (Npc npc : npcs) {
			SynchronizationTask task = new PostNpcSynchronizationTask(npc);
			task.run();
		}
	}

}