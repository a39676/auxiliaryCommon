package finance.cryptoCoin.okx.pojo.dto;

import java.util.List;

public class CryptoCoinOkxAccountBalanceDataDTO {

	private String adjEq; // 美金层面有效保证金, 适用于跨币种保证金模式/组合保证金模式
	private String borrowFroz; // 账户美金层面潜在借币占用保证金, 仅适用于跨币种保证金模式/组合保证金模式。在其他账户模式下为""。
	private String imr; // 币种维度全仓占用保证金, 适用于现货和合约模式且有全仓仓位时
	private String isoEq; // 美金层面逐仓仓位权益, 适用于现货和合约模式/跨币种保证金模式/组合保证金模式
	private String mgnRatio; // 美金层面保证金率, 适用于跨币种保证金模式/组合保证金模式
	private String mmr; // 币种维度全仓维持保证金, 适用于现货和合约模式且有全仓仓位时
	private String notionalUsd; // 以美金价值为单位的持仓数量，即仓位美金价值, 适用于跨币种保证金模式/组合保证金模式
	private String ordFroz; // 挂单冻结数量, 适用于现货模式/现货和合约模式/跨币种保证金模式
	private String totalEq; // 美金层面权益
	private String uTime; // 账户信息的更新时间，Unix时间戳的毫秒数格式，如 1597026383085
	private String upl; // 账户层面全仓未实现盈亏（美元单位）, 适用于跨币种保证金模式/组合保证金模式
	private List<CryptoCoinOkxAccountBalanceDetailDTO> details; // 各币种资产详细信息

	public String getAdjEq() {
		return adjEq;
	}

	public void setAdjEq(String adjEq) {
		this.adjEq = adjEq;
	}

	public String getBorrowFroz() {
		return borrowFroz;
	}

	public void setBorrowFroz(String borrowFroz) {
		this.borrowFroz = borrowFroz;
	}

	public String getImr() {
		return imr;
	}

	public void setImr(String imr) {
		this.imr = imr;
	}

	public String getIsoEq() {
		return isoEq;
	}

	public void setIsoEq(String isoEq) {
		this.isoEq = isoEq;
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

	public String getNotionalUsd() {
		return notionalUsd;
	}

	public void setNotionalUsd(String notionalUsd) {
		this.notionalUsd = notionalUsd;
	}

	public String getOrdFroz() {
		return ordFroz;
	}

	public void setOrdFroz(String ordFroz) {
		this.ordFroz = ordFroz;
	}

	public String getTotalEq() {
		return totalEq;
	}

	public void setTotalEq(String totalEq) {
		this.totalEq = totalEq;
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

	public List<CryptoCoinOkxAccountBalanceDetailDTO> getDetails() {
		return details;
	}

	public void setDetails(List<CryptoCoinOkxAccountBalanceDetailDTO> details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "CryptoCoinOkxAccountBalanceDataDTO [adjEq=" + adjEq + ", borrowFroz=" + borrowFroz + ", imr=" + imr
				+ ", isoEq=" + isoEq + ", mgnRatio=" + mgnRatio + ", mmr=" + mmr + ", notionalUsd=" + notionalUsd
				+ ", ordFroz=" + ordFroz + ", totalEq=" + totalEq + ", uTime=" + uTime + ", upl=" + upl + ", details="
				+ details + "]";
	}

}
