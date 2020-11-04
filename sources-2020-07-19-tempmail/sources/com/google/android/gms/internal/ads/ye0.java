package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.crashlytics.internal.proto.CodedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ye0 {
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    private ByteArrayOutputStream f5385a = new ByteArrayOutputStream(CodedOutputStream.DEFAULT_BUFFER_SIZE);
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    private Base64OutputStream f5386b = new Base64OutputStream(this.f5385a, 10);

    public final void a(byte[] bArr) throws IOException {
        this.f5386b.write(bArr);
    }

    public final String toString() {
        try {
            this.f5386b.close();
        } catch (IOException e2) {
            zzbba.c("HashManager: Unable to convert to Base64.", e2);
        }
        try {
            this.f5385a.close();
            return this.f5385a.toString();
        } catch (IOException e3) {
            zzbba.c("HashManager: Unable to convert to Base64.", e3);
            return "";
        } finally {
            this.f5385a = null;
            this.f5386b = null;
        }
    }
}