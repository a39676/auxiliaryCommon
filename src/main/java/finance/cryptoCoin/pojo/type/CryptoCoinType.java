package finance.cryptoCoin.pojo.type;

public enum CryptoCoinType {
	
	TEST("TEST", -1),

	BTC ("BTC", 0),
	ETH	("ETH", 1),
	FIL("FIL", 2),
	BCH("BCH", 3),
	HT("HT", 4),
	XRP("XRP", 5),
	LTC("LTC", 6),
	EOS("EOS", 7),
	BTT("BTT", 8),

	ADA("ADA", 9),
	BNB("BNB", 10),
	DOT("DOT", 11),
	LINK("LINK", 12),
	USDT("USDT", 13),
	UNI("UNI", 14),
	BUSD("BUSD", 15),
	DOGE("DOGE", 16),
	XLM("XLM", 17),
	FTM("FTM", 18),
	TRX("TRX", 19),
	OKB("OKB", 20),
	ATOM("ATOM", 21),
	IOST("IOST", 22),
	MATIC("MATIC", 23),
	BSV("BSV", 24),
	ETC("ETC", 25),
	XEM("XEM", 26),
	ZEC("ZEC", 27),
	NEO("NEO", 28),
	SUSHI("SUSHI", 29),
	DASH("DASH", 30),
	USDC("USDC", 31),
	XTZ("XTZ", 32),
	SXP("SXP", 33),
	SOL("SOL", 34),
	ONT("ONT", 35),
	ALGO("ALGO", 36),
	XMR("XMR", 37),
	CRO("CRO", 38),
	ENJ("ENJ", 39),
	SRM("SRM", 40),
	VET("VET", 41),
	ICX("ICX", 42),
	QTUM("QTUM", 43),
	AAVE("AAVE", 44),
	LUNA("LUNA", 45),
	RVN("RVN", 46),
	NEAR("NEAR", 47),
	KSM("KSM", 48),
	OMG("OMG", 49),
	EGLD("EGLD", 50),
	MIOTA("MIOTA", 51),
	ZIL("ZIL", 52),
	ZRX("ZRX", 53),
	COMP("COMP", 54),
	SNX("SNX", 55),
	AVAX("AVAX", 56),
	JST("JST", 57),
	CRV("CRV", 58),
	COTI("COTI", 59),
	YFI("YFI", 60),
	XVS("XVS", 61),
	HBAR("HBAR", 62),
	THETA("THETA", 63),
	CHZ("CHZ", 64),
	ALPHA("ALPHA", 65),
	BAND("BAND", 66),
	REN("REN", 67),
	BAT("BAT", 68),
	FTT("FTT", 69),
	GRT("GRT", 70),
	NPXS("NPXS", 71),
	LSK("LSK", 72),
	UNFI("UNFI", 73),
	MANA("MANA", 74),
	CKB("CKB", 75),
	GAS("GAS", 76),
	AION("AION", 77),
	CTSI("CTSI", 78),
	BNT("BNT", 79),
	CAKE("CAKE", 80),
	SBD("SBD", 81),
	KAVA("KAVA", 82),
	SUN("SUN", 83),
	ONE("ONE", 84),
	NANO("NANO", 85),
	WAVES("WAVES", 86),
	RSR("RSR", 87),
	ANKR("ANKR", 88),
	WBTC("WBTC", 89),
	KLAY("KLAY", 90),
	KNC("KNC", 91),
	NU("NU", 92),
	TOMO("TOMO", 93),
	HOLO("HOLO", 94),
	YFII("YFII", 95),
	MFT("MFT", 96),
	STEEM("STEEM", 97),
	RUNE("RUNE", 98),
	MKR("MKR", 99),
	;
	
	
	private String name;
	private Integer code;
	
	CryptoCoinType(String name, Integer code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	
	public Integer getCode() {
		return this.code;
	}
	
	public static CryptoCoinType getType(String typeName) {
		for(CryptoCoinType t : CryptoCoinType.values()) {
			if(t.getName().equals(typeName)) {
				return t;
			}
		}
		return null;
	}
	
	public static CryptoCoinType getType(Integer typeCode) {
		for (CryptoCoinType t : CryptoCoinType.values()) {
			if(t.getCode().equals(typeCode)) {
				return t;
			}
		}
		return null;
	}
}
