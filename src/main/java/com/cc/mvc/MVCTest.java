package com.cc.mvc;

import com.cc.mvc.controller.QuickDecreaseController;
import com.cc.mvc.controller.QuickIncreaseController;
import com.cc.mvc.controller.SlowDecreaseController;
import com.cc.mvc.controller.SlowIncreaseController;
import com.cc.mvc.model.ModelSubject;
import com.cc.mvc.view.ViewButton;
import com.cc.mvc.view.ViewComponent;
import com.cc.mvc.view.ViewComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/11/7 20:02
 * @Description 模型使用观察者模式，控制器是视图的策略，视图使用组合模式实现界面
 */
public class MVCTest {
	public static void main(String[] args) {
		List<ViewComponent> observers = new ArrayList<ViewComponent>();
		ModelSubject modelSubject = new ModelSubject(3, observers);

		SlowDecreaseController slowDecreaseController = new SlowDecreaseController(modelSubject);
		SlowIncreaseController slowIncreaseController = new SlowIncreaseController(modelSubject);
		QuickIncreaseController quickIncreaseController = new QuickIncreaseController(modelSubject);
		QuickDecreaseController quickDecreaseController = new QuickDecreaseController(modelSubject);

		ViewButton slowDecreaseButton = new ViewButton("slowDecreaseButton", "slowDecreaseButton", slowDecreaseController);
		ViewButton slowIncreaseButton = new ViewButton("slowIncreaseButton", "slowIncreaseButton", slowIncreaseController);
		ViewButton quickIncreaseButton = new ViewButton("quickIncreaseButton", "quickIncreaseButton", quickIncreaseController);
		ViewButton quickDecreaseButton = new ViewButton("quickDecreaseButton", "quickDecreaseButton", quickDecreaseController);

		List<ViewComponent> componentList = new ArrayList<ViewComponent>();
		componentList.add(slowDecreaseButton);
		componentList.add(slowIncreaseButton);
		componentList.add(quickIncreaseButton);
		componentList.add(quickDecreaseButton);

		ViewComposite speedometer = new ViewComposite("speedometer", componentList);
		modelSubject.registerObserver(speedometer);

		slowDecreaseButton.click();
		slowIncreaseButton.click();

	}
}
