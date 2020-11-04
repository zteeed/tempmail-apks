package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
final class ha0 {

    /* renamed from: a  reason: collision with root package name */
    static zzdwf f3948a;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean a(com.google.android.gms.internal.ads.zzex r9) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            com.google.android.gms.internal.ads.zzdwf r0 = f3948a
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            com.google.android.gms.internal.ads.zzaag<java.lang.String> r0 = com.google.android.gms.internal.ads.zzaav.g1
            com.google.android.gms.internal.ads.zzaar r2 = com.google.android.gms.internal.ads.zzwg.e()
            java.lang.Object r0 = r2.c(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x001c
            int r4 = r0.length()
            if (r4 != 0) goto L_0x0037
        L_0x001c:
            if (r9 != 0) goto L_0x0020
        L_0x001e:
            r0 = r2
            goto L_0x0034
        L_0x0020:
            java.lang.String r0 = "IPyaXEy+F5at6zi6GEs/jkKHpFTAlYWM90ImI4874hawRCOEgKKUBzsomxFaeDkJ"
            java.lang.String r4 = "UMjKs/aJTfdn6BJRL96Zl/lGRXJtRxPMhZNhmq0gEjI="
            java.lang.reflect.Method r9 = r9.e(r0, r4)
            if (r9 != 0) goto L_0x002b
            goto L_0x001e
        L_0x002b:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.Object r9 = r9.invoke(r2, r0)
            java.lang.String r9 = (java.lang.String) r9
            r0 = r9
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            return r3
        L_0x0037:
            byte[] r9 = com.google.android.gms.internal.ads.zzcv.b(r0, r1)     // Catch:{ IllegalArgumentException -> 0x011e }
            com.google.android.gms.internal.ads.zzdwo r9 = com.google.android.gms.internal.ads.zzdws.a(r9)     // Catch:{  }
            com.google.android.gms.internal.ads.zzeca r0 = com.google.android.gms.internal.ads.zzdyl.f8450a     // Catch:{  }
            java.util.List r0 = r0.G()     // Catch:{  }
            java.util.Iterator r0 = r0.iterator()     // Catch:{  }
        L_0x0049:
            boolean r4 = r0.hasNext()     // Catch:{  }
            if (r4 == 0) goto L_0x0115
            java.lang.Object r4 = r0.next()     // Catch:{  }
            com.google.android.gms.internal.ads.zzebm r4 = (com.google.android.gms.internal.ads.zzebm) r4     // Catch:{  }
            java.lang.String r5 = r4.G()     // Catch:{  }
            boolean r5 = r5.isEmpty()     // Catch:{  }
            if (r5 != 0) goto L_0x010d
            java.lang.String r5 = r4.H()     // Catch:{  }
            boolean r5 = r5.isEmpty()     // Catch:{  }
            if (r5 != 0) goto L_0x0105
            java.lang.String r5 = r4.M()     // Catch:{  }
            boolean r5 = r5.isEmpty()     // Catch:{  }
            if (r5 != 0) goto L_0x00fd
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkAead"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkMac"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkHybridDecrypt"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkHybridEncrypt"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkPublicKeySign"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkPublicKeyVerify"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkStreamingAead"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 != 0) goto L_0x0049
            java.lang.String r5 = r4.M()     // Catch:{  }
            java.lang.String r6 = "TinkDeterministicAead"
            boolean r5 = r5.equals(r6)     // Catch:{  }
            if (r5 == 0) goto L_0x00d5
            goto L_0x0049
        L_0x00d5:
            java.lang.String r5 = r4.M()     // Catch:{  }
            com.google.android.gms.internal.ads.zzdwb r5 = com.google.android.gms.internal.ads.zzdwy.r(r5)     // Catch:{  }
            com.google.android.gms.internal.ads.zzdwt r6 = r5.b()     // Catch:{  }
            com.google.android.gms.internal.ads.zzdwy.l(r6)     // Catch:{  }
            java.lang.String r6 = r4.G()     // Catch:{  }
            java.lang.String r7 = r4.H()     // Catch:{  }
            int r8 = r4.I()     // Catch:{  }
            com.google.android.gms.internal.ads.zzdwi r5 = r5.a(r6, r7, r8)     // Catch:{  }
            boolean r4 = r4.L()     // Catch:{  }
            com.google.android.gms.internal.ads.zzdwy.j(r5, r4)     // Catch:{  }
            goto L_0x0049
        L_0x00fd:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing catalogue_name."
            r9.<init>(r0)     // Catch:{  }
            throw r9     // Catch:{  }
        L_0x0105:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing primitive_name."
            r9.<init>(r0)     // Catch:{  }
            throw r9     // Catch:{  }
        L_0x010d:
            java.security.GeneralSecurityException r9 = new java.security.GeneralSecurityException     // Catch:{  }
            java.lang.String r0 = "Missing type_url."
            r9.<init>(r0)     // Catch:{  }
            throw r9     // Catch:{  }
        L_0x0115:
            com.google.android.gms.internal.ads.zzdwf r9 = com.google.android.gms.internal.ads.zzdym.a(r9, r2)     // Catch:{  }
            f3948a = r9     // Catch:{  }
            if (r9 == 0) goto L_0x011e
            return r1
        L_0x011e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ha0.a(com.google.android.gms.internal.ads.zzex):boolean");
    }
}
