package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrx {
    @VisibleForTesting
    private static long a(long j, int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return j;
        }
        if (i % 2 == 0) {
            return a((j * j) % 1073807359, i / 2) % 1073807359;
        }
        return (j * (a((j * j) % 1073807359, i / 2) % 1073807359)) % 1073807359;
    }

    @VisibleForTesting
    private static String b(String[] strArr, int i, int i2) {
        int i3 = i2 + i;
        if (strArr.length < i3) {
            zzbba.g("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i4 = i3 - 1;
            if (i < i4) {
                sb.append(strArr[i]);
                sb.append(' ');
                i++;
            } else {
                sb.append(strArr[i4]);
                return sb.toString();
            }
        }
    }

    @VisibleForTesting
    private static void c(int i, long j, String str, int i2, PriorityQueue<zzrw> priorityQueue) {
        zzrw zzrw = new zzrw(j, str, i2);
        if ((priorityQueue.size() != i || (priorityQueue.peek().f9259c <= zzrw.f9259c && priorityQueue.peek().f9257a <= zzrw.f9257a)) && !priorityQueue.contains(zzrw)) {
            priorityQueue.add(zzrw);
            if (priorityQueue.size() > i) {
                priorityQueue.poll();
            }
        }
    }

    public static void d(String[] strArr, int i, int i2, PriorityQueue<zzrw> priorityQueue) {
        String[] strArr2 = strArr;
        int i3 = i2;
        if (strArr2.length < i3) {
            c(i, e(strArr2, 0, strArr2.length), b(strArr2, 0, strArr2.length), strArr2.length, priorityQueue);
            return;
        }
        long e2 = e(strArr2, 0, i3);
        c(i, e2, b(strArr2, 0, i3), i2, priorityQueue);
        long a2 = a(16785407, i3 - 1);
        for (int i4 = 1; i4 < (strArr2.length - i3) + 1; i4++) {
            long j = e2 + 1073807359;
            e2 = (((((j - ((((((long) zzrs.a(strArr2[i4 - 1])) + 2147483647L) % 1073807359) * a2) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((((long) zzrs.a(strArr2[(i4 + i3) - 1])) + 2147483647L) % 1073807359)) % 1073807359;
            c(i, e2, b(strArr2, i4, i3), strArr2.length, priorityQueue);
        }
    }

    private static long e(String[] strArr, int i, int i2) {
        long a2 = (((long) zzrs.a(strArr[0])) + 2147483647L) % 1073807359;
        for (int i3 = 1; i3 < i2; i3++) {
            a2 = (((a2 * 16785407) % 1073807359) + ((((long) zzrs.a(strArr[i3])) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return a2;
    }
}
