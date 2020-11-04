package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public class zzegl extends IOException {
    public zzegl(String str) {
        super(str);
    }

    static zzegl a() {
        return new zzegl("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzegl b() {
        return new zzegl("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzegl c() {
        return new zzegl("CodedInputStream encountered a malformed varint.");
    }

    static zzegl d() {
        return new zzegl("Protocol message contained an invalid tag (zero).");
    }

    static zzegl e() {
        return new zzegl("Protocol message end-group tag did not match expected tag.");
    }

    static zzego f() {
        return new zzego("Protocol message tag had invalid wire type.");
    }

    static zzegl g() {
        return new zzegl("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static zzegl h() {
        return new zzegl("Failed to parse the message.");
    }

    static zzegl i() {
        return new zzegl("Protocol message had invalid UTF-8.");
    }

    public final zzegl j(zzehl zzehl) {
        return this;
    }
}
