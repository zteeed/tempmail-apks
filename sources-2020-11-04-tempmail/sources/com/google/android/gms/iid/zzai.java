package com.google.android.gms.iid;

import javax.annotation.concurrent.GuardedBy;

public abstract class zzai {
    @GuardedBy("SdkFlagFactory.class")

    /* renamed from: a  reason: collision with root package name */
    private static zzai f3489a;

    public static synchronized zzai b() {
        zzai zzai;
        synchronized (zzai.class) {
            if (f3489a == null) {
                f3489a = new b();
            }
            zzai = f3489a;
        }
        return zzai;
    }

    public abstract zzaj<Boolean> a(String str, boolean z);
}
