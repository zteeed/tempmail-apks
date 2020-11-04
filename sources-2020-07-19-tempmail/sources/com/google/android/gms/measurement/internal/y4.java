package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class y4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10332b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10333c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f10334d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f10335e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzhc f10336f;

    y4(zzhc zzhc, String str, String str2, Object obj, long j) {
        this.f10336f = zzhc;
        this.f10332b = str;
        this.f10333c = str2;
        this.f10334d = obj;
        this.f10335e = j;
    }

    public final void run() {
        this.f10336f.T(this.f10332b, this.f10333c, this.f10334d, this.f10335e);
    }
}
