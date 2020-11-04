package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazm {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f6256a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f6257b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f6258c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f6259d;

    /* renamed from: e  reason: collision with root package name */
    private int f6260e;

    private zzazm(zzazn zzazn) {
        int size = zzazn.f6262b.size();
        this.f6256a = (String[]) zzazn.f6261a.toArray(new String[size]);
        this.f6257b = b(zzazn.f6262b);
        this.f6258c = b(zzazn.f6263c);
        this.f6259d = new int[size];
        this.f6260e = 0;
    }

    private static double[] b(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get(i).doubleValue();
        }
        return dArr;
    }

    public final void a(double d2) {
        this.f6260e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f6258c;
            if (i < dArr.length) {
                if (dArr[i] <= d2 && d2 < this.f6257b[i]) {
                    int[] iArr = this.f6259d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d2 >= this.f6258c[i]) {
                    i++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final List<zzazo> c() {
        ArrayList arrayList = new ArrayList(this.f6256a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f6256a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d2 = this.f6258c[i];
            double d3 = this.f6257b[i];
            int[] iArr = this.f6259d;
            arrayList.add(new zzazo(str, d2, d3, ((double) iArr[i]) / ((double) this.f6260e), iArr[i]));
            i++;
        }
    }
}
