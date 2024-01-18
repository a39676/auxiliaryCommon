package auxiliaryCommon.pojo.type;

public enum TimeUnitType {
	
	NANO_SECOND("nanoSecond", "纳秒",  0),
	MILLION_SECOND("millionSecond", "毫秒", 1),
	SECOND("second", "秒", 2),
	MINUTE("minute", "分", 3),
	HOUR("hour", "时", 4),
	DAY("day", "日", 5),
	WEEK("week", "周", 6),
	MONTH("month", "月", 7),
	YEAR("year", "年", 8),
	;
	
	private String name;
	private String cnName;
	private Integer code;
	
	TimeUnitType(String name, String cnName, Integer code) {
		this.name = name;
		this.cnName = cnName;
		this.code = code;
	}
	

	public String getName() {
		return name;
	}

	public String getCnName() {
		return cnName;
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
