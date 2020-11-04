package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbw;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final /* synthetic */ class hy implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    private final zzbw.zza.C0070zza f4182a;

    /* renamed from: b  reason: collision with root package name */
    private final int f4183b;

    hy(zzbw.zza.C0070zza zza, int i) {
        this.f4182a = zza;
        this.f4183b = i;
    }

    public final Object then(Task task) {
        return zzdpm.e(this.f4182a, this.f4183b, task);
    }
}
