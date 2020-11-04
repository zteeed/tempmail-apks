package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class k6 implements n6 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4362a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4363b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f4364c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f4365d;

    k6(String str, String str2, Map map, byte[] bArr) {
        this.f4362a = str;
        this.f4363b = str2;
        this.f4364c = map;
        this.f4365d = bArr;
    }

    public final void a(JsonWriter jsonWriter) {
        zzbau.g(this.f4362a, this.f4363b, this.f4364c, this.f4365d, jsonWriter);
    }
}
