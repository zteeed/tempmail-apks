package com.google.android.play.core.install;

import com.google.android.play.core.install.d.a;
import com.google.android.play.core.tasks.j;

public class InstallException extends j {
    public InstallException(int i) {
        super(String.format("Install Error(%d): %s", new Object[]{Integer.valueOf(i), a.a(i)}));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
