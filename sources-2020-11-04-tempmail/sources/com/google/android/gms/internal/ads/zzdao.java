package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.gms.ads.internal.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdao implements zzdec<zzdal> {

    /* renamed from: a  reason: collision with root package name */
    private final zzdvi f7976a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7977b;

    public zzdao(zzdvi zzdvi, Context context) {
        this.f7976a = zzdvi;
        this.f7977b = context;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzdal a() throws Exception {
        AudioManager audioManager = (AudioManager) this.f7977b.getSystemService("audio");
        return new zzdal(audioManager.getMode(), audioManager.isMusicActive(), audioManager.isSpeakerphoneOn(), audioManager.getStreamVolume(3), audioManager.getRingerMode(), audioManager.getStreamVolume(2), zzq.zzlb().d(), zzq.zzlb().e());
    }

    public final zzdvf<zzdal> b() {
        return this.f7976a.f(new wr(this));
    }
}
