package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.zzq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzahe implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5879a;

    public zzahe(Context context) {
        this.f5879a = context;
    }

    public final void a(Object obj, Map<String, String> map) {
        if (zzq.zzlu().l(this.f5879a)) {
            String str = map.get("eventName");
            String str2 = map.get("eventId");
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 94399) {
                if (hashCode != 94401) {
                    if (hashCode == 94407 && str.equals("_ai")) {
                        c2 = 1;
                    }
                } else if (str.equals("_ac")) {
                    c2 = 0;
                }
            } else if (str.equals("_aa")) {
                c2 = 2;
            }
            if (c2 == 0) {
                zzq.zzlu().x(this.f5879a, str2);
            } else if (c2 == 1) {
                zzq.zzlu().y(this.f5879a, str2);
            } else if (c2 != 2) {
                zzbba.g("logScionEvent gmsg contained unsupported eventName");
            } else {
                zzq.zzlu().B(this.f5879a, str2);
            }
        }
    }
}
