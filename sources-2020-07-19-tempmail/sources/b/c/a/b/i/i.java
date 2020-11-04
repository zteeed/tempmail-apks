package b.c.a.b.i;

import dagger.Module;
import dagger.Provides;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import javax.inject.Singleton;

@Module
/* compiled from: ExecutionModule */
abstract class i {
    @Singleton
    @Provides
    static Executor a() {
        return new k(Executors.newSingleThreadExecutor());
    }
}
