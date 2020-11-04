package com.tempmail.api.models.answers;

import com.google.gson.annotations.SerializedName;

public class ResultMailSource {
    private Message message;
    private String sid;

    private class CreatedAt {
        @SerializedName("$date")
        private Date date;

        private class Date {
            @SerializedName("$numberLong")
            private String numberLong;

            private Date() {
            }

            public String getNumberLong() {
                return this.numberLong;
            }
        }

        private CreatedAt() {
        }

        public Date get$date() {
            return this.date;
        }
    }

    public class Message {
        @SerializedName("mail_address")
        private String mailAddress;
        @SerializedName("mail_address_id")
        private String mailAddressId;
        @SerializedName("mail_id")
        private String mailId;
        @SerializedName("mail_source")
        private String mailSource;
        @SerializedName("mail_timestamp")
        private String mailTimestamp;

        public Message() {
        }

        public String getMailAddress() {
            return this.mailAddress;
        }

        public String getMailAddressId() {
            return this.mailAddressId;
        }

        public String getMailId() {
            return this.mailId;
        }

        public String getMailSource() {
            return this.mailSource;
        }

        public String getMailTimestamp() {
            return this.mailTimestamp;
        }
    }

    public Message getMessage() {
        return this.message;
    }

    public String getSid() {
        return this.sid;
    }
}
