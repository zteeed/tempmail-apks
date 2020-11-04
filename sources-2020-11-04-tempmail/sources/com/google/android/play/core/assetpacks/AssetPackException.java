package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.y2.a;
import com.google.android.play.core.tasks.j;

public class AssetPackException extends j {
    AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", new Object[]{Integer.valueOf(i), a.a(i)}));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
