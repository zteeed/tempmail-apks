package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.2.0 */
public final class zzelf<T> implements zzela<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<zzelj<T>> f8840a;

    /* renamed from: b  reason: collision with root package name */
    private final List<zzelj<Collection<T>>> f8841b;

    static {
        zzekz.a(Collections.emptySet());
    }

    private zzelf(List<zzelj<T>> list, List<zzelj<Collection<T>>> list2) {
        this.f8840a = list;
        this.f8841b = list2;
    }

    public static <T> zzelh<T> a(int i, int i2) {
        return new zzelh<>(i, i2);
    }

    public final /* synthetic */ Object get() {
        int size = this.f8840a.size();
        ArrayList arrayList = new ArrayList(this.f8841b.size());
        int size2 = this.f8841b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f8841b.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet b2 = zzekv.b(size);
        int size3 = this.f8840a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj = this.f8840a.get(i2).get();
            zzelg.a(obj);
            b2.add(obj);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                zzelg.a(next);
                b2.add(next);
            }
        }
        return Collections.unmodifiableSet(b2);
    }
}
