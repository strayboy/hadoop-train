package com.imooc.bigdata.hadoop.mr.project.utils;

import org.junit.Test;

public class IPTest {

    @Test
    public void testIp() {
        IPParser.RegionInfo regionInfo = IPParser.getInstance().analyseIp("61.135.169.81");
        System.out.println(regionInfo.getCountry());
        System.out.println(regionInfo.getProvince());
        System.out.println(regionInfo.getCity());
    }
}
