package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
final class y70 {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<zzeer> f5360a;

    private y70() {
        this.f5360a = new ArrayDeque<>();
    }

    private final void b(zzeer zzeer) {
        while (!zzeer.A()) {
            if (zzeer instanceof w70) {
                w70 w70 = (w70) zzeer;
                b(w70.f5193f);
                zzeer = w70.g;
            } else {
                String valueOf = String.valueOf(zzeer.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        int d2 = d(zzeer.size());
        int b0 = w70.b0(d2 + 1);
        if (this.f5360a.isEmpty() || this.f5360a.peek().size() >= b0) {
            this.f5360a.push(zzeer);
            return;
        }
        int b02 = w70.b0(d2);
        zzeer pop = this.f5360a.pop();
        while (!this.f5360a.isEmpty() && this.f5360a.peek().size() < b02) {
            pop = new w70(this.f5360a.pop(), pop, (v70) null);
        }
        w70 w702 = new w70(pop, zzeer, (v70) null);
        while (!this.f5360a.isEmpty() && this.f5360a.peek().size() < w70.b0(d(w702.size()) + 1)) {
            w702 = new w70(this.f5360a.pop(), w702, (v70) null);
        }
        this.f5360a.push(w702);
    }

    /* access modifiers changed from: private */
    public final zzeer c(zzeer zzeer, zzeer zzeer2) {
        b(zzeer);
        b(zzeer2);
        zzeer pop = this.f5360a.pop();
        while (!this.f5360a.isEmpty()) {
            pop = new w70(this.f5360a.pop(), pop, (v70) null);
        }
        return pop;
    }

    private static int d(int i) {
        int binarySearch = Arrays.binarySearch(w70.j, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }

    /* synthetic */ y70(v70 v70) {
        this();
    }
}
