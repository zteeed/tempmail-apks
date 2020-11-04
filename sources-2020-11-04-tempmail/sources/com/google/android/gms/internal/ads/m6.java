package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final /* synthetic */ class m6 implements n6 {

    /* renamed from: a  reason: collision with root package name */
    private final int f4531a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f4532b;

    m6(int i, Map map) {
        this.f4531a = i;
        this.f4532b = map;
    }

    public final void a(JsonWriter jsonWriter) {
        zzbau.b(this.f4531a, this.f4532b, jsonWriter);
    }
}
