package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class x5 implements DialogInterface.OnClickListener {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ w5 f5282b;

    x5(w5 w5Var) {
        this.f5282b = w5Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzq.zzkw();
        zzaye.j(this.f5282b.f5183b, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
