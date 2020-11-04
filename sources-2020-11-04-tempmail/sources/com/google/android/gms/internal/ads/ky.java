package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class ky extends zzdpq {

    /* renamed from: a  reason: collision with root package name */
    private String f4429a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f4430b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f4431c;

    ky() {
    }

    public final zzdpn a() {
        String str = "";
        if (this.f4429a == null) {
            str = str.concat(" clientVersion");
        }
        if (this.f4430b == null) {
            str = String.valueOf(str).concat(" shouldGetAdvertisingId");
        }
        if (this.f4431c == null) {
            str = String.valueOf(str).concat(" isGooglePlayServicesAvailable");
        }
        if (str.isEmpty()) {
            return new jy(this.f4429a, this.f4430b.booleanValue(), this.f4431c.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }

    public final zzdpq b(boolean z) {
        this.f4430b = Boolean.valueOf(z);
        return this;
    }

    public final zzdpq c(boolean z) {
        this.f4431c = Boolean.TRUE;
        return this;
    }

    public final zzdpq d(String str) {
        if (str != null) {
            this.f4429a = str;
            return this;
        }
        throw new NullPointerException("Null clientVersion");
    }
}
