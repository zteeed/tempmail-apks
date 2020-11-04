package a.h.k;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat */
public final class i {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
