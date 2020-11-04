package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public class zzfw extends IOException {
    public zzfw(String str) {
        super(str);
    }

    static zzfw a() {
        return new zzfw("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzfw b() {
        return new zzfw("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzfw c() {
        return new zzfw("CodedInputStream encountered a malformed varint.");
    }

    static zzfw d() {
        return new zzfw("Protocol message contained an invalid tag (zero).");
    }

    static zzfw e() {
        return new zzfw("Protocol message end-group tag did not match expected tag.");
    }

    static zzfz f() {
        return new zzfz("Protocol message tag had invalid wire type.");
    }

    static zzfw g() {
        return new zzfw("Failed to parse the message.");
    }

    static zzfw h() {
        return new zzfw("Protocol message had invalid UTF-8.");
    }
}
