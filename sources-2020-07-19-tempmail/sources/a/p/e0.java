package a.p;

import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsApi19 */
class e0 extends h0 {

    /* renamed from: a  reason: collision with root package name */
    private static Method f528a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f529b;

    /* renamed from: c  reason: collision with root package name */
    private static Method f530c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f531d;

    e0() {
    }

    private void h() {
        if (!f531d) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod("getTransitionAlpha", new Class[0]);
                f530c = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve getTransitionAlpha method", e2);
            }
            f531d = true;
        }
    }

    private void i() {
        if (!f529b) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setTransitionAlpha", new Class[]{Float.TYPE});
                f528a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi19", "Failed to retrieve setTransitionAlpha method", e2);
            }
            f529b = true;
        }
    }

    public void a(View view) {
    }

    public float b(View view) {
        h();
        Method method = f530c;
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
        Method method = f528a;
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
