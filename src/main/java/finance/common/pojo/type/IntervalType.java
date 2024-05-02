package finance.common.pojo.type;

import auxiliaryCommon.pojo.type.TimeUnitType;

public enum IntervalType {

	MINUTE_1("1m", 1, TimeUnitType.MINUTE),
	MINUTE_3("3m", 3, TimeUnitType.MINUTE),
	MINUTE_5("5m", 5, TimeUnitType.MINUTE),
	MINUTE_15("15m", 15, TimeUnitType.MINUTE),
	MINUTE_30("30m", 30, TimeUnitType.MINUTE),
	HOUR_1("1h", 1, TimeUnitType.HOUR),
	HOUR_2("2h", 2, TimeUnitType.HOUR),
	HOUR_4("4h", 4, TimeUnitType.HOUR),
	HOUR_6("6h", 6, TimeUnitType.HOUR),
	HOUR_8("8h", 8, TimeUnitType.HOUR),
	HOUR_12("12h", 12, TimeUnitType.HOUR),
	DAY_1("1d", 1, TimeUnitType.DAY),
	DAY_3("3d", 3, TimeUnitType.DAY),
	WEEK("1w", 1, TimeUnitType.WEEK),
	MONTH("1M", 1, TimeUnitType.MONTH),
	;


	private String name;
	private Integer range;
	private TimeUnitType timeUnit;

	IntervalType(String name, Integer range, TimeUnitType timeUnit) {
		this.name = name;
		this.range = range;
		this.timeUnit = timeUnit;
	}

	public String getName() {
		return name;
	}

	public Integer getRange() {
		return range;
	}

	public TimeUnitType getTimeUnit() {
		return timeUnit;
	}

	public static IntervalType getType(String typeName) {
		for (IntervalType t : IntervalType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

}
