package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class pa implements zzaz {

    /* renamed from: a  reason: collision with root package name */
    private File f4623a = null;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ Context f4624b;

    pa(Context context) {
        this.f4624b = context;
    }

    public final File k() {
        if (this.f4623a == null) {
            this.f4623a = new File(this.f4624b.getCacheDir(), "volley");
        }
        return this.f4623a;
    }
}
