package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.2.0 */
public final class zzegt extends m50<String> implements zzegw, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final zzegt f8582d;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f8583c;

    static {
        zzegt zzegt = new zzegt();
        f8582d = zzegt;
        zzegt.k();
    }

    public zzegt() {
        this(10);
    }

    private static String h(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeer) {
            return ((zzeer) obj).u();
        }
        return zzegd.j((byte[]) obj);
    }

    public final List<?> E() {
        return Collections.unmodifiableList(this.f8583c);
    }

    public final zzegw H() {
        return p() ? new zzeje(this) : this;
    }

    public final Object I(int i) {
        return this.f8583c.get(i);
    }

    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.f8583c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        c();
        this.f8583c.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f8583c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeer) {
            zzeer zzeer = (zzeer) obj;
            String u = zzeer.u();
            if (zzeer.v()) {
                this.f8583c.set(i, u);
            }
            return u;
        }
        byte[] bArr = (byte[]) obj;
        String j = zzegd.j(bArr);
        if (zzegd.i(bArr)) {
            this.f8583c.set(i, j);
        }
        return j;
    }

    public final void n(zzeer zzeer) {
        c();
        this.f8583c.add(zzeer);
        this.modCount++;
    }

    public final /* synthetic */ zzegm r(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f8583c);
            return new zzegt((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return h(this.f8583c.set(i, (String) obj));
    }

    public final int size() {
        return this.f8583c.size();
    }

    public zzegt(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof zzegw) {
            collection = ((zzegw) collection).E();
        }
        boolean addAll = this.f8583c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.f8583c.remove(i);
        this.modCount++;
        return h(remove);
    }

    private zzegt(ArrayList<Object> arrayList) {
        this.f8583c = arrayList;
    }
}
