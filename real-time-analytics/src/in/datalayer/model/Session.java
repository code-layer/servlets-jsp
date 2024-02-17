package in.datalayer.model;

public class Session {

	private String id;
	private long creationTime;

	public Session() {

	}

	public Session(String id, long creationTime) {
		super();
		this.id = id;
		this.creationTime = creationTime;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}

}
