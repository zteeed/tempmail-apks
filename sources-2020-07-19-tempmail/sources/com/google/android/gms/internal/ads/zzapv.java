package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzapv {

    /* renamed from: a  reason: collision with root package name */
    private final zzbfn f5846a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f5847b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5848c;

    public zzapv(zzbfn zzbfn, Map<String, String> map) {
        this.f5846a = zzbfn;
        this.f5848c = map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            this.f5847b = Boolean.parseBoolean(map.get("allowOrientationChange"));
        } else {
            this.f5847b = true;
        }
    }

    public final void a() {
        int i;
        if (this.f5846a == null) {
            zzbba.i("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(this.f5848c)) {
            zzq.zzky();
            i = 7;
        } else if ("landscape".equalsIgnoreCase(this.f5848c)) {
            zzq.zzky();
            i = 6;
        } else if (this.f5847b) {
            i = -1;
        } else {
            i = zzq.zzky().q();
        }
        this.f5846a.setRequestedOrientation(i);
    }
}
