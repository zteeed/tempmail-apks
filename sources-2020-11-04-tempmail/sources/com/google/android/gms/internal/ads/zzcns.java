package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcns {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7473a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f7474b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f7475c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7476d;

    public zzcns(Context context, zzbbd zzbbd, zzdla zzdla, Executor executor) {
        this.f7473a = context;
        this.f7474b = zzbbd;
        this.f7475c = zzdla;
        this.f7476d = executor;
    }

    public final zzdvf<zzdkw> a() {
        zzalr b2 = zzq.zzlj().b(this.f7473a, this.f7474b);
        zzaln<JSONObject> zzaln = zzalm.f5955b;
        zzalj<I, O> a2 = b2.a("google.afma.response.normalize", zzaln, zzaln);
        return zzdux.j(zzdux.j(zzdux.j(zzdux.g(""), new sl(this, this.f7475c.f8349d.t), this.f7476d), new rl(a2), this.f7476d), new tl(this), this.f7476d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(JSONObject jSONObject) throws Exception {
        return zzdux.g(new zzdkw(new zzdkr(this.f7475c), zzdku.a(new StringReader(jSONObject.toString()))));
    }
}
