package a.q;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsApi19 */
class e0 extends h0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f532a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f533b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f534c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f535d;

    e0() {
    }

    private void h() {
        if (!f535d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f534c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f535d = true;
        }
    }

    private void i() {
        if (!f533b) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f532a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f533b = true;
        }
    }

    public void a(View view) {
    }

    public float b(View view) {
        h();
        Method method = f534c;
        if (method != null) {
            try {
                return ((Float) method.invoke(view, new Object[0])).floatValue();
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return super.b(view);
    }

    public void c(View view) {
    }

    public void e(View view, float f2) {
        i();
        Method method = f532a;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Float.valueOf(f2)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } else {
            view.setAlpha(f2);
        }
    }
}
