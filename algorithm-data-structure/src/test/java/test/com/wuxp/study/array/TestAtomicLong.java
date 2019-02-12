package test.com.wuxp.study.array;

import sun.misc.Unsafe;
import sun.reflect.CallerSensitive;

import java.lang.reflect.Field;


public class TestAtomicLong {

    private Unsafe unsafe;

    private final long valueOffset;


    private volatile long value;

    public TestAtomicLong() {
        try {
            this.unsafe = this.getUnsafe();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        try {
            valueOffset = unsafe.objectFieldOffset
                    (TestAtomicLong.class.getDeclaredField("value"));
        } catch (Exception ex) {
            throw new Error(ex);
        }
    }

    /**
     * Atomically increments by one the current value.
     *
     * @return the updated value
     */

    public final long incrementAndGet() {
        long andAddLong = unsafe.getAndAddLong(this, valueOffset, 2L);
        return andAddLong + 2L;
    }

//    public final long incrementAndGet1() {
//        long andAddLong = unsafe.getAndAddLong(this, valueOffset, 1L);
//        return andAddLong + 1L;
//    }


    public Unsafe getUnsafe() throws Throwable {

        Class<?> unsafeClass = Unsafe.class;

        for (Field f : unsafeClass.getDeclaredFields()) {

            if ("theUnsafe".equals(f.getName())) {

                f.setAccessible(true);

                return (Unsafe) f.get(null);

            }

        }

        throw new IllegalAccessException("no declared field: theUnsafe");

    }


    public static void main(String[] args) throws Exception {
        TestAtomicLong testAtomicLong = new TestAtomicLong();

        Thread[] threads = new Thread[100];

        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(testAtomicLong::incrementAndGet);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        Thread.sleep(2000);
        testAtomicLong.incrementAndGet();
        System.out.println(testAtomicLong.value);

        long l = testAtomicLong.incrementAndGet();
        System.out.println(l);
    }
}
