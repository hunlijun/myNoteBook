## 安装mysql

***

1、下载mysql ：https://dev.mysql.com/downloads/mysql/

2、打开刚刚解压的文件夹 **C:\web\mysql-8.0.11** ，在该文件夹下创建 **my.ini** 配置文件，编辑 **my.ini** 配置以下基本信息：

```properties
[mysql]
# 设置mysql客户端默认字符集
default-character-set=utf8
 
[mysqld]
# 设置3306端口
port = 3306
# 设置mysql的安装目录
basedir=C:\\web\\mysql-8.0.11
# 设置 mysql数据库的数据的存放目录，MySQL 8+ 不需要以下配置，系统自己生成即可，否则有可能报错
# datadir=C:\\web\\sqldata
# 允许最大连接数
max_connections=20
# 服务端使用的字符集默认为8比特编码的latin1字符集
character-set-server=utf8
# 创建新表时将使用的默认存储引擎
default-storage-engine=INNODB
```

3、启动mysql数据库

以管理员身份打开 cmd 命令行工具，切换目录到mysql的bin目录下，初始化数据库

```sql
mysqld --initialize --console
```

执行完成后，会输出 root 用户的初始默认密码

输入以下安装命令：

```sql
mysqld install
```

启动输入以下命令即可：

```sql
net start mysql
```

