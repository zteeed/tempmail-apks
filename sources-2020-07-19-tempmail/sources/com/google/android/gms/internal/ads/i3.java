package com.google.android.gms.internal.ads;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class i3 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ zzapu f4013b;

    i3(zzapu zzapu) {
        this.f4013b = zzapu;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f4013b.e("User canceled the download.");
    }
}
