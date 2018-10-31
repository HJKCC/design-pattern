package com.cc.composite;

import com.cc.composite.composite.Folder;
import com.cc.composite.leaf.File;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 16:46
 * @Description 组合模式: 允许将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性，一视同仁。
 * 包括以下三部分：组件、组合、叶节点
 */
public class CompositeTest {
	public static void main(String[] args) {
		Folder folder1 = new Folder("folder1", "folder1");
		Folder folder2 = new Folder("folder 1.2", "folder 1.2");
		Folder folder3 = new Folder("folder3", "folder3");

		File file1 = new File("file 1.1", "11", "file 1.1");
		File file2 = new File("file 1.2", "22", "file 1.2");
		File file3 = new File("file 2.3", "123", "file 2.3");
		File file4 = new File("file 2.4", "142", "file 2.4");
		File file5 = new File("file 2.5", "67", "file 2.5");
		File file6 = new File("file 3.6", "78", "file 3.6");
		File file7 = new File("file 3.7", "709", "file 3.7");

		folder1.addComponent(folder2);
		folder1.addComponent(file1);
		folder1.addComponent(file2);

		folder2.addComponent(file3);
		folder2.addComponent(file4);
		folder2.addComponent(file5);
		folder2.addComponent(folder3);

		folder3.addComponent(file6);
		folder3.addComponent(file7);

		folder1.print("");
	}

}
