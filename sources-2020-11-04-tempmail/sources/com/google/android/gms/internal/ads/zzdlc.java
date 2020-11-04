package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzdlc {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public zzve f8352a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public zzvh f8353b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public zzxk f8354c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f8355d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public zzaaa f8356e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f8357f;
    /* access modifiers changed from: private */
    public ArrayList<String> g;
    /* access modifiers changed from: private */
    public ArrayList<String> h;
    /* access modifiers changed from: private */
    public zzadj i;
    /* access modifiers changed from: private */
    public zzvo j;
    /* access modifiers changed from: private */
    public PublisherAdViewOptions k;
    /* access modifiers changed from: private */
    public zzxe l;
    /* access modifiers changed from: private */
    public int m = 1;
    /* access modifiers changed from: private */
    public zzaio n;
    /* access modifiers changed from: private */
    public zzdkp o = new zzdkp();
    /* access modifiers changed from: private */
    public boolean p = false;

    public final zzdlc A(zzve zzve) {
        this.f8352a = zzve;
        return this;
    }

    public final zzvh E() {
        return this.f8353b;
    }

    public final zzve b() {
        return this.f8352a;
    }

    public final String c() {
        return this.f8355d;
    }

    public final zzdkp d() {
        return this.o;
    }

    public final zzdla e() {
        Preconditions.l(this.f8355d, "ad unit must not be null");
        Preconditions.l(this.f8353b, "ad size must not be null");
        Preconditions.l(this.f8352a, "ad request must not be null");
        return new zzdla(this);
    }

    public final zzdlc f(PublisherAdViewOptions publisherAdViewOptions) {
        this.k = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.f8357f = publisherAdViewOptions.getManualImpressionsEnabled();
            this.l = publisherAdViewOptions.zzju();
        }
        return this;
    }

    public final zzdlc g(zzadj zzadj) {
        this.i = zzadj;
        return this;
    }

    public final zzdlc h(zzaio zzaio) {
        this.n = zzaio;
        this.f8356e = new zzaaa(false, true, false);
        return this;
    }

    public final zzdlc i(zzvo zzvo) {
        this.j = zzvo;
        return this;
    }

    public final zzdlc k(boolean z) {
        this.p = z;
        return this;
    }

    public final zzdlc l(boolean z) {
        this.f8357f = z;
        return this;
    }

    public final zzdlc m(zzaaa zzaaa) {
        this.f8356e = zzaaa;
        return this;
    }

    public final zzdlc n(zzdla zzdla) {
        this.o.b(zzdla.n);
        this.f8352a = zzdla.f8349d;
        this.f8353b = zzdla.f8350e;
        this.f8354c = zzdla.f8346a;
        this.f8355d = zzdla.f8351f;
        this.f8356e = zzdla.f8347b;
        this.g = zzdla.g;
        this.h = zzdla.h;
        this.i = zzdla.i;
        this.j = zzdla.j;
        f(zzdla.l);
        this.p = zzdla.o;
        return this;
    }

    public final zzdlc o(zzxk zzxk) {
        this.f8354c = zzxk;
        return this;
    }

    public final zzdlc p(ArrayList<String> arrayList) {
        this.g = arrayList;
        return this;
    }

    public final zzdlc r(zzvh zzvh) {
        this.f8353b = zzvh;
        return this;
    }

    public final zzdlc s(ArrayList<String> arrayList) {
        this.h = arrayList;
        return this;
    }

    public final zzdlc v(int i2) {
        this.m = i2;
        return this;
    }

    public final zzdlc y(String str) {
        this.f8355d = str;
        return this;
    }
}
