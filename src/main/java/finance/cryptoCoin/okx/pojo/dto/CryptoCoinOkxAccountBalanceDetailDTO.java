package finance.cryptoCoin.okx.pojo.dto;

import java.math.BigDecimal;

public class CryptoCoinOkxAccountBalanceDetailDTO {

	private String accAvgPx; // 现货累计成本价 单位 USD,
	private BigDecimal availBal; // 可用余额,
	private String availEq; // 可用保证金,
	private String borrowFroz; // 币种美金层面潜在借币占用保证金,
	private BigDecimal cashBal; // 币种余额,
	private String ccy; // "USDT",
	private String clSpotInUseAmt; // 用户自定义现货占用数量,
	private String crossLiab; // 币种全仓负债额, 适用于跨币种保证金模式/组合保证金模式,
	private BigDecimal disEq; // 美金层面币种折算权益
	private BigDecimal eq; // 币种总权益
	private BigDecimal eqUsd; // 币种权益美金价值
	private String fixedBal; // 抄底宝、逃顶宝功能的币种冻结金额
	private BigDecimal frozenBal; // 币种占用金额
	private String imr; // 币种维度全仓占用保证金
	private String interest; // 计息，应扣未扣利息
	private String isoEq; // 美金层面逐仓仓位权益
	private String isoLiab; // 币种逐仓负债额
	private String isoUpl; // 逐仓未实现盈亏
	private String liab; // 币种负债额
	private String maxLoan; // 币种最大可借
	private String maxSpotInUse; // 系统计算得到的最大可能现货占用数量, 适用于组合保证金模式
	private String mgnRatio; // 美金层面保证金率, 适用于跨币种保证金模式/组合保证金模式
	private String mmr; // 币种维度全仓维持保证金, 适用于现货和合约模式且有全仓仓位时
	private String notionalLever; // 币种杠杆倍数, 适用于现货和合约模式
	private String openAvgPx; // 现货开仓成本价 单位 USD
	private BigDecimal ordFrozen; // 挂单冻结数量, 适用于现货模式/现货和合约模式/跨币种保证金模式
	private String rewardBal; // 体验金余额
	private String smtSyncEq; // 合约智能跟单权益, 默认为0，仅适用于跟单人。
	private String spotBal; // 现货余额 ，单位为 币种，比如 BTC
	private String spotCopyTradingEq; // 现货智能跟单权益, 默认为0，仅适用于跟单人。
	private String spotInUseAmt; // 现货对冲占用数量, 适用于组合保证金模式
	private String spotIsoBal; // 现货逐仓余额, 仅适用于现货带单/跟单, 适用于现货模式/现货和合约模式
	private String spotUpl; // 现货未实现收益，单位 USD
	private String spotUplRatio; // 现货未实现收益率
	private String stgyEq; // 策略权益
	private String totalPnl; // 现货累计收益，单位 USD
	private String totalPnlRatio; // 现货累计收益率
	private String twap; // 当前负债币种触发系统自动换币的风险, 0~5 数字越大代表您的负债币种触发自动换币概率越高, 适用于跨币种保证金模式/组合保证金模式
	private String uTime; // 账户信息的更新时间，Unix时间戳的毫秒数格式，如 15970263830851734012797795
	private String upl; // 账户层面全仓未实现盈亏（美元单位）, 适用于跨币种保证金模式/组合保证金模式
	private String uplLiab; // 由于仓位未实现亏损导致的负债, 适用于跨币种保证金模式/组合保证金模式

	public String getAccAvgPx() {
		return accAvgPx;
	}

	public void setAccAvgPx(String accAvgPx) {
		this.accAvgPx = accAvgPx;
	}

	public BigDecimal getAvailBal() {
		return availBal;
	}

	public void setAvailBal(BigDecimal availBal) {
		this.availBal = availBal;
	}

	public String getAvailEq() {
		return availEq;
	}

	public void setAvailEq(String availEq) {
		this.availEq = availEq;
	}

	public String getBorrowFroz() {
		return borrowFroz;
	}

	public void setBorrowFroz(String borrowFroz) {
		this.borrowFroz = borrowFroz;
	}

	public BigDecimal getCashBal() {
		return cashBal;
	}

	public void setCashBal(BigDecimal cashBal) {
		this.cashBal = cashBal;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getClSpotInUseAmt() {
		return clSpotInUseAmt;
	}

	public void setClSpotInUseAmt(String clSpotInUseAmt) {
		this.clSpotInUseAmt = clSpotInUseAmt;
	}

	public String getCrossLiab() {
		return crossLiab;
	}

	public void setCrossLiab(String crossLiab) {
		this.crossLiab = crossLiab;
	}

	public BigDecimal getDisEq() {
		return disEq;
	}

	public void setDisEq(BigDecimal disEq) {
		this.disEq = disEq;
	}

	public BigDecimal getEq() {
		return eq;
	}

	public void setEq(BigDecimal eq) {
		this.eq = eq;
	}

	public BigDecimal getEqUsd() {
		return eqUsd;
	}

	public void setEqUsd(BigDecimal eqUsd) {
		this.eqUsd = eqUsd;
	}

	public String getFixedBal() {
		return fixedBal;
	}

	public void setFixedBal(String fixedBal) {
		this.fixedBal = fixedBal;
	}

	public BigDecimal getFrozenBal() {
		return frozenBal;
	}

	public void setFrozenBal(BigDecimal frozenBal) {
		this.frozenBal = frozenBal;
	}

	public String getImr() {
		return imr;
	}

	public void setImr(String imr) {
		this.imr = imr;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getIsoEq() {
		return isoEq;
	}

	public void setIsoEq(String isoEq) {
		this.isoEq = isoEq;
	}

	public String getIsoLiab() {
		return isoLiab;
	}

	public void setIsoLiab(String isoLiab) {
		this.isoLiab = isoLiab;
	}

	public String getIsoUpl() {
		return isoUpl;
	}

	public void setIsoUpl(String isoUpl) {
		this.isoUpl = isoUpl;
	}

	public String getLiab() {
		return liab;
	}

	public void setLiab(String liab) {
		this.liab = liab;
	}

	public String getMaxLoan() {
		return maxLoan;
	}

	public void setMaxLoan(String maxLoan) {
		this.maxLoan = maxLoan;
	}

	public String getMaxSpotInUse() {
		return maxSpotInUse;
	}

	public void setMaxSpotInUse(String maxSpotInUse) {
		this.maxSpotInUse = maxSpotInUse;
	}

	public String getMgnRatio() {
		return mgnRatio;
	}

	public void setMgnRatio(String mgnRatio) {
		this.mgnRatio = mgnRatio;
	}

	public String getMmr() {
		return mmr;
	}

	public void setMmr(String mmr) {
		this.mmr = mmr;
	}

	public String getNotionalLever() {
		return notionalLever;
	}

	public void setNotionalLever(String notionalLever) {
		this.notionalLever = notionalLever;
	}

	public String getOpenAvgPx() {
		return openAvgPx;
	}

	public void setOpenAvgPx(String openAvgPx) {
		this.openAvgPx = openAvgPx;
	}

	public BigDecimal getOrdFrozen() {
		return ordFrozen;
	}

	public void setOrdFrozen(BigDecimal ordFrozen) {
		this.ordFrozen = ordFrozen;
	}

	public String getRewardBal() {
		return rewardBal;
	}

	public void setRewardBal(String rewardBal) {
		this.rewardBal = rewardBal;
	}

	public String getSmtSyncEq() {
		return smtSyncEq;
	}

	public void setSmtSyncEq(String smtSyncEq) {
		this.smtSyncEq = smtSyncEq;
	}

	public String getSpotBal() {
		return spotBal;
	}

	public void setSpotBal(String spotBal) {
		this.spotBal = spotBal;
	}

	public String getSpotCopyTradingEq() {
		return spotCopyTradingEq;
	}

	public void setSpotCopyTradingEq(String spotCopyTradingEq) {
		this.spotCopyTradingEq = spotCopyTradingEq;
	}

	public String getSpotInUseAmt() {
		return spotInUseAmt;
	}

	public void setSpotInUseAmt(String spotInUseAmt) {
		this.spotInUseAmt = spotInUseAmt;
	}

	public String getSpotIsoBal() {
		return spotIsoBal;
	}

	public void setSpotIsoBal(String spotIsoBal) {
		this.spotIsoBal = spotIsoBal;
	}

	public String getSpotUpl() {
		return spotUpl;
	}

	public void setSpotUpl(String spotUpl) {
		this.spotUpl = spotUpl;
	}

	public String getSpotUplRatio() {
		return spotUplRatio;
	}

	public void setSpotUplRatio(String spotUplRatio) {
		this.spotUplRatio = spotUplRatio;
	}

	public String getStgyEq() {
		return stgyEq;
	}

	public void setStgyEq(String stgyEq) {
		this.stgyEq = stgyEq;
	}

	public String getTotalPnl() {
		return totalPnl;
	}

	public void setTotalPnl(String totalPnl) {
		this.totalPnl = totalPnl;
	}

	public String getTotalPnlRatio() {
		return totalPnlRatio;
	}

	public void setTotalPnlRatio(String totalPnlRatio) {
		this.totalPnlRatio = totalPnlRatio;
	}

	public String getTwap() {
		return twap;
	}

	public void setTwap(String twap) {
		this.twap = twap;
	}

	public String getuTime() {
		return uTime;
	}

	public void setuTime(String uTime) {
		this.uTime = uTime;
	}

	public String getUpl() {
		return upl;
	}

	public void setUpl(String upl) {
		this.upl = upl;
	}

	public String getUplLiab() {
		return uplLiab;
	}

	public void setUplLiab(String uplLiab) {
		this.uplLiab = uplLiab;
	}

	@Override
	public String toString() {
		return "CryptoCoinOkxAccountBalanceDTO [accAvgPx=" + accAvgPx + ", availBal=" + availBal + ", availEq="
				+ availEq + ", borrowFroz=" + borrowFroz + ", cashBal=" + cashBal + ", ccy=" + ccy + ", clSpotInUseAmt="
				+ clSpotInUseAmt + ", crossLiab=" + crossLiab + ", disEq=" + disEq + ", eq=" + eq + ", eqUsd=" + eqUsd
				+ ", fixedBal=" + fixedBal + ", frozenBal=" + frozenBal + ", imr=" + imr + ", interest=" + interest
				+ ", isoEq=" + isoEq + ", isoLiab=" + isoLiab + ", isoUpl=" + isoUpl + ", liab=" + liab + ", maxLoan="
				+ maxLoan + ", maxSpotInUse=" + maxSpotInUse + ", mgnRatio=" + mgnRatio + ", mmr=" + mmr
				+ ", notionalLever=" + notionalLever + ", openAvgPx=" + openAvgPx + ", ordFrozen=" + ordFrozen
				+ ", rewardBal=" + rewardBal + ", smtSyncEq=" + smtSyncEq + ", spotBal=" + spotBal
				+ ", spotCopyTradingEq=" + spotCopyTradingEq + ", spotInUseAmt=" + spotInUseAmt + ", spotIsoBal="
				+ spotIsoBal + ", spotUpl=" + spotUpl + ", spotUplRatio=" + spotUplRatio + ", stgyEq=" + stgyEq
				+ ", totalPnl=" + totalPnl + ", totalPnlRatio=" + totalPnlRatio + ", twap=" + twap + ", uTime=" + uTime
				+ ", upl=" + upl + ", uplLiab=" + uplLiab + "]";
	}

}
