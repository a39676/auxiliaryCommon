package finance.cryptoCoin.binance.spot.pojo.dto;

import java.util.List;

import net.sf.json.JSONObject;

public class CryptoCoinBinanceSpotAccountInfoDTO {

	private Integer makerCommission;
	private Integer takerCommission;
	private Integer buyerCommission;
	private Integer sellerCommission;
	private JSONObject commissionRates;
	private Boolean canTrade;
	private Boolean canWithdraw;
	private Boolean canDeposit;
	private Boolean brokered;
	private Boolean requireSelfTradePrevention;
	private Boolean preventSor;
	private Long updateTime;
	private String accountType;
	private CryptoCoinBinanceSpotBalancesDetailDTO balances;
	private List<String> permissions;
	private Long uid;

	public Integer getMakerCommission() {
		return makerCommission;
	}

	public void setMakerCommission(Integer makerCommission) {
		this.makerCommission = makerCommission;
	}

	public Integer getTakerCommission() {
		return takerCommission;
	}

	public void setTakerCommission(Integer takerCommission) {
		this.takerCommission = takerCommission;
	}

	public Integer getBuyerCommission() {
		return buyerCommission;
	}

	public void setBuyerCommission(Integer buyerCommission) {
		this.buyerCommission = buyerCommission;
	}

	public Integer getSellerCommission() {
		return sellerCommission;
	}

	public void setSellerCommission(Integer sellerCommission) {
		this.sellerCommission = sellerCommission;
	}

	public JSONObject getCommissionRates() {
		return commissionRates;
	}

	public void setCommissionRates(JSONObject commissionRates) {
		this.commissionRates = commissionRates;
	}

	public Boolean getCanTrade() {
		return canTrade;
	}

	public void setCanTrade(Boolean canTrade) {
		this.canTrade = canTrade;
	}

	public Boolean getCanWithdraw() {
		return canWithdraw;
	}

	public void setCanWithdraw(Boolean canWithdraw) {
		this.canWithdraw = canWithdraw;
	}

	public Boolean getCanDeposit() {
		return canDeposit;
	}

	public void setCanDeposit(Boolean canDeposit) {
		this.canDeposit = canDeposit;
	}

	public Boolean getBrokered() {
		return brokered;
	}

	public void setBrokered(Boolean brokered) {
		this.brokered = brokered;
	}

	public Boolean getRequireSelfTradePrevention() {
		return requireSelfTradePrevention;
	}

	public void setRequireSelfTradePrevention(Boolean requireSelfTradePrevention) {
		this.requireSelfTradePrevention = requireSelfTradePrevention;
	}

	public Boolean getPreventSor() {
		return preventSor;
	}

	public void setPreventSor(Boolean preventSor) {
		this.preventSor = preventSor;
	}

	public Long getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Long updateTime) {
		this.updateTime = updateTime;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public CryptoCoinBinanceSpotBalancesDetailDTO getBalances() {
		return balances;
	}

	public void setBalances(CryptoCoinBinanceSpotBalancesDetailDTO balances) {
		this.balances = balances;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "CryptoCoinBinanceSpotAccountInfoDTO [makerCommission=" + makerCommission + ", takerCommission="
				+ takerCommission + ", buyerCommission=" + buyerCommission + ", sellerCommission=" + sellerCommission
				+ ", commissionRates=" + commissionRates + ", canTrade=" + canTrade + ", canWithdraw=" + canWithdraw
				+ ", canDeposit=" + canDeposit + ", brokered=" + brokered + ", requireSelfTradePrevention="
				+ requireSelfTradePrevention + ", preventSor=" + preventSor + ", updateTime=" + updateTime
				+ ", accountType=" + accountType + ", balances=" + balances + ", permissions=" + permissions + ", uid="
				+ uid + "]";
	}

}
