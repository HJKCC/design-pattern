package com.cc.iterator.concreteIterator;

import java.util.Iterator;

/**
 * @author chencheng0816@gmail.com
 * @date 2018/10/30 14:58
 * @Description ArrayIterator
 */
public class ArrayIterator<E> implements Iterator {
	private E[] elementData;
	private int position = 0;

	public ArrayIterator(E[] elementData) {
		this.elementData = elementData;
	}

	public boolean hasNext() {
		if (position >= elementData.length || elementData[position] == null) {
			return false;
		}
		return true;
	}

	public Object next() {
		return elementData[position++];
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
