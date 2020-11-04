package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzc;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahh implements zzahc<zzbfn> {

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Integer> f5699d = CollectionUtils.f(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});

    /* renamed from: a  reason: collision with root package name */
    private final zzc f5700a;

    /* renamed from: b  reason: collision with root package name */
    private final zzapt f5701b;

    /* renamed from: c  reason: collision with root package name */
    private final zzaqc f5702c;

    public zzahh(zzc zzc, zzapt zzapt, zzaqc zzaqc) {
        this.f5700a = zzc;
        this.f5701b = zzapt;
        this.f5702c = zzaqc;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzc zzc;
        zzbfn zzbfn = (zzbfn) obj;
        int intValue = f5699d.get((String) map.get("a")).intValue();
        if (intValue != 5 && intValue != 7 && (zzc = this.f5700a) != null && !zzc.zzjy()) {
            this.f5700a.zzbn((String) null);
        } else if (intValue == 1) {
            this.f5701b.j(map);
        } else if (intValue == 3) {
            new zzapu(zzbfn, map).h();
        } else if (intValue == 4) {
            new zzapo(zzbfn, map).i();
        } else if (intValue == 5) {
            new zzapv(zzbfn, map).a();
        } else if (intValue == 6) {
            this.f5701b.i(true);
        } else if (intValue != 7) {
            zzbba.h("Unknown MRAID command called.");
        } else {
            this.f5702c.a();
        }
    }
}
