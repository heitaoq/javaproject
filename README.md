# javaproject
javaproject

1：RunBenchmarkToolServerTimes (java program run command on Linux Server) 控制台指定输入参数并发的执行HDFS读和写

使用方法： java -jar javaproject.jar 10 read ec raid 10为并发客户端的数量 read为HDFS的读文件,也就是get ec：采用ErasureCode来进行容错 raid：HDFS上已经存在的文件的名字, 比如ec-

raid.img, 只要输入raid就可以, ec-new-java.img 只要输入 new-java就可以 如果是写的话,命令如下 java -jar javaproject.jar 10 write non-ec xxx 写的话,后面的3个参数其实无所谓,只要有

就可以,但是不能和读一样

2：BlockQueue 阻塞队列的实现

UseBlockQueue 多个线程使用阻塞队列,并且先后有序

指定哪一个类运行, 在META-INF里面的MANIFEST.MF里面进行设置你要执行的类

Manifest-Version: 1.0 Main-Class: UseBlockQueue
