package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class g3 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzapo f4029b;

    g3(zzapo zzapo) {
        this.f4029b = zzapo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent h = this.f4029b.h();
        zzq.zzkw();
        zzaye.i(this.f4029b.f6020d, h);
    }
}
