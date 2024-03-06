package finance.common.pojo.type;

public enum IntervalType {

	MINUTE_1("1m"), MINUTE_3("3m"), MINUTE_5("5m"), MINUTE_15("15m"), MINUTE_30("30m"), HOUR_1("1h"), HOUR_2("2h"),
	HOUR_4("4h"), HOUR_6("6h"), HOUR_8("8h"), HOUR_12("12h"), DAY_1("1d"), DAY_3("3d"), WEEK("1w"), MONTH("1M"),;

	private String name;

	IntervalType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
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
