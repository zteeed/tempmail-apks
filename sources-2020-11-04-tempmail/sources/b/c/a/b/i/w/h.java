package b.c.a.b.i.w;

import android.content.Context;
import android.os.Build;
import b.c.a.b.i.w.j.c;
import b.c.a.b.i.x.a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import dagger.Module;
import dagger.Provides;

@Module
/* compiled from: SchedulingModule */
public abstract class h {
    @Provides
    static s a(Context context, c cVar, g gVar, a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new e(context, cVar, gVar);
        }
        return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(context, cVar, aVar, gVar);
    }
}
