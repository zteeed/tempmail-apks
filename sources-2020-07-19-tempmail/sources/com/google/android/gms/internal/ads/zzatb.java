package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzatb implements zzasq {

    /* renamed from: a  reason: collision with root package name */
    private zzalj<JSONObject, JSONObject> f5943a;

    public zzatb(Context context) {
        zzalr a2 = zzq.zzlj().a(context, zzbbd.u());
        zzaln<JSONObject> zzaln = zzalm.f5772b;
        a2.a("google.afma.request.getAdDictionary", zzaln, zzaln);
        zzalr a3 = zzq.zzlj().a(context, zzbbd.u());
        zzaln<JSONObject> zzaln2 = zzalm.f5772b;
        this.f5943a = a3.a("google.afma.sdkConstants.getSdkConstants", zzaln2, zzaln2);
    }

    public final zzalj<JSONObject, JSONObject> a() {
        return this.f5943a;
    }
}
