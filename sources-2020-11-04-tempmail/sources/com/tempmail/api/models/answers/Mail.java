package com.tempmail.api.models.answers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class Mail implements Serializable {
    @SerializedName("mail_attachments")
    List<AttachmentInfo> attachmentInfo;
    @SerializedName("mail_from")
    @Expose
    String mailFrom;
    @SerializedName("mail_html")
    @Expose
    String mailHtml;
    @SerializedName("mail_id")
    @Expose
    String mailId;
    @SerializedName("mail_subject")
    @Expose
    String mailSubject;
    @SerializedName("mail_text")
    @Expose
    private String mailText;
    @SerializedName("mail_text_only")
    private String mailTextOnly;
    @SerializedName("mail_timestamp")
    @Expose
    double mailTimestamp;

    public class AttachmentInfo {
        String cid;
        String filename;
        @SerializedName("_id")
        int id;
        @SerializedName("mimetype")
        String mimeType;
        long size;

        public AttachmentInfo() {
        }

        public String getCid() {
            return this.cid;
        }

        public String getFilename() {
            return this.filename;
        }

        public int getId() {
            return this.id;
        }

        public String getMimeType() {
            return this.mimeType;
        }

        public long getSize() {
            return this.size;
        }
    }

    public Mail(String str, String str2, String str3, double d2, String str4, String str5, String str6) {
        this.mailId = str;
        this.mailFrom = str2;
        this.mailSubject = str3;
        this.mailTimestamp = d2;
        this.mailHtml = str4;
        this.mailText = str5;
        this.mailTextOnly = str6;
    }

    public List<AttachmentInfo> getAttachmentInfo() {
        return this.attachmentInfo;
    }

    public String getMailFrom() {
        return this.mailFrom;
    }

    public String getMailHtml() {
        return this.mailHtml;
    }

    public String getMailId() {
        return this.mailId;
    }

    public String getMailSubject() {
        return this.mailSubject;
    }

    public String getMailText() {
        return this.mailText;
    }

    public String getMailTextOnly() {
        return this.mailTextOnly;
    }

    public double getMailTimestamp() {
        return this.mailTimestamp;
    }
}
