package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class j4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final zzavy f4097b;

    /* renamed from: c  reason: collision with root package name */
    private final u4 f4098c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4099d;

    j4(zzavy zzavy, u4 u4Var, String str) {
        this.f4097b = zzavy;
        this.f4098c = u4Var;
        this.f4099d = str;
    }

    public final void run() {
        this.f4097b.h(this.f4098c, this.f4099d);
    }
}
