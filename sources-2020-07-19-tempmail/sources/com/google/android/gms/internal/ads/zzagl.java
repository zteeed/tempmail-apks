package com.google.android.gms.internal.ads;

import com.google.firebase.crashlytics.internal.analytics.AnalyticsConnectorReceiver;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzagl implements zzahc<Object> {

    /* renamed from: a  reason: collision with root package name */
    private final zzagk f5689a;

    public zzagl(zzagk zzagk) {
        this.f5689a = zzagk;
    }

    public final void a(Object obj, Map<String, String> map) {
        String str = map.get(AnalyticsConnectorReceiver.EVENT_NAME_KEY);
        if (str == null) {
            zzbba.i("App event with no name parameter.");
        } else {
            this.f5689a.onAppEvent(str, map.get("info"));
        }
    }
}
