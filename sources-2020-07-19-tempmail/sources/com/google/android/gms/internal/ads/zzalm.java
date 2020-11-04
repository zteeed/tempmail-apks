package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzalm {

    /* renamed from: a  reason: collision with root package name */
    private static final Charset f5771a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    public static final zzaln<JSONObject> f5772b = new c2();

    /* renamed from: c  reason: collision with root package name */
    public static final zzall<InputStream> f5773c = d2.f3594a;

    static final /* synthetic */ InputStream a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f5771a));
    }
}
