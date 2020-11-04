package b.c.a.b.i.y;

import android.util.SparseArray;
import b.c.a.b.d;
import java.util.EnumMap;

/* compiled from: PriorityMapping */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static SparseArray<d> f2263a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private static EnumMap<d, Integer> f2264b;

    static {
        EnumMap<d, Integer> enumMap = new EnumMap<>(d.class);
        f2264b = enumMap;
        enumMap.put(d.DEFAULT, 0);
        f2264b.put(d.VERY_LOW, 1);
        f2264b.put(d.HIGHEST, 2);
        for (d next : f2264b.keySet()) {
            f2263a.append(f2264b.get(next).intValue(), next);
        }
    }

    public static int a(d dVar) {
        Integer num = f2264b.get(dVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + dVar);
    }

    public static d b(int i) {
        d dVar = f2263a.get(i);
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
