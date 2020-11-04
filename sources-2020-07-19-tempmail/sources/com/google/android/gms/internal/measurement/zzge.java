package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.4.3 */
public final class zzge extends g1<String> implements zzgh, RandomAccess {

    /* renamed from: d  reason: collision with root package name */
    private static final zzge f9647d;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f9648c;

    static {
        zzge zzge = new zzge();
        f9647d = zzge;
        zzge.b();
    }

    public zzge() {
        this(10);
    }

    private static String h(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeg) {
            return ((zzeg) obj).y();
        }
        return zzfr.i((byte[]) obj);
    }

    public final void S(zzeg zzeg) {
        c();
        this.f9648c.add(zzeg);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.f9648c.add(i, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final void clear() {
        c();
        this.f9648c.clear();
        this.modCount++;
    }

    public final List<?> d() {
        return Collections.unmodifiableList(this.f9648c);
    }

    public final zzgh e() {
        return a() ? new zzii(this) : this;
    }

    public final /* synthetic */ zzfx f(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f9648c);
            return new zzge((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final Object g(int i) {
        return this.f9648c.get(i);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f9648c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzeg) {
            zzeg zzeg = (zzeg) obj;
            String y = zzeg.y();
            if (zzeg.A()) {
                this.f9648c.set(i, y);
            }
            return y;
        }
        byte[] bArr = (byte[]) obj;
        String i2 = zzfr.i(bArr);
        if (zzfr.h(bArr)) {
            this.f9648c.set(i, i2);
        }
        return i2;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return h(this.f9648c.set(i, (String) obj));
    }

    public final int size() {
        return this.f9648c.size();
    }

    public zzge(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof zzgh) {
            collection = ((zzgh) collection).d();
        }
        boolean addAll = this.f9648c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.f9648c.remove(i);
        this.modCount++;
        return h(remove);
    }

    private zzge(ArrayList<Object> arrayList) {
        this.f9648c = arrayList;
    }
}
