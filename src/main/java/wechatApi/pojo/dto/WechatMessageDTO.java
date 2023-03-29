package wechatApi.pojo.dto;

import wechatApi.pojo.type.WechatEventType;

public class WechatMessageDTO {

	private String ToUserName;
	private String FromUserName;
	private Long CreateTime;
	private String MsgType;
	private String Content;
	private String MsgId;
	private String MsgDataId;
	private String Idx;

	/** {@link WechatEventType} */
	private String Event;
	private String EventKey;
	private String Description;
	private String Label;
	private String Url;
	private String Format;
	private String PicUrl;
	private String Ticket;
	private String Title;
	private String Scale;
	private String ThumbMediaId;
	private String Location_X;
	private String Location_Y;
	/** 纬度 */
	private String Latitude;
	/** 经度 */
	private String Longitude;
	private String MediaId;
	private String Precision;
	private String Recognition;

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public Long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(Long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}

	public String getMsgDataId() {
		return MsgDataId;
	}

	public void setMsgDataId(String msgDataId) {
		MsgDataId = msgDataId;
	}

	public String getIdx() {
		return Idx;
	}

	public void setIdx(String idx) {
		Idx = idx;
	}

	public String getEvent() {
		return Event;
	}

	public void setEvent(String event) {
		Event = event;
	}

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		Latitude = latitude;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getLocation_X() {
		return Location_X;
	}

	public void setLocation_X(String location_X) {
		Location_X = location_X;
	}

	public String getLocation_Y() {
		return Location_Y;
	}

	public void setLocation_Y(String location_Y) {
		Location_Y = location_Y;
	}

	public String getPicUrl() {
		return PicUrl;
	}

	public void setPicUrl(String picUrl) {
		PicUrl = picUrl;
	}

	public String getTicket() {
		return Ticket;
	}

	public void setTicket(String ticket) {
		Ticket = ticket;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getScale() {
		return Scale;
	}

	public void setScale(String scale) {
		Scale = scale;
	}

	public String getThumbMediaId() {
		return ThumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		ThumbMediaId = thumbMediaId;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		Longitude = longitude;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getPrecision() {
		return Precision;
	}

	public void setPrecision(String precision) {
		Precision = precision;
	}

	public String getRecognition() {
		return Recognition;
	}

	public void setRecognition(String recognition) {
		Recognition = recognition;
	}

	@Override
	public String toString() {
		return "WechatMessageDTO [ToUserName=" + ToUserName + ", FromUserName=" + FromUserName + ", CreateTime="
				+ CreateTime + ", MsgType=" + MsgType + ", Content=" + Content + ", MsgId=" + MsgId + ", MsgDataId="
				+ MsgDataId + ", Idx=" + Idx + ", Event=" + Event + ", EventKey=" + EventKey + ", Description="
				+ Description + ", Label=" + Label + ", Latitude=" + Latitude + ", Url=" + Url + ", Format=" + Format
				+ ", Location_X=" + Location_X + ", Location_Y=" + Location_Y + ", PicUrl=" + PicUrl + ", Ticket="
				+ Ticket + ", Title=" + Title + ", Scale=" + Scale + ", ThumbMediaId=" + ThumbMediaId + ", Longitude="
				+ Longitude + ", MediaId=" + MediaId + ", Precision=" + Precision + ", Recognition=" + Recognition
				+ "]";
	}

}
