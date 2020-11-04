package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzrr {

    /* renamed from: a  reason: collision with root package name */
    private final int f9253a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9254b;

    /* renamed from: c  reason: collision with root package name */
    private final zzro f9255c = new zzrv();

    public zzrr(int i) {
        this.f9254b = i;
        this.f9253a = 6;
    }

    @VisibleForTesting
    private final String b(String str) {
        String[] split = str.split("\n");
        if (split.length == 0) {
            return "";
        }
        ye0 ye0 = new ye0();
        PriorityQueue priorityQueue = new PriorityQueue(this.f9254b, new xe0(this));
        for (String b2 : split) {
            String[] b3 = zzrs.b(b2, false);
            if (b3.length != 0) {
                zzrx.d(b3, this.f9254b, this.f9253a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                ye0.a(this.f9255c.a(((zzrw) it.next()).f9258b));
            } catch (IOException e2) {
                zzbba.c("Error while writing hash to byteStream", e2);
            }
        }
        return ye0.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            String str = arrayList.get(i);
            i++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append(10);
        }
        return b(sb.toString());
    }
}
