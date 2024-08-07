## 数据库基础


### 假如有一张表, 其中有一列是 id, 有一些数据 id 是重复的, 写一个 sql 把重复的 id 找出来
```sql


```

### 在什么情况下索引会失效
1. where条件中没有用索引列
2. 对索引列进行函数操作 (字符串操作 / 日期操作)
3. 对索引列进行类型转换
4. 使用like查询的查询字符串以通配符开头, 因为通配符在开头, 无法进行最左匹配
5. where中有or的时候
6. 查询大量数据, MySQL默认使用索引意义不大














--- 


### 为什么 MySQL 索引底层用 b+树, 而不用 b树
b+树可以看作是b树的一种优化,
1. b+树的所有数据都存在叶子节点, 非叶子节点只存储索引, 意味着每一层能存储的索引更多, 更快的查找到索引
2. 叶子节点的数据使用双向链表的方式进行关联



### 为什么索引底层用B+树实现, 而不用红黑二叉树
1. 数据库数据量大的话会导致索引也很大, 因此需要将索引存储在磁盘, 磁盘的io操作效率很低, 所以要尽可能减少磁盘io次数,
   同样节点的树, 构建出B+树的高度要低于红黑二叉树, 也就意味着能用更少的读取次数查询到我们想要的数据
2. b+树有一个特点是相邻的数据在物理上也是相邻的, 那么每次我们去检索信息的时候, 一次io就能载入目标信息和相邻的信息,
   红黑树不具备这个特征, 可能数据相邻的信息在物理存储上差距很大


### 慢查询的问题



### 日常工作中时怎么优化SQL的
1. 加索引, 选择合适的列, 避免导致索引失效的操作: like, 函数等
2. 减少不必要的返回列
3. 根据分析器优化SQL结构, 是否全表扫描, 避免子查询
4. 分库分表, 在单表数据量较大或者并发连接数过高的情况下
5. 读写分离, 保证写数据库承载更小的压力



### Redis 和 MySQL 如何保证数据一致性
1. 先更新数据库, 再更新缓存
2. 先删除缓存, 再更新数据库
3. 添加RocketMQ, 把失败的请求写入MQ事务消息, 再重新发送请求
4. 使用Canal组件, 监控MySQL中的binlog日志, 把更新后的数据, 同步到redis里面