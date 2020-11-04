package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.fragment.app.c;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk
public class LifecycleActivity {

    /* renamed from: a  reason: collision with root package name */
    private final Object f2941a;

    public LifecycleActivity(Activity activity) {
        Preconditions.l(activity, "Activity must not be null");
        this.f2941a = activity;
    }

    @KeepForSdk
    public Activity a() {
        return (Activity) this.f2941a;
    }

    @KeepForSdk
    public c b() {
        return (c) this.f2941a;
    }

    @KeepForSdk
    public boolean c() {
        return this.f2941a instanceof c;
    }

    public final boolean d() {
        return this.f2941a instanceof Activity;
    }
}
