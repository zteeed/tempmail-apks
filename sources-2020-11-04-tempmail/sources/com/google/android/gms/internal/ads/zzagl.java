package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzagl implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final zzagk f5872a;

    public zzagl(zzagk zzagk) {
        this.f5872a = zzagk;
    }

    public final void a(Object obj, Map<String, String> map) {
        String str = map.get("name");
        if (str == null) {
            zzbba.i("App event with no name parameter.");
        } else {
            this.f5872a.onAppEvent(str, map.get("info"));
        }
    }
}
