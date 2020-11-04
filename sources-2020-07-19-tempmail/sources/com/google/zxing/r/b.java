package com.google.zxing.r;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.c;
import com.google.zxing.d;
import com.google.zxing.l;
import com.google.zxing.m;
import java.util.Map;

/* compiled from: AztecReader */
public final class b implements l {
    public void a() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e A[LOOP:0: B:29:0x005c->B:30:0x005e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.zxing.m b(com.google.zxing.c r11, java.util.Map<com.google.zxing.d, ?> r12) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        /*
            r10 = this;
            com.google.zxing.r.e.a r0 = new com.google.zxing.r.e.a
            com.google.zxing.t.b r11 = r11.a()
            r0.<init>(r11)
            r11 = 0
            r1 = 0
            com.google.zxing.r.a r2 = r0.a(r11)     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            com.google.zxing.o[] r3 = r2.b()     // Catch:{ NotFoundException -> 0x002b, FormatException -> 0x0025 }
            com.google.zxing.r.d.a r4 = new com.google.zxing.r.d.a     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4.<init>()     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            com.google.zxing.t.e r2 = r4.c(r2)     // Catch:{ NotFoundException -> 0x0023, FormatException -> 0x0021 }
            r4 = r3
            r3 = r1
            r1 = r2
            r2 = r3
            goto L_0x002f
        L_0x0021:
            r2 = move-exception
            goto L_0x0027
        L_0x0023:
            r2 = move-exception
            goto L_0x002d
        L_0x0025:
            r2 = move-exception
            r3 = r1
        L_0x0027:
            r4 = r3
            r3 = r2
            r2 = r1
            goto L_0x002f
        L_0x002b:
            r2 = move-exception
            r3 = r1
        L_0x002d:
            r4 = r3
            r3 = r1
        L_0x002f:
            if (r1 != 0) goto L_0x004e
            r1 = 1
            com.google.zxing.r.a r0 = r0.a(r1)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.o[] r4 = r0.b()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.r.d.a r1 = new com.google.zxing.r.d.a     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            r1.<init>()     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            com.google.zxing.t.e r1 = r1.c(r0)     // Catch:{ NotFoundException -> 0x0046, FormatException -> 0x0044 }
            goto L_0x004e
        L_0x0044:
            r11 = move-exception
            goto L_0x0047
        L_0x0046:
            r11 = move-exception
        L_0x0047:
            if (r2 != 0) goto L_0x004d
            if (r3 == 0) goto L_0x004c
            throw r3
        L_0x004c:
            throw r11
        L_0x004d:
            throw r2
        L_0x004e:
            r6 = r4
            if (r12 == 0) goto L_0x0066
            com.google.zxing.d r0 = com.google.zxing.d.NEED_RESULT_POINT_CALLBACK
            java.lang.Object r12 = r12.get(r0)
            com.google.zxing.p r12 = (com.google.zxing.p) r12
            if (r12 == 0) goto L_0x0066
            int r0 = r6.length
        L_0x005c:
            if (r11 >= r0) goto L_0x0066
            r2 = r6[r11]
            r12.a(r2)
            int r11 = r11 + 1
            goto L_0x005c
        L_0x0066:
            com.google.zxing.m r11 = new com.google.zxing.m
            java.lang.String r3 = r1.h()
            byte[] r4 = r1.e()
            int r5 = r1.c()
            com.google.zxing.a r7 = com.google.zxing.a.AZTEC
            long r8 = java.lang.System.currentTimeMillis()
            r2 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.List r12 = r1.a()
            if (r12 == 0) goto L_0x0089
            com.google.zxing.n r0 = com.google.zxing.n.BYTE_SEGMENTS
            r11.h(r0, r12)
        L_0x0089:
            java.lang.String r12 = r1.b()
            if (r12 == 0) goto L_0x0094
            com.google.zxing.n r0 = com.google.zxing.n.ERROR_CORRECTION_LEVEL
            r11.h(r0, r12)
        L_0x0094:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.r.b.b(com.google.zxing.c, java.util.Map):com.google.zxing.m");
    }

    public m c(c cVar) throws NotFoundException, FormatException {
        return b(cVar, (Map<d, ?>) null);
    }
}
