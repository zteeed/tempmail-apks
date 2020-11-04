package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahn implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final zzahm f5708a;

    private zzahn(zzahm zzahm) {
        this.f5708a = zzahm;
    }

    public static void b(zzbfn zzbfn, zzahm zzahm) {
        zzbfn.c("/reward", new zzahn(zzahm));
    }

    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("action");
        if ("grant".equals(str)) {
            zzaub zzaub = null;
            try {
                int parseInt = Integer.parseInt(map.get("amount"));
                String str2 = map.get("type");
                if (!TextUtils.isEmpty(str2)) {
                    zzaub = new zzaub(str2, parseInt);
                }
            } catch (NumberFormatException e2) {
                zzbba.d("Unable to parse reward amount.", e2);
            }
            this.f5708a.Q(zzaub);
        } else if ("video_start".equals(str)) {
            this.f5708a.N();
        } else if ("video_complete".equals(str)) {
            this.f5708a.I();
        }
    }
}
