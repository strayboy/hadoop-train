统计页面的浏览量
    select count(1) from xxx;
    一行纪录做成一个固定的KEY，value赋值为1

统计各个省份的流量
    select province count(1) from xxx group by province
    地市信息 <= IP解析 <= IP如何转换城市信息
    ip解析：收费

统计页面的访问量
    把符合规则的pageID获取到，然后进行统计即可

 ======>存在的问题：
        每个MR作业都去全量读取待处理的原始日志，如果数据量很大，处理失败

ETL：
    全量的原始数据不方便进行计算，需要做一步处理进行相应的维度统计分析
    解析需要的数据：ip ==》 城市信息
    去除不需要的字段
    ip/time/url/page_id/coutry/province/city

大数据处理完以后的数据存储在HDFS上，再进一步，使用技术或者框架吧处理完的结果导出到数据库中
Sqoop：把HDFS上的统计结果导出到MySQL中