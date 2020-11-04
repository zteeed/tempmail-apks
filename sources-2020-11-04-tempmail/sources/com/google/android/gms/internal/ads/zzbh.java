package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public class zzbh extends zzaa<String> {
    private final Object o = new Object();
    private zzal<String> p;

    public zzbh(int i, String str, zzal<String> zzal, zzai zzai) {
        super(i, str, zzai);
        this.p = zzal;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void r(String str) {
        zzal<String> zzal;
        synchronized (this.o) {
            zzal = this.p;
        }
        if (zzal != null) {
            zzal.b(str);
        }
    }

    /* access modifiers changed from: protected */
    public final zzaj<String> o(zzy zzy) {
        String str;
        try {
            byte[] bArr = zzy.f9408b;
            String str2 = "ISO-8859-1";
            String str3 = zzy.f9409c.get("Content-Type");
            if (str3 != null) {
                String[] split = str3.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str2 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str2);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzy.f9408b);
        }
        return zzaj.a(str, zzbc.a(zzy));
    }
}
