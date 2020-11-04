package com.google.android.gms.internal.ads;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
final class la0 extends hb0 {

    /* renamed from: c  reason: collision with root package name */
    private byte[] f4281c;

    public la0(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f4281c = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f4281c;
    }
}
