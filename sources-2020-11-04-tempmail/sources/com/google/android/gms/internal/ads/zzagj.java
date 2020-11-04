package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzagj implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final zzagi f5871a;

    public zzagj(zzagi zzagi) {
        this.f5871a = zzagi;
    }

    public final void a(Object obj, Map<String, String> map) {
        if (this.f5871a != null) {
            String str = map.get("name");
            if (str == null) {
                zzbba.h("Ad metadata with no name parameter.");
                str = "";
            }
            Bundle bundle = null;
            if (map.containsKey("info")) {
                try {
                    bundle = zzazy.o(new JSONObject(map.get("info")));
                } catch (JSONException e2) {
                    zzbba.c("Failed to convert ad metadata to JSON.", e2);
                }
            }
            if (bundle == null) {
                zzbba.g("Failed to convert ad metadata to Bundle.");
            } else {
                this.f5871a.s(str, bundle);
            }
        }
    }
}
