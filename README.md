# design-pattern
the UML diagrams and source code of Head First Design Patterns

# 设计模式
- 策略模式：定义了一系列算法族(如FlyBehavior、QuackBehavior)，分别将其封装起来，让它们之间可以相互替换。让算法的变化独立于使用算法的客户。
- 观察者模式：在对象之间定义一对多的依赖，当一个对象改变状态，依赖它的对象都会收到通知，并自动完成更新操作。如Jbutton按钮。
- 装饰者模式：动态地将责任附加到对象上。若要拓展功能，装饰者提供了比继承更具有弹性的替代方案。它在被装饰者的行为之前或之后，加上自己的行为，以达到特定的目的。如java.io中InputStream（抽象组件）、FileInputStream（抽象装饰者）和BufferedInputStream（具体装饰者）。
- 工厂模式【4个角色：抽象工厂Creator、具体工厂Concrete Creator、抽象产品Product、具体产品Concrete Product】
1. 简单工厂：通过工厂类实现创建工厂的细节。其实不是一个设计模式。
2. 工厂方法模式：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
2. 抽象工厂模式：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。生产方法通过工厂方法实现。如spring IOC中的bean工厂（抽象工厂模式）。
- 单例模式：确保一个类只有一个实例，并提供一个全局访问入口。如数据库连接池、注册表设置对象。
- 命令模式：将一个命令封装成一个对象，从而可以根据不同的请求（如队列、日志请求）对调用者进行参数化，也可实现误操作撤销和宕机恢复功能。应用于日志和事务系统。【三个组成部分：invoker、command 和concrete command、recerver】
- 适配器模式：将一个类的接口转换为客户期望的另一个接口，解耦客户与被适配者。【客户Client、客户接口Target、适配器Adapter、被适配者Adaptee】
1. 对象适配器：利用组合的方式将请求传送给被适配者。
2. 类适配器：通过Adapter 多重继承Target 和Adaptee 实现适配。Java语法不支持。
- 外观模式：即门面模式，提供一个统一的接口来处理子系统中的一群接口。如MVC 中的service层
- 动态代理：如日志、事务处理等。
- 多例模式：如数据库连接池中的数据库连接。
- 责任链模式：如tomcat的过滤器Filter 和 struts的intercepter。
- 桥接模式：
- 适配器模式：如java.io中的inputStreamReader。

# 设计原则
- 多用组合，少用继承
- 针对接口编程，不针对实现编程
- 对象之间松耦合
- 开放-关闭原则：类应该对拓展开放，对修改关闭
- 依赖倒置原则：要依赖抽象，不要依赖具体类
- 最少知识原则：最大限度减少依赖类数目
