package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class j implements zzacz {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzaar f4089a;

    j(zzaar zzaar) {
        this.f4089a = zzaar;
    }

    public final Long a(String str, long j) {
        try {
            return Long.valueOf(this.f4089a.f5528e.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f4089a.f5528e.getInt(str, (int) j));
        }
    }

    public final Boolean b(String str, boolean z) {
        return Boolean.valueOf(this.f4089a.f5528e.getBoolean(str, z));
    }

    public final String c(String str, String str2) {
        return this.f4089a.f5528e.getString(str, str2);
    }

    public final Double d(String str, double d2) {
        return Double.valueOf((double) this.f4089a.f5528e.getFloat(str, (float) d2));
    }
}
