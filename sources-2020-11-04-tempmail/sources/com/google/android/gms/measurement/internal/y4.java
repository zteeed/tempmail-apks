package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
final class y4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f10518b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f10519c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f10520d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ long f10521e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ zzhc f10522f;

    y4(zzhc zzhc, String str, String str2, Object obj, long j) {
        this.f10522f = zzhc;
        this.f10518b = str;
        this.f10519c = str2;
        this.f10520d = obj;
        this.f10521e = j;
    }

    public final void run() {
        this.f10522f.T(this.f10518b, this.f10519c, this.f10520d, this.f10521e);
    }
}
