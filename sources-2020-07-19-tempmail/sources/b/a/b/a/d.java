package b.a.b.a;

import android.os.Bundle;

/* compiled from: ReferrerDetails */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f1961a;

    public d(Bundle bundle) {
        this.f1961a = bundle;
    }

    public long a() {
        return this.f1961a.getLong("install_begin_timestamp_seconds");
    }

    public String b() {
        return this.f1961a.getString("install_referrer");
    }

    public long c() {
        return this.f1961a.getLong("referrer_click_timestamp_seconds");
    }
}
