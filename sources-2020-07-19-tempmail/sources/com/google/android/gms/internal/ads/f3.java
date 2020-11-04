package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class f3 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzapo f3757b;

    f3(zzapo zzapo) {
        this.f3757b = zzapo;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f3757b.e("Operation denied by user.");
    }
}
