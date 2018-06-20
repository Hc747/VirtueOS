/**
 * Copyright (c) 2015 Kyle Friz
 * <p>
 * ChatCrownType is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * <p>
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * <p>
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.oldscape.shared.network.game.event.impl;

import com.oldscape.shared.event.Event;

/**
 * @author Kyle Friz
 * @date May 4, 2015
 */
public class WidgetActionEvent implements Event {

    private int opcode;
    private int widgetId;
    private int buttonId;
    private int itemId;
    private int slotId;

    public WidgetActionEvent(int opcode, int widgetId, int buttonId, int itemID, int slotID) {
        this.opcode = opcode;
        this.widgetId = widgetId;
        this.buttonId = buttonId;
        this.itemId = itemID;
        this.slotId = slotID;
    }

    /**
     * @return the opcode
     */
    public int getOpcode() {
        return opcode;
    }

    /**
     * @return the widgetId
     */
    public int getWidgetId() {
        return widgetId;
    }

    /**
     * @return the buttonId
     */
    public int getButtonId() {
        return buttonId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getSlotId() {
        return slotId;
    }

}
