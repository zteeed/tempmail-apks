package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class ky extends zzdpq {

    /* renamed from: a  reason: collision with root package name */
    private String f4246a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f4247b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f4248c;

    ky() {
    }

    public final zzdpn a() {
        String str = "";
        if (this.f4246a == null) {
            str = str.concat(" clientVersion");
        }
        if (this.f4247b == null) {
            str = String.valueOf(str).concat(" shouldGetAdvertisingId");
        }
        if (this.f4248c == null) {
            str = String.valueOf(str).concat(" isGooglePlayServicesAvailable");
        }
        if (str.isEmpty()) {
            return new jy(this.f4246a, this.f4247b.booleanValue(), this.f4248c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public final zzdpq b(boolean z) {
        this.f4247b = Boolean.valueOf(z);
        return this;
    }

    public final zzdpq c(boolean z) {
        this.f4248c = Boolean.TRUE;
        return this;
    }

    public final zzdpq d(String str) {
        if (str != null) {
            this.f4246a = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }
}
