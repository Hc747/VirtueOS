/**
 * Copyright (c) 2015 Kyle Friz & Kayla Friz
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.sean.shared.network.game.event.impl;

import com.sean.shared.event.Event;

/**
 * @author Kyle Friz
 * @author Kayla Friz
 * @since Jun 9, 2015
 */
public class InterfaceMoveSubEvent implements Event {

	private final int root;
	private final int child;
	private final int root1;
	private final int child1;
	
	/**
	 * @param root
	 * @param child
	 * @param root1
	 * @param child1
	 */
	public InterfaceMoveSubEvent(int root, int child, int root1, int child1) {
		this.root = root;
		this.child = child;
		this.root1 = root1;
		this.child1 = child1;
	}

	/**
	 * @return the root
	 */
	public int getFromRoot() {
		return root;
	}

	/**
	 * @return the child
	 */
	public int getFromChild() {
		return child;
	}

	/**
	 * @return the root1
	 */
	public int getToRoot() {
		return root1;
	}

	/**
	 * @return the child1
	 */
	public int getToChild() {
		return child1;
	}

}
