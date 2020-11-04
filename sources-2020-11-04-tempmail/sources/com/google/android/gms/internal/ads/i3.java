package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i3 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzapu f4196b;

    i3(zzapu zzapu) {
        this.f4196b = zzapu;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4196b.e("User canceled the download.");
    }
}
