为达到统一使用slf4j & logback的目的，必须要做4件事：

1. 引入slf4j & logback日志包和slf4j -> logback桥接器；
2. 排除common-logging、log4j、log4j2日志包；
3. 引入jdk-logging -> slf4j、common-logging -> slf4j、log4j -> slf4j、log4j2 -> slf4j桥接器；
4. 排除slf4j -> jdk-logging、slf4j -> common-logging、slf4j -> log4j、slf4j -> log4j2桥接器。

ps：log4j2桥接器由log4j2提供，其他桥接器由slf4j提供。

如果再严谨一点，还要排除掉slf4j-simple、slf4j-nop两个框架，不过这两个一般没人用。

上述提到了这么多日志系统的桥接器，但似乎没有提到logback -> slf4j的桥接器，如果我们日志实现系统选择log4j2，怎么处理logback？

其实logback在设计上，天生绑定sfl4j，可以认为从根源上避免了直接被使用，自然也不需要logbak -> slf4j的桥接器。
