package com.google.android.gms.gcm;

import android.annotation.TargetApi;
import android.os.Trace;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.iid.zzai;
import com.google.android.gms.iid.zzaj;
import java.io.Closeable;

public final class zzp implements Closeable {

    /* renamed from: c  reason: collision with root package name */
    private static final zzaj<Boolean> f3256c = zzai.b().a("nts.enable_tracing", true);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3257b;

    @TargetApi(18)
    public zzp(String str) {
        boolean z = PlatformVersion.e() && f3256c.get().booleanValue();
        this.f3257b = z;
        if (z) {
            Trace.beginSection(str.length() > 127 ? str.substring(0, 127) : str);
        }
    }

    @TargetApi(18)
    public final void close() {
        if (this.f3257b) {
            Trace.endSection();
        }
    }
}
