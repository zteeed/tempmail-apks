package a.q;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsApi21 */
class f0 extends e0 {

    /* renamed from: e  reason: collision with root package name */
    private static Method f536e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f537f;
    private static Method g;
    private static boolean h;

    f0() {
    }

    private void j() {
        if (!f537f) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToGlobal", new Class[]{Matrix.class});
                f536e = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToGlobal method", e2);
            }
            f537f = true;
        }
    }

    private void k() {
        if (!h) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("transformMatrixToLocal", new Class[]{Matrix.class});
                g = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi21", "Failed to retrieve transformMatrixToLocal method", e2);
            }
            h = true;
        }
    }

    public void f(View view, Matrix matrix) {
        j();
        Method method = f536e;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void g(View view, Matrix matrix) {
        k();
        Method method = g;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{matrix});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
