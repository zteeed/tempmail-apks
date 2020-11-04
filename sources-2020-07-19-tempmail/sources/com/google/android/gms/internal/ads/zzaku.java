package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzaku extends zzbbu<zzalf> {

    /* renamed from: c  reason: collision with root package name */
    private final Object f5758c = new Object();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final zzaky f5759d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5760e;

    public zzaku(zzaky zzaky) {
        this.f5759d = zzaky;
    }

    public final void f() {
        synchronized (this.f5758c) {
            if (!this.f5760e) {
                this.f5760e = true;
                d(new w1(this), new zzbbs());
                d(new v1(this), new x1(this));
            }
        }
    }
}
