package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class v40 extends ThreadLocal<Cipher> {
    v40() {
    }

    private static Cipher a() {
        try {
            return zzedf.f8700f.a("AES/ECB/NOPADDING");
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        return a();
    }
}
