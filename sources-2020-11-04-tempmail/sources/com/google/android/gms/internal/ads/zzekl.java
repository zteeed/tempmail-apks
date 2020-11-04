package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzekl extends zzeks {

    /* renamed from: a  reason: collision with root package name */
    private String f8822a;

    public zzekl(String str) {
        this.f8822a = str;
    }

    public final void a(String str) {
        String str2 = this.f8822a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
