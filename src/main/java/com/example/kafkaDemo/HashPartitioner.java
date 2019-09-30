package com.example.kafkaDemo;

import java.util.Map;

import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

public class HashPartitioner implements Partitioner {

    @Override
    public void configure(Map<String, ?> arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void close() {
        // TODO Auto-generated method stub

    }

    @Override
    public int partition(String topic, Object key, byte[] keyBytes, Object value, byte[] valueBytes, Cluster cluster) {

        Integer nums = cluster.partitionCountForTopic(topic);
        System.out.println(nums);
        return 0;
    }

}
