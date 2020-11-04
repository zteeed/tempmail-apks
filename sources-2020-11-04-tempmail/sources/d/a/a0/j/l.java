package d.a.a0.j;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: HashMapSupplier */
public enum l implements Callable<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> Callable<Map<K, V>> f() {
        return INSTANCE;
    }

    /* renamed from: g */
    public Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}
