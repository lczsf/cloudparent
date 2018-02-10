1、集群启动server
2、zuul，token校验等控制访问
3、product服务提供---controller
4、hystrix消费 --访问第三方


git clone https://github.com/lczsf/cloudparent.git

1、生成key
ssh-keygen -t rsa -C "xxx@xx.com"
回车，随便填一个key的名字
再回车两次

2、将key添加到github中

3、编辑.git/config
url = ssh://git@github.com/lczsf/cloudparent.git