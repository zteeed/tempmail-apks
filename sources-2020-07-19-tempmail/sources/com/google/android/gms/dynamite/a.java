package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

final class a implements DynamiteModule.VersionPolicy.zza {
    a() {
    }

    public final int a(Context context, String str) {
        return DynamiteModule.a(context, str);
    }

    public final int b(Context context, String str, boolean z) throws DynamiteModule.LoadingException {
        return DynamiteModule.f(context, str, z);
    }
}
