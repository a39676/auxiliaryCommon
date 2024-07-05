package finance.cryptoCoin.binance.pojo.type;

public enum BinancePositionSideType {

	LONG("LONG", 1), SHORT("SHORT", 2),;

	private String name;
	private Integer code;

	BinancePositionSideType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	Integer getCode() {
		return code;
	}

	public static BinancePositionSideType getType(String typeName) {
		for (BinancePositionSideType t : BinancePositionSideType.values()) {
			if (t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	public static BinancePositionSideType getType(Integer code) {
		for (BinancePositionSideType t : BinancePositionSideType.values()) {
			if (t.getCode().equals(code)) {
				return t;
			}
		}
		return null;
	}

}
