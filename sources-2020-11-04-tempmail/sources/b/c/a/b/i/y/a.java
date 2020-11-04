package b.c.a.b.i.y;

import android.util.SparseArray;
import b.c.a.b.d;
import java.util.EnumMap;

/* compiled from: PriorityMapping */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f2361a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static EnumMap<d, Integer> f2362b;

    static {
        EnumMap<d, Integer> enumMap = new EnumMap<>(d.class);
        f2362b = enumMap;
        enumMap.put(d.DEFAULT, 0);
        f2362b.put(d.VERY_LOW, 1);
        f2362b.put(d.HIGHEST, 2);
        for (d next : f2362b.keySet()) {
            f2361a.append(f2362b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f2362b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = f2361a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
