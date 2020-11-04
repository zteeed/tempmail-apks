package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class gz implements zzdrh {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ zzdpk f3921a;

    gz(zzdp zzdp, zzdpk zzdpk) {
        this.f3921a = zzdpk;
    }

    public final boolean a(File file) {
        try {
            return this.f3921a.a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
