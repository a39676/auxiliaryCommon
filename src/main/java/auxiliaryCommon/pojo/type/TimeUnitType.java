package auxiliaryCommon.pojo.type;

public enum TimeUnitType {
	
	nanoSecond("nanoSecond", "纳秒",  0),
	milliSecond("milliSecond", "毫秒", 1),
	second("second", "秒", 2),
	minute("minute", "分", 3),
	hour("hour", "时", 4),
	day("day", "日", 5),
	week("week", "周", 6),
	month("month", "月", 7),
	year("year", "年", 8),
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

	public String getCNName() {
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
