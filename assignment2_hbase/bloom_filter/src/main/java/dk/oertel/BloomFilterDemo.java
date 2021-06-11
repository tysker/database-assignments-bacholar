package dk.oertel;

// Java program to implement
// Bloom Filter using Guava Library

import java.nio.charset.Charset;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class BloomFilterDemo {


    // reference https://www.geeksforgeeks.org/bloom-filter-in-java-with-examples/
    public static void main(String[] args)
    {

        // Create a Bloom Filter instance
        BloomFilter<String> blackListedIps
                = BloomFilter.create(
                Funnels.stringFunnel(
                        Charset.forName("UTF-8")),
                10000);

        // Add the data sets
        blackListedIps.put("192.170.0.1");
        blackListedIps.put("75.245.10.1");
        blackListedIps.put("10.125.22.20");

        // Test the bloom filter
        System.out.println(
                blackListedIps
                        .mightContain(
                                "75.245.10.1"));
        System.out.println(
                blackListedIps
                        .mightContain(
                                "101.125.20.22"));
    }
}
