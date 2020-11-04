package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcf;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class bq {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f3675a = false;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static MessageDigest f3676b;

    /* renamed from: c  reason: collision with root package name */
    private static final Object f3677c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static final Object f3678d = new Object();

    /* renamed from: e  reason: collision with root package name */
    static CountDownLatch f3679e = new CountDownLatch(1);

    private static zzcf.zza a(zzcf.zza.zzd zzd) {
        zzcf.zza.C0073zza w0 = zzcf.zza.w0();
        w0.k0((long) zzd.i());
        return (zzcf.zza) ((zzegb) w0.O());
    }

    private static Vector<byte[]> c(byte[] bArr, int i) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i3, bArr.length - i3 > 255 ? i3 + 255 : bArr.length));
                i2++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static byte[] d(byte[] bArr, String str, boolean z) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        byte[] bArr2;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = a(zzcf.zza.zzd.PSN_ENCODE_SIZE_FAIL).g();
        }
        if (bArr.length < i) {
            byte[] bArr3 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr3);
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr3).array();
        } else {
            bArr2 = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).array();
        }
        if (z) {
            bArr2 = ByteBuffer.allocate(256).put(e(bArr2)).put(bArr2).array();
        }
        byte[] bArr4 = new byte[256];
        for (ft a2 : new zzdc().N2) {
            a2.a(bArr2, bArr4);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new zzeee(str.getBytes("UTF-8")).a(bArr4);
        }
        return bArr4;
    }

    public static byte[] e(byte[] bArr) throws NoSuchAlgorithmException {
        byte[] digest;
        synchronized (f3677c) {
            MessageDigest g = g();
            if (g != null) {
                g.reset();
                g.update(bArr);
                digest = f3676b.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    static void f() {
        synchronized (f3678d) {
            if (!f3675a) {
                f3675a = true;
                new Thread(new dr()).start();
            }
        }
    }

    private static MessageDigest g() {
        boolean z;
        MessageDigest messageDigest;
        f();
        try {
            z = f3679e.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (z && (messageDigest = f3676b) != null) {
            return messageDigest;
        }
        return null;
    }

    static String h(zzcf.zza zza, String str) throws GeneralSecurityException, UnsupportedEncodingException {
        byte[] bArr;
        byte[] g = zza.g();
        if (((Boolean) zzwg.e().c(zzaav.h1)).booleanValue()) {
            Vector<byte[]> c2 = c(g, 255);
            if (c2 == null || c2.size() == 0) {
                bArr = d(a(zzcf.zza.zzd.PSN_ENCODE_SIZE_FAIL).g(), str, true);
            } else {
                zzcf.zzf.zza M = zzcf.zzf.M();
                Iterator<byte[]> it = c2.iterator();
                while (it.hasNext()) {
                    M.x(zzeer.U(d(it.next(), str, false)));
                }
                M.y(zzeer.U(e(g)));
                bArr = ((zzcf.zzf) ((zzegb) M.O())).g();
            }
        } else if (ha0.f4131a != null) {
            byte[] a2 = ha0.f4131a.a(g, str != null ? str.getBytes() : new byte[0]);
            zzcf.zzf.zza M2 = zzcf.zzf.M();
            M2.x(zzeer.U(a2));
            M2.w(zzcm.TINK_HYBRID);
            bArr = ((zzcf.zzf) ((zzegb) M2.O())).g();
        } else {
            throw new GeneralSecurityException();
        }
        return zzcv.a(bArr, true);
    }
}
