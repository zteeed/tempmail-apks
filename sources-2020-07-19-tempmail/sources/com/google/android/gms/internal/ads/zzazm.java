package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzazm {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f6073a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f6074b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f6075c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f6076d;

    /* renamed from: e  reason: collision with root package name */
    private int f6077e;

    private zzazm(zzazn zzazn) {
        int size = zzazn.f6079b.size();
        this.f6073a = (String[]) zzazn.f6078a.toArray(new String[size]);
        this.f6074b = b(zzazn.f6079b);
        this.f6075c = b(zzazn.f6080c);
        this.f6076d = new int[size];
        this.f6077e = 0;
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
        this.f6077e++;
        int i = 0;
        while (true) {
            double[] dArr = this.f6075c;
            if (i < dArr.length) {
                if (dArr[i] <= d2 && d2 < this.f6074b[i]) {
                    int[] iArr = this.f6076d;
                    iArr[i] = iArr[i] + 1;
                }
                if (d2 >= this.f6075c[i]) {
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
        ArrayList arrayList = new ArrayList(this.f6073a.length);
        int i = 0;
        while (true) {
            String[] strArr = this.f6073a;
            if (i >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i];
            double d2 = this.f6075c[i];
            double d3 = this.f6074b[i];
            int[] iArr = this.f6076d;
            arrayList.add(new zzazo(str, d2, d3, ((double) iArr[i]) / ((double) this.f6077e), iArr[i]));
            i++;
        }
    }
}
