package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;

@KeepForSdk
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* renamed from: c  reason: collision with root package name */
    private boolean f2939c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<Integer> f2940d;

    private final void j() {
        synchronized (this) {
            if (!this.f2939c) {
                int count = this.f2922b.getCount();
                ArrayList<Integer> arrayList = new ArrayList<>();
                this.f2940d = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String i = i();
                    String B = this.f2922b.B(i, 0, this.f2922b.G(0));
                    int i2 = 1;
                    while (i2 < count) {
                        int G = this.f2922b.G(i2);
                        String B2 = this.f2922b.B(i, i2, G);
                        if (B2 != null) {
                            if (!B2.equals(B)) {
                                this.f2940d.add(Integer.valueOf(i2));
                                B = B2;
                            }
                            i2++;
                        } else {
                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(i);
                            sb.append(", at row: ");
                            sb.append(i2);
                            sb.append(", for window: ");
                            sb.append(G);
                            throw new NullPointerException(sb.toString());
                        }
                    }
                }
                this.f2939c = true;
            }
        }
    }

    private final int l(int i) {
        if (i >= 0 && i < this.f2940d.size()) {
            return this.f2940d.get(i).intValue();
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(i);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public String c() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0063, code lost:
        if (r6.f2922b.B(r4, r7, r3) == null) goto L_0x0067;
     */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T get(int r7) {
        /*
            r6 = this;
            r6.j()
            int r0 = r6.l(r7)
            r1 = 0
            if (r7 < 0) goto L_0x0067
            java.util.ArrayList<java.lang.Integer> r2 = r6.f2940d
            int r2 = r2.size()
            if (r7 != r2) goto L_0x0013
            goto L_0x0067
        L_0x0013:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f2940d
            int r2 = r2.size()
            r3 = 1
            int r2 = r2 - r3
            if (r7 != r2) goto L_0x0030
            com.google.android.gms.common.data.DataHolder r2 = r6.f2922b
            int r2 = r2.getCount()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f2940d
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            goto L_0x004a
        L_0x0030:
            java.util.ArrayList<java.lang.Integer> r2 = r6.f2940d
            int r4 = r7 + 1
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.ArrayList<java.lang.Integer> r4 = r6.f2940d
            java.lang.Object r4 = r4.get(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
        L_0x004a:
            int r2 = r2 - r4
            if (r2 != r3) goto L_0x0066
            int r7 = r6.l(r7)
            com.google.android.gms.common.data.DataHolder r3 = r6.f2922b
            int r3 = r3.G(r7)
            java.lang.String r4 = r6.c()
            if (r4 == 0) goto L_0x0066
            com.google.android.gms.common.data.DataHolder r5 = r6.f2922b
            java.lang.String r7 = r5.B(r4, r7, r3)
            if (r7 != 0) goto L_0x0066
            goto L_0x0067
        L_0x0066:
            r1 = r2
        L_0x0067:
            java.lang.Object r7 = r6.h(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.EntityBuffer.get(int):java.lang.Object");
    }

    @KeepForSdk
    public int getCount() {
        j();
        return this.f2940d.size();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract T h(int i, int i2);

    /* access modifiers changed from: protected */
    @KeepForSdk
    public abstract String i();
}
