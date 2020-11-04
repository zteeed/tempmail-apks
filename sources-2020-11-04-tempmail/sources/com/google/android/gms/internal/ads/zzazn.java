package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazn {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final List<String> f6261a = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final List<Double> f6262b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final List<Double> f6263c = new ArrayList();

    public final zzazn a(String str, double d2, double d3) {
        int i = 0;
        while (i < this.f6261a.size()) {
            double doubleValue = this.f6263c.get(i).doubleValue();
            double doubleValue2 = this.f6262b.get(i).doubleValue();
            if (d2 < doubleValue || (doubleValue == d2 && d3 < doubleValue2)) {
                break;
            }
            i++;
        }
        this.f6261a.add(i, str);
        this.f6263c.add(i, Double.valueOf(d2));
        this.f6262b.add(i, Double.valueOf(d3));
        return this;
    }

    public final zzazm e() {
        return new zzazm(this);
    }
}
