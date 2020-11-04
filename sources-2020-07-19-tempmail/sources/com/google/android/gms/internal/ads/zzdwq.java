package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdwq {

    /* renamed from: a  reason: collision with root package name */
    private static final CopyOnWriteArrayList<zzdwn> f8428a = new CopyOnWriteArrayList<>();

    public static zzdwn a(String str) throws GeneralSecurityException {
        Iterator<zzdwn> it = f8428a.iterator();
        while (it.hasNext()) {
            zzdwn next = it.next();
            if (next.a(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
