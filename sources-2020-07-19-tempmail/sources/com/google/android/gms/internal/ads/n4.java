package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class n4 implements u4 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4446a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4447b;

    n4(Context context, String str) {
        this.f4446a = context;
        this.f4447b = str;
    }

    public final void a(zzbhy zzbhy) {
        Context context = this.f4446a;
        zzbhy.l4(ObjectWrapper.b0(context), this.f4447b, context.getPackageName());
    }
}
