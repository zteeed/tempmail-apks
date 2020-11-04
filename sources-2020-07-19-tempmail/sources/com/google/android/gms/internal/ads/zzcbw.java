package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcbw implements zzela<zzqn> {

    /* renamed from: a  reason: collision with root package name */
    private final zzelj<zzbbd> f6811a;

    /* renamed from: b  reason: collision with root package name */
    private final zzelj<String> f6812b;

    public zzcbw(zzelj<zzbbd> zzelj, zzelj<String> zzelj2) {
        this.f6811a = zzelj;
        this.f6812b = zzelj2;
    }

    public final /* synthetic */ Object get() {
        zzq.zzkw();
        zzqn zzqn = new zzqn(zzaye.q0(), this.f6811a.get(), this.f6812b.get(), new JSONObject(), false, true);
        zzelg.b(zzqn, "Cannot return null from a non-@Nullable @Provides method");
        return zzqn;
    }
}
