package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: com.android.billingclient:billing@@3.0.0 */
public class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public String f2504a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f2505b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public String f2506c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f2507d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String f2508e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f2509f;
    /* access modifiers changed from: private */
    public ArrayList<n> g;
    /* access modifiers changed from: private */
    public boolean h;

    /* compiled from: com.android.billingclient:billing@@3.0.0 */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f2510a;

        /* renamed from: b  reason: collision with root package name */
        private String f2511b;

        /* renamed from: c  reason: collision with root package name */
        private String f2512c;

        /* renamed from: d  reason: collision with root package name */
        private String f2513d;

        /* renamed from: e  reason: collision with root package name */
        private int f2514e;

        /* renamed from: f  reason: collision with root package name */
        private ArrayList<n> f2515f;
        private boolean g;

        private a() {
            this.f2514e = 0;
        }

        public f a() {
            ArrayList<n> arrayList = this.f2515f;
            if (arrayList == null || arrayList.isEmpty()) {
                throw new IllegalArgumentException("SkuDetails must be provided.");
            }
            ArrayList<n> arrayList2 = this.f2515f;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                n nVar = arrayList2.get(i2);
                i2++;
                if (nVar == null) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
            }
            if (this.f2515f.size() > 1) {
                n nVar2 = this.f2515f.get(0);
                String g2 = nVar2.g();
                ArrayList<n> arrayList3 = this.f2515f;
                int size2 = arrayList3.size();
                int i3 = 0;
                while (i3 < size2) {
                    n nVar3 = arrayList3.get(i3);
                    i3++;
                    if (!g2.equals(nVar3.g())) {
                        throw new IllegalArgumentException("SKUs should have the same type.");
                    }
                }
                String h = nVar2.h();
                if (TextUtils.isEmpty(h)) {
                    ArrayList<n> arrayList4 = this.f2515f;
                    int size3 = arrayList4.size();
                    while (i < size3) {
                        n nVar4 = arrayList4.get(i);
                        i++;
                        if (!TextUtils.isEmpty(nVar4.h())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                } else {
                    ArrayList<n> arrayList5 = this.f2515f;
                    int size4 = arrayList5.size();
                    while (i < size4) {
                        n nVar5 = arrayList5.get(i);
                        i++;
                        if (!h.equals(nVar5.h())) {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
            }
            f fVar = new f();
            String unused = fVar.f2504a = null;
            String unused2 = fVar.f2505b = this.f2510a;
            String unused3 = fVar.f2508e = this.f2513d;
            String unused4 = fVar.f2506c = this.f2511b;
            String unused5 = fVar.f2507d = this.f2512c;
            int unused6 = fVar.f2509f = this.f2514e;
            ArrayList unused7 = fVar.g = this.f2515f;
            boolean unused8 = fVar.h = this.g;
            return fVar;
        }

        public a b(n nVar) {
            ArrayList<n> arrayList = new ArrayList<>();
            arrayList.add(nVar);
            this.f2515f = arrayList;
            return this;
        }
    }

    private f() {
        this.f2509f = 0;
    }

    public static a f() {
        return new a();
    }

    public String a() {
        return this.f2506c;
    }

    public String b() {
        return this.f2507d;
    }

    public int c() {
        return this.f2509f;
    }

    public String d() {
        return this.g.get(0).f();
    }

    public boolean e() {
        return this.h;
    }

    public final ArrayList<n> i() {
        ArrayList<n> arrayList = new ArrayList<>();
        arrayList.addAll(this.g);
        return arrayList;
    }

    public final String l() {
        return this.f2505b;
    }

    /* access modifiers changed from: package-private */
    public final boolean o() {
        boolean z;
        ArrayList<n> arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            n nVar = arrayList.get(i);
            i++;
            if (nVar.h().isEmpty()) {
                z = false;
                break;
            }
        }
        return (!this.h && this.f2505b == null && this.f2504a == null && this.f2508e == null && this.f2509f == 0 && !z) ? false : true;
    }

    public final String p() {
        return this.f2508e;
    }

    /* access modifiers changed from: package-private */
    public final String r() {
        return this.f2504a;
    }
}
