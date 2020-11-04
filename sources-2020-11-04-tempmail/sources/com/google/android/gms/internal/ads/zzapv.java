package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapv {

    /* renamed from: a  reason: collision with root package name */
    private final zzbfn f6029a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f6030b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6031c;

    public zzapv(zzbfn zzbfn, Map<String, String> map) {
        this.f6029a = zzbfn;
        this.f6031c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f6030b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f6030b = true;
        }
    }

    public final void a() {
        int i;
        if (this.f6029a == null) {
            zzbba.i("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f6031c)) {
            zzq.zzky();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.f6031c)) {
            zzq.zzky();
            i = 6;
        } else if (this.f6030b) {
            i = -1;
        } else {
            i = zzq.zzky().q();
        }
        this.f6029a.setRequestedOrientation(i);
    }
}
