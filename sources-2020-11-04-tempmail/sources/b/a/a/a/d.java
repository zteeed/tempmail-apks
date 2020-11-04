package b.a.a.a;

import android.os.Bundle;

/* compiled from: ReferrerDetails */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f2060a;

    public d(Bundle bundle) {
        this.f2060a = bundle;
    }

    public long a() {
        return this.f2060a.getLong("install_begin_timestamp_seconds");
    }

    public String b() {
        return this.f2060a.getString("install_referrer");
    }

    public long c() {
        return this.f2060a.getLong("referrer_click_timestamp_seconds");
    }
}
