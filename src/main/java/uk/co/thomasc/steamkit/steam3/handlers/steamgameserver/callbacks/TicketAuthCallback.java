package uk.co.thomasc.steamkit.steam3.handlers.steamgameserver.callbacks;

import lombok.Getter;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientTicketAuthComplete;

import uk.co.thomasc.steamkit.base.generated.steamlanguage.EAuthSessionResponse;
import uk.co.thomasc.steamkit.steam3.steamclient.callbackmgr.CallbackMsg;
import uk.co.thomasc.steamkit.types.gameid.GameID;
import uk.co.thomasc.steamkit.types.steamid.SteamID;

/**
 * This callback is fired when ticket authentication has completed.
 */
public final class TicketAuthCallback extends CallbackMsg {
	/**
	 * Gets the SteamID the ticket auth completed for.
	 */
	@Getter private SteamID steamID;

	/**
	 * Gets the GameID the ticket was for.
	 */
	@Getter private GameID gameID;

	/**
	 * Gets the authentication state.
	 */
	@Getter private int state;

	/**
	 * Gets the auth session response.
	 */
	@Getter private EAuthSessionResponse authSessionResponse;

	/**
	 * Gets the ticket CRC.
	 */
	@Getter private int ticketCRC;

	/**
	 * Gets the ticket sequence.
	 */
	@Getter private int ticketSequence;

	public TicketAuthCallback(CMsgClientTicketAuthComplete tickAuth) {
		steamID = new SteamID(tickAuth.getSteamId());
		gameID = new GameID(tickAuth.getGameId());

		state = tickAuth.getEstate();

		authSessionResponse = EAuthSessionResponse.f(tickAuth.getEauthSessionResponse());

		ticketCRC = tickAuth.getTicketCrc();
		ticketSequence = tickAuth.getTicketSequence();
	}
}