package auxiliaryCommon.pojo.type;

public enum TimeUnitType {
	
	nanoSecond("nanoSecond", 0),
	milliSecond("milliSecond", 1),
	second("second", 2),
	minute("minute", 3),
	hour("hour", 4),
	day("day", 5),
	week("week", 6),
	month("month", 7),
	year("year", 8),
	;
	
	private String name;
	private Integer code;
	
	TimeUnitType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public Integer getCode() {
		return code;
	}

	public static TimeUnitType getType(String typeName) {
		for(TimeUnitType t : TimeUnitType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static TimeUnitType getType(Integer typeCode) {
		for(TimeUnitType t : TimeUnitType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
