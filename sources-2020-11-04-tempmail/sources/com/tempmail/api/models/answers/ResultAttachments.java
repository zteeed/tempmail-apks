package com.tempmail.api.models.answers;

public class ResultAttachments {
    Attachment attachment;
    String sid;

    public class Attachment {
        String cid;
        String contentType;
        String data;
        String filename;
        String size;

        public Attachment() {
        }

        public String getCid() {
            return this.cid;
        }

        public String getContentType() {
            return this.contentType;
        }

        public String getData() {
            return this.data;
        }

        public String getFilename() {
            return this.filename;
        }

        public String getSize() {
            return this.size;
        }
    }

    public Attachment getAttachment() {
        return this.attachment;
    }

    public String getSid() {
        return this.sid;
    }
}
