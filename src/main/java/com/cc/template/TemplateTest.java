package com.cc.template;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/27 19:27
 * @Description TemplateTest
 */
public class TemplateTest {
	public static void main(String[] args) {
		AbstractClass abstractClass = new ConcreteClass1(true);
		abstractClass.templateMethod();

		abstractClass = new ConcreteClass2(false);
		abstractClass.templateMethod();
	}
}
