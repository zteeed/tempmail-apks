package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzedu {

    /* renamed from: a  reason: collision with root package name */
    private static final ThreadLocal<SecureRandom> f8528a = new d50();

    /* access modifiers changed from: private */
    public static SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i) {
        byte[] bArr = new byte[i];
        f8528a.get().nextBytes(bArr);
        return bArr;
    }
}
