package bookmarks;

public class BookmarkNotFoundException extends RuntimeException{

	public BookmarkNotFoundException(Long bookmarkId) {
		super("could not bookmark user '" + bookmarkId + "'.");
	}
}
