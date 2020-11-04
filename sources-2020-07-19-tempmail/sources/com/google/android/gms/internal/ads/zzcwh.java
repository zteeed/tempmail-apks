package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzcwh {

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap<String, zzaox> f7632a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private final zzcix f7633b;

    public zzcwh(zzcix zzcix) {
        this.f7633b = zzcix;
    }

    public final void a(String str) {
        try {
            this.f7632a.put(str, this.f7633b.e(str));
        } catch (RemoteException e2) {
            zzbba.c("Couldn't create RTB adapter : ", e2);
        }
    }

    @CheckForNull
    public final zzaox b(String str) {
        if (this.f7632a.containsKey(str)) {
            return this.f7632a.get(str);
        }
        return null;
    }
}
