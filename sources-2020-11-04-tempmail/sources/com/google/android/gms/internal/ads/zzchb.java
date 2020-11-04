package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzchb implements Callable<zzcgr> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final zza f7225b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final zzbfv f7226c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Context f7227d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Executor f7228e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final zzeg f7229f;
    /* access modifiers changed from: private */
    public final zzbbd g;

    public zzchb(Context context, Executor executor, zzeg zzeg, zzbbd zzbbd, zza zza, zzbfv zzbfv) {
        this.f7227d = context;
        this.f7228e = executor;
        this.f7229f = zzeg;
        this.g = zzbbd;
        this.f7225b = zza;
        this.f7226c = zzbfv;
    }

    public final /* synthetic */ Object call() throws Exception {
        zzcgr zzcgr = new zzcgr(this);
        zzcgr.g();
        return zzcgr;
    }
}
