package com.huawei.device.connectivitychrlog;

import com.huawei.connectivitylog.ConnectivityLogManager;
import java.util.ArrayList;
import java.util.List;

public class CSegEVENT_WIFI_CONNECT_AUTH_FAILED extends ChrLogBaseEventModel {
    private List<CSubRSSIGROUP_EVENT> cRSSIGROUP_EVENTList = new ArrayList(4);
    public ENCEventId enEventId = new ENCEventId();
    public ENCWifiConnectAuthFailedReason enWifiConnectAuthFailedReason = new ENCWifiConnectAuthFailedReason();
    public ENCucHwStatus enucHwStatus = new ENCucHwStatus();
    public LogInt iAP_RSSI = new LogInt();
    public LogString strAP_MAC = new LogString(17);
    public LogString strAP_SSID = new LogString(32);
    public LogString strAP_auth_alg = new LogString(20);
    public LogString strAP_eap = new LogString(25);
    public LogString strAP_group = new LogString(25);
    public LogString strAP_key_mgmt = new LogString(32);
    public LogString strAP_pairwise = new LogString(20);
    public LogString strAP_proto = new LogString(10);
    public LogString strSTA_MAC = new LogString(17);
    public LogString strapVendorInfo = new LogString(ConnectivityLogManager.WIFI_PORTAL_SAMPLES_COLLECTE);
    public LogDate tmTimeStamp = new LogDate(6);
    public LogByte ucBTConnState = new LogByte();
    public LogByte ucBTState = new LogByte();
    public LogByte ucCardIndex = new LogByte();
    public LogByte ucIsMobleAP = new LogByte();
    public LogByte ucIsOnScreen = new LogByte();
    public LogByte ucPublicEss = new LogByte();
    public LogByte ucScanAlwaysAvailble = new LogByte();
    public LogByte ucWIFIAlwaysNotifation = new LogByte();
    public LogByte ucWIFISleepPolicy = new LogByte();
    public LogByte ucWifiProStatus = new LogByte();
    public LogByte ucWifiToPDP = new LogByte();
    public LogShort usAP_channel = new LogShort();
    public LogShort usLen = new LogShort();
    public LogShort usSubErrorCode = new LogShort();

    public void setCSubRSSIGROUP_EVENTList(CSubRSSIGROUP_EVENT pRSSIGROUP_EVENT) {
        if (pRSSIGROUP_EVENT != null) {
            this.cRSSIGROUP_EVENTList.add(pRSSIGROUP_EVENT);
            this.lengthMap.put("cRSSIGROUP_EVENTList", Integer.valueOf((((ChrLogBaseModel) this.cRSSIGROUP_EVENTList.get(0)).getTotalBytes() * this.cRSSIGROUP_EVENTList.size()) + 2));
            this.fieldMap.put("cRSSIGROUP_EVENTList", this.cRSSIGROUP_EVENTList);
            this.usLen.setValue(getTotalLen());
        }
    }

    public CSegEVENT_WIFI_CONNECT_AUTH_FAILED() {
        this.lengthMap.put("enEventId", Integer.valueOf(1));
        this.fieldMap.put("enEventId", this.enEventId);
        this.lengthMap.put("usLen", Integer.valueOf(2));
        this.fieldMap.put("usLen", this.usLen);
        this.lengthMap.put("tmTimeStamp", Integer.valueOf(6));
        this.fieldMap.put("tmTimeStamp", this.tmTimeStamp);
        this.lengthMap.put("ucCardIndex", Integer.valueOf(1));
        this.fieldMap.put("ucCardIndex", this.ucCardIndex);
        this.lengthMap.put("enWifiConnectAuthFailedReason", Integer.valueOf(1));
        this.fieldMap.put("enWifiConnectAuthFailedReason", this.enWifiConnectAuthFailedReason);
        this.lengthMap.put("usSubErrorCode", Integer.valueOf(2));
        this.fieldMap.put("usSubErrorCode", this.usSubErrorCode);
        this.lengthMap.put("strSTA_MAC", Integer.valueOf(17));
        this.fieldMap.put("strSTA_MAC", this.strSTA_MAC);
        this.lengthMap.put("strAP_MAC", Integer.valueOf(17));
        this.fieldMap.put("strAP_MAC", this.strAP_MAC);
        this.lengthMap.put("strAP_SSID", Integer.valueOf(32));
        this.fieldMap.put("strAP_SSID", this.strAP_SSID);
        this.lengthMap.put("strAP_proto", Integer.valueOf(10));
        this.fieldMap.put("strAP_proto", this.strAP_proto);
        this.lengthMap.put("strAP_key_mgmt", Integer.valueOf(32));
        this.fieldMap.put("strAP_key_mgmt", this.strAP_key_mgmt);
        this.lengthMap.put("strAP_auth_alg", Integer.valueOf(20));
        this.fieldMap.put("strAP_auth_alg", this.strAP_auth_alg);
        this.lengthMap.put("strAP_pairwise", Integer.valueOf(20));
        this.fieldMap.put("strAP_pairwise", this.strAP_pairwise);
        this.lengthMap.put("strAP_group", Integer.valueOf(25));
        this.fieldMap.put("strAP_group", this.strAP_group);
        this.lengthMap.put("strAP_eap", Integer.valueOf(25));
        this.fieldMap.put("strAP_eap", this.strAP_eap);
        this.lengthMap.put("usAP_channel", Integer.valueOf(2));
        this.fieldMap.put("usAP_channel", this.usAP_channel);
        this.lengthMap.put("iAP_RSSI", Integer.valueOf(4));
        this.fieldMap.put("iAP_RSSI", this.iAP_RSSI);
        this.lengthMap.put("enucHwStatus", Integer.valueOf(1));
        this.fieldMap.put("enucHwStatus", this.enucHwStatus);
        this.lengthMap.put("ucBTState", Integer.valueOf(1));
        this.fieldMap.put("ucBTState", this.ucBTState);
        this.lengthMap.put("ucBTConnState", Integer.valueOf(1));
        this.fieldMap.put("ucBTConnState", this.ucBTConnState);
        this.lengthMap.put("ucPublicEss", Integer.valueOf(1));
        this.fieldMap.put("ucPublicEss", this.ucPublicEss);
        this.lengthMap.put("cRSSIGROUP_EVENTList", Integer.valueOf(2));
        this.fieldMap.put("cRSSIGROUP_EVENTList", this.cRSSIGROUP_EVENTList);
        this.lengthMap.put("strapVendorInfo", Integer.valueOf(ConnectivityLogManager.WIFI_PORTAL_SAMPLES_COLLECTE));
        this.fieldMap.put("strapVendorInfo", this.strapVendorInfo);
        this.lengthMap.put("ucScanAlwaysAvailble", Integer.valueOf(1));
        this.fieldMap.put("ucScanAlwaysAvailble", this.ucScanAlwaysAvailble);
        this.lengthMap.put("ucWIFIAlwaysNotifation", Integer.valueOf(1));
        this.fieldMap.put("ucWIFIAlwaysNotifation", this.ucWIFIAlwaysNotifation);
        this.lengthMap.put("ucWIFISleepPolicy", Integer.valueOf(1));
        this.fieldMap.put("ucWIFISleepPolicy", this.ucWIFISleepPolicy);
        this.lengthMap.put("ucWifiProStatus", Integer.valueOf(1));
        this.fieldMap.put("ucWifiProStatus", this.ucWifiProStatus);
        this.lengthMap.put("ucWifiToPDP", Integer.valueOf(1));
        this.fieldMap.put("ucWifiToPDP", this.ucWifiToPDP);
        this.lengthMap.put("ucIsMobleAP", Integer.valueOf(1));
        this.fieldMap.put("ucIsMobleAP", this.ucIsMobleAP);
        this.lengthMap.put("ucIsOnScreen", Integer.valueOf(1));
        this.fieldMap.put("ucIsOnScreen", this.ucIsOnScreen);
        this.enEventId.setValue("WIFI_CONNECT_AUTH_FAILED");
        this.usLen.setValue(getTotalLen());
    }
}
