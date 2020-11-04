package b.c.a.b.i.w;

import b.c.a.b.i.h;
import b.c.a.b.i.m;
import b.c.a.b.i.r;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import com.google.android.datatransport.runtime.synchronization.a;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import javax.inject.Inject;

/* compiled from: DefaultScheduler */
public class c implements e {

    /* renamed from: f  reason: collision with root package name */
    private static final Logger f2180f = Logger.getLogger(r.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final s f2181a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f2182b;

    /* renamed from: c  reason: collision with root package name */
    private final e f2183c;

    /* renamed from: d  reason: collision with root package name */
    private final b.c.a.b.i.w.j.c f2184d;

    /* renamed from: e  reason: collision with root package name */
    private final a f2185e;

    @Inject
    public c(Executor executor, e eVar, s sVar, b.c.a.b.i.w.j.c cVar, a aVar) {
        this.f2182b = executor;
        this.f2183c = eVar;
        this.f2181a = sVar;
        this.f2184d = cVar;
        this.f2185e = aVar;
    }

    static /* synthetic */ Object b(c cVar, m mVar, h hVar) {
        cVar.f2184d.z(mVar, hVar);
        cVar.f2181a.a(mVar, 1);
        return null;
    }

    static /* synthetic */ void c(c cVar, m mVar, b.c.a.b.h hVar, h hVar2) {
        try {
            com.google.android.datatransport.runtime.backends.m a2 = cVar.f2183c.a(mVar.b());
            if (a2 == null) {
                String format = String.format("Transport backend '%s' is not registered", new Object[]{mVar.b()});
                f2180f.warning(format);
                hVar.onSchedule(new IllegalArgumentException(format));
                return;
            }
            cVar.f2185e.a(b.a(cVar, mVar, a2.b(hVar2)));
            hVar.onSchedule((Exception) null);
        } catch (Exception e2) {
            Logger logger = f2180f;
            logger.warning("Error scheduling event " + e2.getMessage());
            hVar.onSchedule(e2);
        }
    }

    public void a(m mVar, h hVar, b.c.a.b.h hVar2) {
        this.f2182b.execute(a.a(this, mVar, hVar2, hVar));
    }
}
