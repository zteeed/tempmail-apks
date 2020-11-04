package com.google.android.gms.iid;

import javax.annotation.concurrent.GuardedBy;

public abstract class zzai {
    @GuardedBy("SdkFlagFactory.class")

    /* renamed from: a  reason: collision with root package name */
    private static zzai f3306a;

    public static synchronized zzai b() {
        zzai zzai;
        synchronized (zzai.class) {
            if (f3306a == null) {
                f3306a = new b();
            }
            zzai = f3306a;
        }
        return zzai;
    }

    public abstract zzaj<Boolean> a(String str, boolean z);
}
