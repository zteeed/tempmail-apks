package b.b;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

public class f {
    public static Map<String, String> a(Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put("size", String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            e.b("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }
}
