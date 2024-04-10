package auxiliaryCommon.pojo.type;

public enum HeartBeatType {

	BBT("bbt", 1), WORKER1("worker1", 2),;

	private String name;
	private Integer code;

	HeartBeatType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public Integer getCode() {
		return this.code;
	}

	public static HeartBeatType getType(String typeName) {
		for (HeartBeatType t : HeartBeatType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static HeartBeatType getType(Integer typeCode) {
		for (HeartBeatType t : HeartBeatType.values()) {
			if (t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
