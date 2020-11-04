package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class re0 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ se0 f4823b;

    re0(se0 se0) {
        this.f4823b = se0;
    }

    public final void run() {
        synchronized (this.f4823b.f4906d) {
            if (!this.f4823b.f4907e || !this.f4823b.f4908f) {
                zzbba.f("App is still foreground");
            } else {
                boolean unused = this.f4823b.f4907e = false;
                zzbba.f("App went background");
                for (zzrj a2 : this.f4823b.g) {
                    try {
                        a2.a(false);
                    } catch (Exception e2) {
                        zzbba.c("", e2);
                    }
                }
            }
        }
    }
}
