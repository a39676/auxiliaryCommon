package finance.cryptoCoin.okx.pojo.dto;

import java.util.List;

import finance.cryptoCoin.okx.pojo.type.OkxInstType;
import finance.cryptoCoin.okx.pojo.type.OkxMarginType;

public class CryptoCoinOkxPositionDTO {

	/** {@link OkxInstType} */
	private String instType; // String 产品类型
	/** {@link OkxMarginType} */
	private String mgnMode; // String 保证金模式 cross：全仓 isolated：逐仓
	private String posId; // String 持仓ID
	private String posSide; // String 持仓方向 long：开平仓模式开多，pos为正 short：开平仓模式开空，pos为正 net：买卖模式（交割/永续
							// 期权：pos为正代表开多，pos为负代表开空。币币杠杆时，pos均为正，posCcy为交易货币时，代表开多；posCcy为计价货币时，代表开空。）
	private String pos; // String 持仓数量，逐仓自主划转模式下，转入保证金后会产生pos为0的仓位
	private String baseBal; // String 交易币余额，适用于 币币杠杆（逐仓一键借币模式）（已弃用）
	private String quoteBal; // String 计价币余额 ，适用于 币币杠杆（逐仓一键借币模式）（已弃用）
	private String baseBorrowed; // String 交易币已借，适用于 币币杠杆（逐仓一键借币模式）（已弃用）
	private String baseInterest; // String 交易币计息，适用于 币币杠杆（逐仓一键借币模式）（已弃用）
	private String quoteBorrowed; // String 计价币已借，适用于 币币杠杆（逐仓一键借币模式）（已弃用）
	private String quoteInterest; // String 计价币计息，适用于 币币杠杆（逐仓一键借币模式）（已弃用）
	private String posCcy; // String 仓位资产币种，仅适用于币币杠杆仓位
	private String availPos; // String 可平仓数量，适用于 币币杠杆，期权;
								// 对于杠杆仓位，平仓时，杠杆还清负债后，余下的部分会视为币币交易，如果想要减少币币交易的数量，可通过"获取最大可用数量"接口获取只减仓的可用数量。
	private String avgPx; // String 开仓平均价
	private String upl; // String 未实现收益（以标记价格计算）
	private String uplRatio; // String 未实现收益率（以标记价格计算
	private String uplLastPx; // String 以最新成交价格计算的未实现收益，主要做展示使用，实际值还是 upl
	private String uplRatioLastPx; // String 以最新成交价格计算的未实现收益率
	private String instId; // String 产品ID，如 BTC-USDT-SWAP
	private String lever; // String 杠杆倍数，不适用于期权以及组合保证金模式下的全仓仓位
	private String liqPx; // String 预估强平价 不适用于期权
	private String markPx; // String 最新标记价格
	private String imr; // String 初始保证金，仅适用于全仓
	private String margin; // String 保证金余额，可增减，仅适用于逐仓
	private String mgnRatio; // String 保证金率
	private String mmr; // String 维持保证金
	private String liab; // String 负债额，仅适用于币币杠杆
	private String liabCcy; // String 负债币种，仅适用于币币杠杆
	private String interest; // String 利息，已经生成的未扣利息
	private String tradeId; // String 最新成交ID
	private String optVal; // String 期权市值，仅适用于期权
	private String pendingCloseOrdLiabVal; // String 逐仓杠杆负债对应平仓挂单的数量
	private String notionalUsd; // String 以美金价值为单位的持仓数量
	private String adl; // String 信号区 分为5档，从1到5，数字越小代表adl强度越弱
	private String ccy; // String 占用保证金的币种
	private String last; // String 最新成交价
	private String idxPx; // String 最新指数价格
	private String usdPx; // String 保证金币种的市场最新美金价格 仅适用于期权
	private String bePx; // String 盈亏平衡价
	private String deltaBS; // String 美金本位持仓仓位delta，仅适用于期权
	private String deltaPA; // String 币本位持仓仓位delta，仅适用于期权
	private String gammaBS; // String 美金本位持仓仓位gamma，仅适用于期权
	private String gammaPA; // String 币本位持仓仓位gamma，仅适用于期权
	private String thetaBS; // String 美金本位持仓仓位theta，仅适用于期权
	private String thetaPA; // String 币本位持仓仓位theta，仅适用于期权
	private String vegaBS; // String 美金本位持仓仓位vega，仅适用于期权
	private String vegaPA; // String 币本位持仓仓位vega，仅适用于期权
	private String spotInUseAmt; // String 现货对冲占用数量 适用于组合保证金模式
	private String spotInUseCcy; // String 现货对冲占用币种，如 BTC; 适用于组合保证金模式
	private String clSpotInUseAmt; // String 用户自定义现货占用数量 适用于组合保证金模式
	private String maxSpotInUseAmt; // String 系统计算得到的最大可能现货占用数量 适用于组合保证金模式
	private String realizedPnl; // String 已实现收益 仅适用于交割/永续/期权; realizedPnl=pnl+fee+fundingFee+liqPenalty
	private String pnl; // String 平仓订单累计收益额
	private String fee; // String 累计手续费金额，正数代表平台返佣 ，负数代表平台扣除
	private String fundingFee; // String 累计资金费用
	private String liqPenalty; // String 累计爆仓罚金，有值时为负数。
	private List<String> closeOrderAlgo; // Array 平仓策略委托订单。调用策略委托下单，且closeFraction=1 时，该数组才会有值。
	private String algoId; // String 策略委托单ID
	private String slTriggerPx; // String 止损触发价
	private String slTriggerPxType; // String 止损触发价类型; last：最新价格; index：指数价格; mark：标记价格
	private String tpTriggerPx; // String 止盈委托价
	private String tpTriggerPxType; // String 止盈触发价类型; last：最新价格; index：指数价格; mark：标记价格
	private String closeFraction; // String 策略委托触发时，平仓的百分比。1 代表100%
	private String cTime; // String 持仓创建时间，Unix时间戳的毫秒数格式，如 1597026383085
	private String uTime; // String 最近一次持仓更新时间，Unix时间戳的毫秒数格式，如 1597026383085
	private String bizRefId; // String 外部业务id，如 体验券id
	private String bizRefType; // String 外部业务类型

	public String getInstType() {
		return instType;
	}

	public void setInstType(String instType) {
		this.instType = instType;
	}

	public String getMgnMode() {
		return mgnMode;
	}

	public void setMgnMode(String mgnMode) {
		this.mgnMode = mgnMode;
	}

	public String getPosId() {
		return posId;
	}

	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getPosSide() {
		return posSide;
	}

	public void setPosSide(String posSide) {
		this.posSide = posSide;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

	public String getBaseBal() {
		return baseBal;
	}

	public void setBaseBal(String baseBal) {
		this.baseBal = baseBal;
	}

	public String getQuoteBal() {
		return quoteBal;
	}

	public void setQuoteBal(String quoteBal) {
		this.quoteBal = quoteBal;
	}

	public String getBaseBorrowed() {
		return baseBorrowed;
	}

	public void setBaseBorrowed(String baseBorrowed) {
		this.baseBorrowed = baseBorrowed;
	}

	public String getBaseInterest() {
		return baseInterest;
	}

	public void setBaseInterest(String baseInterest) {
		this.baseInterest = baseInterest;
	}

	public String getQuoteBorrowed() {
		return quoteBorrowed;
	}

	public void setQuoteBorrowed(String quoteBorrowed) {
		this.quoteBorrowed = quoteBorrowed;
	}

	public String getQuoteInterest() {
		return quoteInterest;
	}

	public void setQuoteInterest(String quoteInterest) {
		this.quoteInterest = quoteInterest;
	}

	public String getPosCcy() {
		return posCcy;
	}

	public void setPosCcy(String posCcy) {
		this.posCcy = posCcy;
	}

	public String getAvailPos() {
		return availPos;
	}

	public void setAvailPos(String availPos) {
		this.availPos = availPos;
	}

	public String getAvgPx() {
		return avgPx;
	}

	public void setAvgPx(String avgPx) {
		this.avgPx = avgPx;
	}

	public String getUpl() {
		return upl;
	}

	public void setUpl(String upl) {
		this.upl = upl;
	}

	public String getUplRatio() {
		return uplRatio;
	}

	public void setUplRatio(String uplRatio) {
		this.uplRatio = uplRatio;
	}

	public String getUplLastPx() {
		return uplLastPx;
	}

	public void setUplLastPx(String uplLastPx) {
		this.uplLastPx = uplLastPx;
	}

	public String getUplRatioLastPx() {
		return uplRatioLastPx;
	}

	public void setUplRatioLastPx(String uplRatioLastPx) {
		this.uplRatioLastPx = uplRatioLastPx;
	}

	public String getInstId() {
		return instId;
	}

	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getLever() {
		return lever;
	}

	public void setLever(String lever) {
		this.lever = lever;
	}

	public String getLiqPx() {
		return liqPx;
	}

	public void setLiqPx(String liqPx) {
		this.liqPx = liqPx;
	}

	public String getMarkPx() {
		return markPx;
	}

	public void setMarkPx(String markPx) {
		this.markPx = markPx;
	}

	public String getImr() {
		return imr;
	}

	public void setImr(String imr) {
		this.imr = imr;
	}

	public String getMargin() {
		return margin;
	}

	public void setMargin(String margin) {
		this.margin = margin;
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

	public String getLiab() {
		return liab;
	}

	public void setLiab(String liab) {
		this.liab = liab;
	}

	public String getLiabCcy() {
		return liabCcy;
	}

	public void setLiabCcy(String liabCcy) {
		this.liabCcy = liabCcy;
	}

	public String getInterest() {
		return interest;
	}

	public void setInterest(String interest) {
		this.interest = interest;
	}

	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getOptVal() {
		return optVal;
	}

	public void setOptVal(String optVal) {
		this.optVal = optVal;
	}

	public String getPendingCloseOrdLiabVal() {
		return pendingCloseOrdLiabVal;
	}

	public void setPendingCloseOrdLiabVal(String pendingCloseOrdLiabVal) {
		this.pendingCloseOrdLiabVal = pendingCloseOrdLiabVal;
	}

	public String getNotionalUsd() {
		return notionalUsd;
	}

	public void setNotionalUsd(String notionalUsd) {
		this.notionalUsd = notionalUsd;
	}

	public String getAdl() {
		return adl;
	}

	public void setAdl(String adl) {
		this.adl = adl;
	}

	public String getCcy() {
		return ccy;
	}

	public void setCcy(String ccy) {
		this.ccy = ccy;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getIdxPx() {
		return idxPx;
	}

	public void setIdxPx(String idxPx) {
		this.idxPx = idxPx;
	}

	public String getUsdPx() {
		return usdPx;
	}

	public void setUsdPx(String usdPx) {
		this.usdPx = usdPx;
	}

	public String getBePx() {
		return bePx;
	}

	public void setBePx(String bePx) {
		this.bePx = bePx;
	}

	public String getDeltaBS() {
		return deltaBS;
	}

	public void setDeltaBS(String deltaBS) {
		this.deltaBS = deltaBS;
	}

	public String getDeltaPA() {
		return deltaPA;
	}

	public void setDeltaPA(String deltaPA) {
		this.deltaPA = deltaPA;
	}

	public String getGammaBS() {
		return gammaBS;
	}

	public void setGammaBS(String gammaBS) {
		this.gammaBS = gammaBS;
	}

	public String getGammaPA() {
		return gammaPA;
	}

	public void setGammaPA(String gammaPA) {
		this.gammaPA = gammaPA;
	}

	public String getThetaBS() {
		return thetaBS;
	}

	public void setThetaBS(String thetaBS) {
		this.thetaBS = thetaBS;
	}

	public String getThetaPA() {
		return thetaPA;
	}

	public void setThetaPA(String thetaPA) {
		this.thetaPA = thetaPA;
	}

	public String getVegaBS() {
		return vegaBS;
	}

	public void setVegaBS(String vegaBS) {
		this.vegaBS = vegaBS;
	}

	public String getVegaPA() {
		return vegaPA;
	}

	public void setVegaPA(String vegaPA) {
		this.vegaPA = vegaPA;
	}

	public String getSpotInUseAmt() {
		return spotInUseAmt;
	}

	public void setSpotInUseAmt(String spotInUseAmt) {
		this.spotInUseAmt = spotInUseAmt;
	}

	public String getSpotInUseCcy() {
		return spotInUseCcy;
	}

	public void setSpotInUseCcy(String spotInUseCcy) {
		this.spotInUseCcy = spotInUseCcy;
	}

	public String getClSpotInUseAmt() {
		return clSpotInUseAmt;
	}

	public void setClSpotInUseAmt(String clSpotInUseAmt) {
		this.clSpotInUseAmt = clSpotInUseAmt;
	}

	public String getMaxSpotInUseAmt() {
		return maxSpotInUseAmt;
	}

	public void setMaxSpotInUseAmt(String maxSpotInUseAmt) {
		this.maxSpotInUseAmt = maxSpotInUseAmt;
	}

	public String getRealizedPnl() {
		return realizedPnl;
	}

	public void setRealizedPnl(String realizedPnl) {
		this.realizedPnl = realizedPnl;
	}

	public String getPnl() {
		return pnl;
	}

	public void setPnl(String pnl) {
		this.pnl = pnl;
	}

	public String getFee() {
		return fee;
	}

	public void setFee(String fee) {
		this.fee = fee;
	}

	public String getFundingFee() {
		return fundingFee;
	}

	public void setFundingFee(String fundingFee) {
		this.fundingFee = fundingFee;
	}

	public String getLiqPenalty() {
		return liqPenalty;
	}

	public void setLiqPenalty(String liqPenalty) {
		this.liqPenalty = liqPenalty;
	}

	public List<String> getCloseOrderAlgo() {
		return closeOrderAlgo;
	}

	public void setCloseOrderAlgo(List<String> closeOrderAlgo) {
		this.closeOrderAlgo = closeOrderAlgo;
	}

	public String getAlgoId() {
		return algoId;
	}

	public void setAlgoId(String algoId) {
		this.algoId = algoId;
	}

	public String getSlTriggerPx() {
		return slTriggerPx;
	}

	public void setSlTriggerPx(String slTriggerPx) {
		this.slTriggerPx = slTriggerPx;
	}

	public String getSlTriggerPxType() {
		return slTriggerPxType;
	}

	public void setSlTriggerPxType(String slTriggerPxType) {
		this.slTriggerPxType = slTriggerPxType;
	}

	public String getTpTriggerPx() {
		return tpTriggerPx;
	}

	public void setTpTriggerPx(String tpTriggerPx) {
		this.tpTriggerPx = tpTriggerPx;
	}

	public String getTpTriggerPxType() {
		return tpTriggerPxType;
	}

	public void setTpTriggerPxType(String tpTriggerPxType) {
		this.tpTriggerPxType = tpTriggerPxType;
	}

	public String getCloseFraction() {
		return closeFraction;
	}

	public void setCloseFraction(String closeFraction) {
		this.closeFraction = closeFraction;
	}

	public String getcTime() {
		return cTime;
	}

	public void setcTime(String cTime) {
		this.cTime = cTime;
	}

	public String getuTime() {
		return uTime;
	}

	public void setuTime(String uTime) {
		this.uTime = uTime;
	}

	public String getBizRefId() {
		return bizRefId;
	}

	public void setBizRefId(String bizRefId) {
		this.bizRefId = bizRefId;
	}

	public String getBizRefType() {
		return bizRefType;
	}

	public void setBizRefType(String bizRefType) {
		this.bizRefType = bizRefType;
	}

	@Override
	public String toString() {
		return "CryptoCoinOkxPositionDTO [instType=" + instType + ", mgnMode=" + mgnMode + ", posId=" + posId
				+ ", posSide=" + posSide + ", pos=" + pos + ", baseBal=" + baseBal + ", quoteBal=" + quoteBal
				+ ", baseBorrowed=" + baseBorrowed + ", baseInterest=" + baseInterest + ", quoteBorrowed="
				+ quoteBorrowed + ", quoteInterest=" + quoteInterest + ", posCcy=" + posCcy + ", availPos=" + availPos
				+ ", avgPx=" + avgPx + ", upl=" + upl + ", uplRatio=" + uplRatio + ", uplLastPx=" + uplLastPx
				+ ", uplRatioLastPx=" + uplRatioLastPx + ", instId=" + instId + ", lever=" + lever + ", liqPx=" + liqPx
				+ ", markPx=" + markPx + ", imr=" + imr + ", margin=" + margin + ", mgnRatio=" + mgnRatio + ", mmr="
				+ mmr + ", liab=" + liab + ", liabCcy=" + liabCcy + ", interest=" + interest + ", tradeId=" + tradeId
				+ ", optVal=" + optVal + ", pendingCloseOrdLiabVal=" + pendingCloseOrdLiabVal + ", notionalUsd="
				+ notionalUsd + ", adl=" + adl + ", ccy=" + ccy + ", last=" + last + ", idxPx=" + idxPx + ", usdPx="
				+ usdPx + ", bePx=" + bePx + ", deltaBS=" + deltaBS + ", deltaPA=" + deltaPA + ", gammaBS=" + gammaBS
				+ ", gammaPA=" + gammaPA + ", thetaBS=" + thetaBS + ", thetaPA=" + thetaPA + ", vegaBS=" + vegaBS
				+ ", vegaPA=" + vegaPA + ", spotInUseAmt=" + spotInUseAmt + ", spotInUseCcy=" + spotInUseCcy
				+ ", clSpotInUseAmt=" + clSpotInUseAmt + ", maxSpotInUseAmt=" + maxSpotInUseAmt + ", realizedPnl="
				+ realizedPnl + ", pnl=" + pnl + ", fee=" + fee + ", fundingFee=" + fundingFee + ", liqPenalty="
				+ liqPenalty + ", closeOrderAlgo=" + closeOrderAlgo + ", algoId=" + algoId + ", slTriggerPx="
				+ slTriggerPx + ", slTriggerPxType=" + slTriggerPxType + ", tpTriggerPx=" + tpTriggerPx
				+ ", tpTriggerPxType=" + tpTriggerPxType + ", closeFraction=" + closeFraction + ", cTime=" + cTime
				+ ", uTime=" + uTime + ", bizRefId=" + bizRefId + ", bizRefType=" + bizRefType + "]";
	}

}
