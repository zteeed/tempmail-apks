package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class t9 implements zzahc<zzbfn> {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ r9 f4961a;

    t9(r9 r9Var) {
        this.f4961a = r9Var;
    }

    public final /* synthetic */ void a(Object obj, Map map) {
        zzbfn zzbfn = (zzbfn) obj;
        if (map != null) {
            String str = (String) map.get("height");
            if (!TextUtils.isEmpty(str)) {
                try {
                    int parseInt = Integer.parseInt(str);
                    synchronized (this.f4961a) {
                        if (this.f4961a.G != parseInt) {
                            int unused = this.f4961a.G = parseInt;
                            this.f4961a.requestLayout();
                        }
                    }
                } catch (Exception e2) {
                    zzbba.d("Exception occurred while getting webview content height", e2);
                }
            }
        }
    }
}
