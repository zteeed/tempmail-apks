package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-gass@@19.2.0 */
public final class zzdqp {

    /* renamed from: a  reason: collision with root package name */
    private final Context f8500a;

    /* renamed from: b  reason: collision with root package name */
    private final zzdpm f8501b;

    public zzdqp(Context context, zzdpm zzdpm) {
        this.f8500a = context;
        this.f8501b = zzdpm;
    }

    private final String a() {
        HashSet hashSet = new HashSet(Arrays.asList(new String[]{"i686", "armv71"}));
        String f2 = zzdsj.OS_ARCH.f();
        if (!TextUtils.isEmpty(f2) && hashSet.contains(f2)) {
            return f2;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (NoSuchFieldException e2) {
            zzdpm zzdpm = this.f8501b;
            if (zzdpm != null) {
                zzdpm.b(2024, 0, e2);
            }
        } catch (IllegalAccessException e3) {
            zzdpm zzdpm2 = this.f8501b;
            if (zzdpm2 != null) {
                zzdpm2.b(2024, 0, e3);
            }
        }
        String str = Build.CPU_ABI;
        if (str != null) {
            return str;
        }
        return Build.CPU_ABI2;
    }

    private final zzgo b() {
        FileInputStream fileInputStream;
        File file = new File(new File(this.f8500a.getApplicationInfo().dataDir), "lib");
        if (!file.exists()) {
            return zzgo.UNSUPPORTED;
        }
        File[] listFiles = file.listFiles(new zzdtr(Pattern.compile(".*\\.so$", 2)));
        if (listFiles == null || listFiles.length == 0) {
            return zzgo.UNSUPPORTED;
        }
        try {
            fileInputStream = new FileInputStream(listFiles[0]);
            byte[] bArr = new byte[20];
            if (fileInputStream.read(bArr) == 20) {
                byte[] bArr2 = {0, 0};
                if (bArr[5] == 2) {
                    d(bArr);
                    zzgo zzgo = zzgo.UNSUPPORTED;
                    fileInputStream.close();
                    return zzgo;
                }
                bArr2[0] = bArr[19];
                bArr2[1] = bArr[18];
                short s = ByteBuffer.wrap(bArr2).getShort();
                if (s == 3) {
                    zzgo zzgo2 = zzgo.X86;
                    fileInputStream.close();
                    return zzgo2;
                } else if (s == 40) {
                    zzgo zzgo3 = zzgo.ARM7;
                    fileInputStream.close();
                    return zzgo3;
                } else if (s == 62) {
                    zzgo zzgo4 = zzgo.X86_64;
                    fileInputStream.close();
                    return zzgo4;
                } else if (s != 183) {
                    zzgo zzgo5 = zzgo.UNSUPPORTED;
                    fileInputStream.close();
                    return zzgo5;
                } else {
                    zzgo zzgo6 = zzgo.ARM64;
                    fileInputStream.close();
                    return zzgo6;
                }
            } else {
                fileInputStream.close();
                return zzgo.UNSUPPORTED;
            }
        } catch (IOException unused) {
        } catch (Throwable th) {
            zzeea.b(th, th);
        }
        throw th;
    }

    private final void d(byte[] bArr) {
        if (this.f8501b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("os.arch:");
            sb.append(zzdsj.OS_ARCH.f());
            sb.append(";");
            try {
                String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get((Object) null);
                if (strArr != null) {
                    sb.append("supported_abis:");
                    sb.append(Arrays.toString(strArr));
                    sb.append(";");
                }
            } catch (IllegalAccessException | NoSuchFieldException unused) {
            }
            sb.append("CPU_ABI:");
            sb.append(Build.CPU_ABI);
            sb.append(";");
            sb.append("CPU_ABI2:");
            sb.append(Build.CPU_ABI2);
            sb.append(";");
            if (bArr != null) {
                sb.append("ELF:");
                sb.append(Arrays.toString(bArr));
                sb.append(";");
            }
            this.f8501b.i(4007, sb.toString());
        }
    }

    public final zzgo c() {
        zzgo b2 = b();
        if (b2 != zzgo.UNSUPPORTED) {
            return b2;
        }
        String a2 = a();
        if (!TextUtils.isEmpty(a2)) {
            if (a2.equalsIgnoreCase("i686") || a2.equalsIgnoreCase("x86")) {
                return zzgo.X86;
            }
            if (a2.equalsIgnoreCase("x86_64")) {
                return zzgo.X86_64;
            }
            if (a2.equalsIgnoreCase("arm64-v8a")) {
                return zzgo.ARM64;
            }
            if (a2.equalsIgnoreCase("armeabi-v7a") || a2.equalsIgnoreCase("armv71")) {
                return zzgo.ARM7;
            }
        }
        d((byte[]) null);
        return zzgo.UNSUPPORTED;
    }
}
