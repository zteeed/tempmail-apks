package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final /* synthetic */ class hy implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final zzbw.zza.C0071zza f3999a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4000b;

    hy(zzbw.zza.C0071zza zza, int i) {
        this.f3999a = zza;
        this.f4000b = i;
    }

    public final Object then(Task task) {
        return zzdpm.e(this.f3999a, this.f4000b, task);
    }
}
