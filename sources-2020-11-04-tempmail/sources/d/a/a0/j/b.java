package d.a.a0.j;

import d.a.z.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: ArrayListSupplier */
public enum b implements Callable<List<Object>>, n<Object, List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> g() {
        return INSTANCE;
    }

    public static <T, O> n<O, List<T>> h() {
        return INSTANCE;
    }

    /* renamed from: f */
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    /* renamed from: k */
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}
