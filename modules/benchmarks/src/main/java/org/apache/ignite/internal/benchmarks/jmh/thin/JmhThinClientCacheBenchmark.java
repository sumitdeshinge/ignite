package org.apache.ignite.internal.benchmarks.jmh.thin;

import java.util.concurrent.ThreadLocalRandom;

import org.openjdk.jmh.annotations.Benchmark;

public class JmhThinClientCacheBenchmark extends JmhThinClientAbstractBenchmark {
    /**
     * Cache put benchmark.
     */
    @Benchmark
    public void put() {
        int key = ThreadLocalRandom.current().nextInt(CNT);

        cache.put(key, PAYLOAD);
    }

    /**
     * Cache get benchmark.
     */
    @Benchmark
    public Object get() {
        int key = ThreadLocalRandom.current().nextInt(CNT);

        return cache.get(key);
    }
}
