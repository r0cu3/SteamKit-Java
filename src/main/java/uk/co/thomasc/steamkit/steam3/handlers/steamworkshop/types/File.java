package uk.co.thomasc.steamkit.steam3.handlers.steamworkshop.types;

import lombok.Getter;

import uk.co.thomasc.steamkit.base.generated.SteammessagesClientserver.CMsgClientUCMEnumerateUserPublishedFilesResponse;

/**
 * Represents the details of a single published file.
 */
public class File {
	/**
	 * Gets the file ID.
	 */
	@Getter private final long fileID;

	public File(CMsgClientUCMEnumerateUserPublishedFilesResponse.PublishedFileId file) {
		fileID = file.getPublishedFileId();
	}

	public File(long fileId) {
		fileID = fileId;
	}
}
