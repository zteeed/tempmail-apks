package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.4.3 */
public final class zzcr {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Map<String, String>> f9588a;

    zzcr(Map<String, Map<String, String>> map) {
        this.f9588a = map;
    }

    @Nullable
    public final String a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map map = this.f9588a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}
