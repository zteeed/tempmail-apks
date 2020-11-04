package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzei {

    /* renamed from: a  reason: collision with root package name */
    private static Cipher f8588a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f8589b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static final Object f8590c = new Object();

    public zzei(SecureRandom secureRandom) {
    }

    private static Cipher a() throws NoSuchAlgorithmException, NoSuchPaddingException {
        Cipher cipher;
        synchronized (f8590c) {
            if (f8588a == null) {
                f8588a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f8588a;
        }
        return cipher;
    }

    public final byte[] b(byte[] bArr, String str) throws zzeh {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] b2 = zzcv.b(str, false);
                if (b2.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(b2.length);
                    allocate.put(b2);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(b2.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (f8589b) {
                        a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new zzeh(this);
            } catch (NoSuchAlgorithmException e2) {
                throw new zzeh(this, e2);
            } catch (InvalidKeyException e3) {
                throw new zzeh(this, e3);
            } catch (IllegalBlockSizeException e4) {
                throw new zzeh(this, e4);
            } catch (NoSuchPaddingException e5) {
                throw new zzeh(this, e5);
            } catch (BadPaddingException e6) {
                throw new zzeh(this, e6);
            } catch (InvalidAlgorithmParameterException e7) {
                throw new zzeh(this, e7);
            } catch (IllegalArgumentException e8) {
                throw new zzeh(this, e8);
            }
        } else {
            throw new zzeh(this);
        }
    }

    public final byte[] c(String str) throws zzeh {
        try {
            byte[] b2 = zzcv.b(str, false);
            if (b2.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(b2, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new zzeh(this);
        } catch (IllegalArgumentException e2) {
            throw new zzeh(this, e2);
        }
    }

    public final String d(byte[] bArr, byte[] bArr2) throws zzeh {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f8589b) {
                    a().init(1, secretKeySpec, (SecureRandom) null);
                    doFinal = a().doFinal(bArr2);
                    iv = a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return zzcv.a(bArr3, false);
            } catch (NoSuchAlgorithmException e2) {
                throw new zzeh(this, e2);
            } catch (InvalidKeyException e3) {
                throw new zzeh(this, e3);
            } catch (IllegalBlockSizeException e4) {
                throw new zzeh(this, e4);
            } catch (NoSuchPaddingException e5) {
                throw new zzeh(this, e5);
            } catch (BadPaddingException e6) {
                throw new zzeh(this, e6);
            }
        } else {
            throw new zzeh(this);
        }
    }
}
