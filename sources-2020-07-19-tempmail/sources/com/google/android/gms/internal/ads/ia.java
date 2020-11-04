package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ia implements zzahc<zzbfn> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ ga f4029a;

    ia(ga gaVar) {
        this.f4029a = gaVar;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f4029a) {
                        if (this.f4029a.E != parseInt) {
                            int unused = this.f4029a.E = parseInt;
                            this.f4029a.requestLayout();
                        }
                    }
                } catch (Exception e2) {
                    zzbba.d("Exception occurred while getting webview content height", e2);
                }
            }
        }
    }
}
