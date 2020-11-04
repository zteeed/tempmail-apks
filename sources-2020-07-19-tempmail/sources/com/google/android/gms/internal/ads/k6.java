package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class k6 implements n6 {

    /* renamed from: a  reason: collision with root package name */
    private final String f4179a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4180b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f4181c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f4182d;

    k6(String str, String str2, Map map, byte[] bArr) {
        this.f4179a = str;
        this.f4180b = str2;
        this.f4181c = map;
        this.f4182d = bArr;
    }

    public final void a(JsonWriter jsonWriter) {
        zzbau.g(this.f4179a, this.f4180b, this.f4181c, this.f4182d, jsonWriter);
    }
}
