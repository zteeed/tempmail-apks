package com.google.ads;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class AdSize {

    /* renamed from: b  reason: collision with root package name */
    public static final AdSize f2611b = new AdSize(-1, -2, "mb");

    /* renamed from: c  reason: collision with root package name */
    public static final AdSize f2612c = new AdSize(320, 50, "mb");

    /* renamed from: d  reason: collision with root package name */
    public static final AdSize f2613d = new AdSize(300, 250, "as");

    /* renamed from: e  reason: collision with root package name */
    public static final AdSize f2614e = new AdSize(468, 60, "as");

    /* renamed from: f  reason: collision with root package name */
    public static final AdSize f2615f = new AdSize(728, 90, "as");
    public static final AdSize g = new AdSize(160, 600, "as");

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.gms.ads.AdSize f2616a;

    public AdSize(com.google.android.gms.ads.AdSize adSize) {
        this.f2616a = adSize;
    }

    public final int a() {
        return this.f2616a.getHeight();
    }

    public final int b() {
        return this.f2616a.getWidth();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AdSize)) {
            return false;
        }
        return this.f2616a.equals(((AdSize) obj).f2616a);
    }

    public final int hashCode() {
        return this.f2616a.hashCode();
    }

    public final String toString() {
        return this.f2616a.toString();
    }

    private AdSize(int i, int i2, String str) {
        this(new com.google.android.gms.ads.AdSize(i, i2));
    }
}
