# design-pattern
the UML diagrams and source code of Head First Design Patterns

# 设计模式
- 策略模式(strategy pattern)：定义了一系列算法族(如FlyBehavior、QuackBehavior)，分别将其封装起来，让它们之间可以相互替换。让算法的变化独立于使用算法的客户。
- 观察者模式(observer pattern)：在对象之间定义一对多的依赖，当一个对象改变状态，依赖它的对象都会收到通知，并自动完成更新操作。如Jbutton按钮。【抽象主体subject、具体主体concreteSubject、抽象观察者observer、具体观察者concreteObserver】
- 装饰者模式(decorator pattern)：动态地将责任附加到对象上。若要拓展功能，装饰者提供了比继承更具有弹性的替代方案。它在被装饰者的行为之前或之后，加上自己的行为，以达到特定的目的。如java.io中InputStream（抽象组件）、FileInputStream（抽象装饰者）和BufferedInputStream（具体装饰者）。【抽象组件component、具体组件concreteComponent、装饰者接口decorator、具体装饰者concreteDocoretor】
- 工厂模式【4个角色：抽象工厂Creator、具体工厂Concrete Creator、抽象产品Product、具体产品Concrete Product】
1. 简单工厂(simple factory pattern)：通过工厂类实现创建工厂的细节。其实不是一个设计模式。
2. 工厂方法模式(factory pattern)：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法让类把实例化推迟到子类。
2. 抽象工厂模式(abstract factory pattern)：提供一个接口，用于创建相关或依赖对象的家族，而不需要明确指定具体类。生产方法通过工厂方法实现。如spring IOC中的bean工厂（抽象工厂模式）。
- 单例模式(singleton pattern)：确保一个类只有一个实例，并提供一个全局访问入口。如数据库连接池、注册表设置对象。
- 多例模式(multiton pattern)：如数据库连接池中的数据库连接。
- 命令模式(command pattern)：将一个命令封装成一个对象，从而可以根据不同的请求（如队列、日志请求）对调用者进行参数化，也可实现误操作撤销和宕机恢复功能。应用于日志和事务系统。【三个组成部分：invoker、command 和concrete command、recerver】
- 适配器模式(adapter pattern)：将一个类的接口转换为客户期望的另一个接口，解耦客户与被适配者。【客户目标接口Target、适配器Adapter、被适配者Adaptee】
1. 对象适配器：利用组合的方式将请求传送给被适配者。如java.io中的inputStreamReader。
2. 类适配器：通过Adapter 多重继承Target 和Adaptee 实现适配。Java语法不支持。
- 外观模式(facade pattern)：即门面模式，提供一个统一的接口来处理子系统中的一群接口，与适配器类似。如MVC 中的service层。
- 模板方法模式(template pattern)：在一个模板方法定义一系列的算法步骤（包括具体方法、抽象方法、钩子）。可以使得在不改变算法结构的情况下，重新定义算法中的某些步骤。如集合的sort()
- 迭代器模式(iterator pattern)：提供一种方法按顺序访问一个聚合对象中的各个元素，而又不暴露其内部的表示。如Collection接口【聚合接口aggregate、具体聚合concreteAggregate、迭代器接口Iterator、具体迭代器concreteIterator】
- 组合模式:(composite pattern) 允许将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性，一视同仁。【组件接口component、组合composite、叶节点leaf】
- 状态模式(state pattern)：允许对象在内部状态改变时改变它的行为，对象看起来好像修改了它的类。【状态集合类Context、State接口、具体状态ConcreteState】
- 动态代理(proxy pattern)：为另一个对象提供一个替身或占位符以访问这个对象。如日志、事务处理等。
1. 远程代理：调用本地堆中代理对象的方法，会通过网络通信（如rmi、rpc）交由不同JVM 堆中的远程对象处理。
2. 虚拟代理：开销大的对象在创建前和创建中，由虚拟代理暂代。对象创建完后，代理就会将请求直接委托给对象。如图片加载过程。
3. 保护代理：基于调用者控制对对象方法的访问。如权限处理、spring aop等。
- 复合模式：结合两个及以上的模式，组成一个解决方案， 解决一再发生的一般性问题。如MVC、Model 2 模式。
1. MVC：模型使用观察者模式，控制器是视图的策略，视图使用组合模式实现界面。另外，也可通过适配器模式将新模型适配为旧模型，重用已有的视图和控制器。
2. Model 2：是MVC 在Web 上的应用。Servlet 充当控制器， JSP/HTML 充当视图。
- 桥接模式(bridge pattern): 将抽象部分与它的实现部分分离开来，使他们都可以独立改变。【抽象类Abstraction、扩充抽象类RefinedAbstraction、实现类接口Implementor、具体实现类ConcreteImplementor】
- 责任链模式(chain of responsibility pattern)：为请求创建了一个接收者的对象链，每个接收者都包含对另一个接收者的引用。每个对象依次检查此请求，并对其进行处理，或将其传给链中的下一个对象。如tomcat的过滤器Filter 和 struts的intercepter。

# 设计原则
- 多用组合，少用继承
- 针对接口编程，不针对实现编程
- 对象之间松耦合
- 开放-关闭原则：类应该对拓展开放，对修改关闭
- 依赖倒置原则：要依赖抽象，不要依赖具体类
- 最少知道原则：最大限度减少依赖类数目
- 好莱坞原则：高层组件决定什么时候调用低层组件
- 单一责任原则：尽量让类保持单一责任
