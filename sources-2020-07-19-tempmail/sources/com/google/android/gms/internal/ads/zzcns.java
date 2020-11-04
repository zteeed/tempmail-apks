package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.io.StringReader;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcns {

    /* renamed from: a  reason: collision with root package name */
    private final Context f7290a;

    /* renamed from: b  reason: collision with root package name */
    private final zzbbd f7291b;

    /* renamed from: c  reason: collision with root package name */
    private final zzdla f7292c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f7293d;

    public zzcns(Context context, zzbbd zzbbd, zzdla zzdla, Executor executor) {
        this.f7290a = context;
        this.f7291b = zzbbd;
        this.f7292c = zzdla;
        this.f7293d = executor;
    }

    public final zzdvf<zzdkw> a() {
        zzalr b2 = zzq.zzlj().b(this.f7290a, this.f7291b);
        zzaln<JSONObject> zzaln = zzalm.f5772b;
        zzalj<I, O> a2 = b2.a("google.afma.response.normalize", zzaln, zzaln);
        return zzdux.j(zzdux.j(zzdux.j(zzdux.g(""), new sl(this, this.f7292c.f8166d.t), this.f7293d), new rl(a2), this.f7293d), new tl(this), this.f7293d);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdvf b(JSONObject jSONObject) throws Exception {
        return zzdux.g(new zzdkw(new zzdkr(this.f7292c), zzdku.a(new StringReader(jSONObject.toString()))));
    }
}
