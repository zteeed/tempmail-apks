package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzro {

    /* renamed from: b  reason: collision with root package name */
    private static MessageDigest f9246b;

    /* renamed from: a  reason: collision with root package name */
    protected Object f9247a = new Object();

    /* access modifiers changed from: package-private */
    public abstract byte[] a(String str);

    /* access modifiers changed from: protected */
    public final MessageDigest b() {
        synchronized (this.f9247a) {
            if (f9246b != null) {
                MessageDigest messageDigest = f9246b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f9246b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f9246b;
            return messageDigest2;
        }
    }
}
