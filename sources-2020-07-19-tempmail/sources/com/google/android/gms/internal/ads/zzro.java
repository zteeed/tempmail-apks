package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public abstract class zzro {

    /* renamed from: b  reason: collision with root package name */
    private static MessageDigest f9063b;

    /* renamed from: a  reason: collision with root package name */
    protected Object f9064a = new Object();

    /* access modifiers changed from: package-private */
    public abstract byte[] a(String str);

    /* access modifiers changed from: protected */
    public final MessageDigest b() {
        synchronized (this.f9064a) {
            if (f9063b != null) {
                MessageDigest messageDigest = f9063b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f9063b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f9063b;
            return messageDigest2;
        }
    }
}
