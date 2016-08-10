package itonics;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by tbeauvais on 7/7/16.
 */
public final class IdUtils {
    private static AtomicLong lastMillis = new AtomicLong(System.currentTimeMillis());

    public static long getUniqueMillis() {
        synchronized (lastMillis) {
            long now = System.currentTimeMillis();

            while (true) {
                final long lastTime = lastMillis.get();
                if (lastTime >= now) {
                    now = lastTime + 1;
                }

                if (lastMillis.compareAndSet(lastTime, now)) {
                    return now;
                }
            }
        }
    }
}
