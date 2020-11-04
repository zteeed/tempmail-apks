package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final /* synthetic */ class n4 implements u4 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f4629a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4630b;

    n4(Context context, String str) {
        this.f4629a = context;
        this.f4630b = str;
    }

    public final void a(zzbhy zzbhy) {
        Context context = this.f4629a;
        zzbhy.F4(ObjectWrapper.h0(context), this.f4630b, context.getPackageName());
    }
}
