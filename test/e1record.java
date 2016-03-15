

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Comparator;


public class e1record implements Serializable
{
	private static final long serialVersionUID = 1L;
	private int id;
	private String taskid;
	private Timestamp capturetime;
	private String filename;
	private String seqinsecond;
	private double longitude;
	private double latitude;
	private double altitude;
	private double xposition;
	private double yposition;
	private double zposition;
	private double prmax;
	private double prmin;
	private double primax;
	private double primin;
	private double pwmax;
	private double pwmin;
	private String producer;
	private String radarmodel;
	private String nation;
	private String platformlevel;
	private String platformname;
	private String platformtype;
	private int relationid;//关联e2id，暂时停用
	private int is_key;//是够重点目标  0为否 其他为是
	private int confirm;//是否已确认，-1为未确认识别 ，0为已确认自动识别 ，1为已确认人工识别
	private String area;
	private int is_send;//是否发送文字报
	private String textquote;
	private String datasource;
	private double confidence;//置信度
	private int is_save;//是否保存文字报
	private int platformid;
	private String prtype;
	private int prnumber;
	private String pritype;
	private int prinumber;
	private String pwtype;
	private int pwnumber;
	private double prmean;
    private double primean;
    private double pwmean;
    private String particularpara;
  //地图显示经度
    private double map_longitude;
    //地图显示纬度
    private double map_latitude;
	public double getPrmean() {
		return prmean;
	}
	public void setPrmean(double prmean) {
		this.prmean = prmean;
	}
	public double getPrimean() {
		return primean;
	}
	public void setPrimean(double primean) {
		this.primean = primean;
	}
	public double getPwmean() {
		return pwmean;
	}
	public void setPwmean(double pwmean) {
		this.pwmean = pwmean;
	}
	

	public double getMap_longitude() {
		return map_longitude;
	}
	public void setMap_longitude(double map_longitude) {
		this.map_longitude = map_longitude;
	}
	public double getMap_latitude() {
		return map_latitude;
	}
	public void setMap_latitude(double map_latitude) {
		this.map_latitude = map_latitude;
	}
	public String getPrtype() {
		return prtype;
	}
	public void setPrtype(String prtype) {
		this.prtype = prtype;
	}
	public int getPrnumber() {
		return prnumber;
	}
	public void setPrnumber(int prnumber) {
		this.prnumber = prnumber;
	}
	public String getPritype() {
		return pritype;
	}
	public void setPritype(String pritype) {
		this.pritype = pritype;
	}
	public int getPrinumber() {
		return prinumber;
	}
	public void setPrinumber(int prinumber) {
		this.prinumber = prinumber;
	}
	public String getPwtype() {
		return pwtype;
	}
	public void setPwtype(String pwtype) {
		this.pwtype = pwtype;
	}
	public int getPwnumber() {
		return pwnumber;
	}
	public void setPwnumber(int pwnumber) {
		this.pwnumber = pwnumber;
	}
	public String getParticularpara() {
		return particularpara;
	}
	public void setParticularpara(String particularpara) {
		this.particularpara = particularpara;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTaskid() {
		return taskid;
	}
	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}
	public Timestamp getCapturetime() {
		return capturetime;
	}
	public void setCapturetime(Timestamp capturetime) {
		this.capturetime = capturetime;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getSeqinsecond() {
		return seqinsecond;
	}
	public void setSeqinsecond(String seqinsecond) {
		this.seqinsecond = seqinsecond;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getAltitude() {
		return altitude;
	}
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	public double getXposition() {
		return xposition;
	}
	public void setXposition(double xposition) {
		this.xposition = xposition;
	}
	public double getYposition() {
		return yposition;
	}
	public void setYposition(double yposition) {
		this.yposition = yposition;
	}
	public double getZposition() {
		return zposition;
	}
	public void setZposition(double zposition) {
		this.zposition = zposition;
	}
	public double getPrmax() {
		return prmax;
	}
	public void setPrmax(double prmax) {
		this.prmax = prmax;
	}
	public double getPrmin() {
		return prmin;
	}
	public void setPrmin(double prmin) {
		this.prmin = prmin;
	}
	public double getPrimax() {
		return primax;
	}
	public void setPrimax(double primax) {
		this.primax = primax;
	}
	public double getPrimin() {
		return primin;
	}
	public void setPrimin(double primin) {
		this.primin = primin;
	}
	public double getPwmax() {
		return pwmax;
	}
	public void setPwmax(double pwmax) {
		this.pwmax = pwmax;
	}
	public double getPwmin() {
		return pwmin;
	}
	public void setPwmin(double pwmin) {
		this.pwmin = pwmin;
	}
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getRadarmodel() {
		return radarmodel;
	}
	public void setRadarmodel(String radarmodel) {
		this.radarmodel = radarmodel;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getPlatformlevel() {
		return platformlevel;
	}
	public void setPlatformlevel(String platformlevel) {
		this.platformlevel = platformlevel;
	}
	public String getPlatformname() {
		return platformname;
	}
	public void setPlatformname(String platformname) {
		this.platformname = platformname;
	}
	public String getPlatformtype() {
		return platformtype;
	}
	public void setPlatformtype(String platformtype) {
		this.platformtype = platformtype;
	}
	public int getRelationid() {
		return relationid;
	}
	public void setRelationid(int relationid) {
		this.relationid = relationid;
	}
	public int getIs_key() {
		return is_key;
	}
	public void setIs_key(int is_key) {
		this.is_key = is_key;
	}
	public int getConfirm() {
		return confirm;
	}
	public void setConfirm(int confirm) {
		this.confirm = confirm;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}	
	public int getIs_send() {
		return is_send;
	}
	public void setIs_send(int transmit) {
		this.is_send = transmit;
	}
	public String getTextquote() {
		return textquote;
	}
	public void setTextquote(String textquote) {
		this.textquote = textquote;
	}
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public double getConfidence() {
		return confidence;
	}
	public void setConfidence(double confidence) {
		this.confidence = confidence;
	}
	
	public int getIs_save() {
		return is_save;
	}
	public void setIs_save(int is_save) {
		this.is_save = is_save;
	}
	
	public int getPlatformid() {
		return platformid;
	}
	public void setPlatformid(int platformid) {
		this.platformid = platformid;
	}
	@Override
	public String toString() {
		return "E1record [id=" + id + ", taskid=" + taskid + ", capturetime="
				+ capturetime + ", filename=" + filename + ", seqinsecond="
				+ seqinsecond + ", longitude=" + longitude + ", latitude="
				+ latitude + ", altitude=" + altitude + ", xposition="
				+ xposition + ", yposition=" + yposition + ", zposition="
				+ zposition + ", prmax=" + prmax + ", prmin=" + prmin
				+ ", primax=" + primax + ", primin=" + primin + ", pwmax="
				+ pwmax + ", pwmin=" + pwmin + ", producer=" + producer
				+ ", radarmodel=" + radarmodel + ", nation=" + nation
				+ ", platformlevel=" + platformlevel + ", platformname="
				+ platformname + ", platformtype=" + platformtype
				+ ", relationid=" + relationid + ", is_key=" + is_key
				+ ", confirm=" + confirm + ", area=" + area + ", is_send="
				+ is_send + ", textquote=" + textquote + ", datasource="
				+ datasource + ", confidence=" + confidence + ", is_save="
				+ is_save + ", platformid=" + platformid + "]";
	}
	



	
}
