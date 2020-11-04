package a.p;

import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: ViewUtilsApi22 */
class g0 extends f0 {
    private static Method i;
    private static boolean j;

    g0() {
    }

    @SuppressLint({"PrivateApi"})
    private void l() {
        if (!j) {
            Class<View> cls = View.class;
            try {
                Method declaredMethod = cls.getDeclaredMethod("setLeftTopRightBottom", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                i = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i("ViewUtilsApi22", "Failed to retrieve setLeftTopRightBottom method", e2);
            }
            j = true;
        }
    }

    public void d(View view, int i2, int i3, int i4, int i5) {
        l();
        Method method = i;
        if (method != null) {
            try {
                method.invoke(view, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }
}
