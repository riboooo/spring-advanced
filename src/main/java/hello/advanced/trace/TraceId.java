package hello.advanced.trace;

import java.util.UUID;

public class TraceId {
	private String id;
	private int level;

	public TraceId() {
		this.id = createID();
		this.level = 0;
	}

	private TraceId(String id, int level) {
		this.id = id;
		this.level = level;
	}

	private String createID() {
		return UUID.randomUUID().toString().substring(0, 8);
	}

	private TraceId createNextId() {
		return new TraceId(id, level + 1);
	}

	private TraceId createPreviousId() {
		return new TraceId(id, level - 1);
	}

	public boolean isFirstLevel() {
		return level == 0;
	}

	public String getId() {
		return id;
	}

	public int getLevel() {
		return level;
	}
}
