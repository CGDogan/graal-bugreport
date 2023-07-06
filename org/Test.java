package org;

import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;


public class Test {
    public static void main(String[] args) throws Exception {
            System.out.println("Start");
            ImageInputStream stream = new MemoryCacheImageInputStream(new BufferedInputStream(new FileInputStream(
                "test.png"), 81920));
            System.out.println(stream.readBit());
            System.out.println("End");
    }
}
