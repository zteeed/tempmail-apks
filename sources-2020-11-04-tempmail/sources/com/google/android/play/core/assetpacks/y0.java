package com.google.android.play.core.assetpacks;

import java.util.HashMap;
import java.util.Map;

final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Double> f11461a = new HashMap();

    y0() {
    }

    /* access modifiers changed from: package-private */
    public final synchronized double a(String str, o1 o1Var) {
        double d2;
        d2 = 1.0d;
        if (o1Var instanceof s0) {
            d2 = (((double) ((s0) o1Var).g) + 1.0d) / ((double) ((s0) o1Var).h);
        }
        this.f11461a.put(str, Double.valueOf(d2));
        return d2;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void b(String str) {
        this.f11461a.put(str, Double.valueOf(0.0d));
    }

    /* access modifiers changed from: package-private */
    public final synchronized double c(String str) {
        Double d2 = this.f11461a.get(str);
        if (d2 == null) {
            return 0.0d;
        }
        return d2.doubleValue();
    }
}
