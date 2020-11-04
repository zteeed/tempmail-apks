package a.q;

import android.util.Log;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtilsApi18 */
class z {

    /* renamed from: a  reason: collision with root package name */
    private static Method f601a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f602b;

    private static void a() {
        if (!f602b) {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("suppressLayout", new Class[]{Boolean.TYPE});
                f601a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi18", "Failed to retrieve suppressLayout method", e2);
            }
            f602b = true;
        }
    }

    static void b(ViewGroup viewGroup, boolean z) {
        a();
        Method method = f601a;
        if (method != null) {
            try {
                method.invoke(viewGroup, new Object[]{Boolean.valueOf(z)});
            } catch (IllegalAccessException e2) {
                Log.i("ViewUtilsApi18", "Failed to invoke suppressLayout method", e2);
            } catch (InvocationTargetException e3) {
                Log.i("ViewUtilsApi18", "Error invoking suppressLayout method", e3);
            }
        }
    }
}
