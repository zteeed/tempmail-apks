package com.tempmail.db;

import android.webkit.MimeTypeMap;
import com.tempmail.utils.m;
import java.io.Serializable;

public class AttachmentInfoTable implements Serializable {
    private Integer attachmentId;
    private String cid;
    private String eid;
    private String filename;
    private Long id;
    private String mimeType;
    private Long size;

    public AttachmentInfoTable(String str, String str2, Integer num, Long l, String str3, String str4) {
        this.eid = str;
        this.filename = str2;
        this.attachmentId = num;
        this.size = l;
        this.mimeType = str3;
        this.cid = str4;
    }

    public Integer getAttachmentId() {
        return this.attachmentId;
    }

    public String getCid() {
        return this.cid;
    }

    public String getEid() {
        return this.eid;
    }

    public String getFilename() {
        return this.filename;
    }

    public Long getId() {
        return this.id;
    }

    public String getMailAttachmentId() {
        return getEid() + " " + getAttachmentId();
    }

    public String getMimeType() {
        return this.mimeType;
    }

    public Long getSize() {
        return this.size;
    }

    public String getUpdatedFileName() {
        String simpleName = AttachmentInfoTable.class.getSimpleName();
        m.b(simpleName, "attachmentInfoTable mime type " + getMimeType());
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(getMimeType());
        String filename2 = getFilename();
        m.b(simpleName, "fileName " + filename2);
        m.b(simpleName, "extension " + extensionFromMimeType);
        if (extensionFromMimeType == null || filename2.contains(extensionFromMimeType)) {
            return filename2;
        }
        String str = filename2 + "." + extensionFromMimeType;
        m.b(simpleName, "fileName updated" + str);
        return str;
    }

    public void setAttachmentId(Integer num) {
        this.attachmentId = num;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setEid(String str) {
        this.eid = str;
    }

    public void setFilename(String str) {
        this.filename = str;
    }

    public void setId(Long l) {
        this.id = l;
    }

    public void setMimeType(String str) {
        this.mimeType = str;
    }

    public void setSize(Long l) {
        this.size = l;
    }

    public AttachmentInfoTable() {
    }

    public AttachmentInfoTable(Long l) {
        this.id = l;
    }

    public AttachmentInfoTable(Long l, String str, String str2, Integer num, Long l2, String str3, String str4) {
        this.id = l;
        this.eid = str;
        this.filename = str2;
        this.attachmentId = num;
        this.size = l2;
        this.mimeType = str3;
        this.cid = str4;
    }
}
