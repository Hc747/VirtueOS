package com.sean.shared.network.game.event.decoders.objects;

import com.sean.shared.network.game.DataOrder;
import com.sean.shared.network.game.DataTransformation;
import com.sean.shared.network.game.DataType;
import com.sean.shared.network.game.GameFrameReader;
import com.sean.shared.network.game.event.GameMessageDecoder;
import com.sean.shared.network.game.event.impl.ObjectClickEvent;

public class ObjectForthActionClickDecoder implements GameMessageDecoder<ObjectClickEvent> {

	@Override
	public ObjectClickEvent decode(GameFrameReader frame) {
		int type = (int) frame.getUnsigned(DataType.BYTE, DataTransformation.SUBTRACT);
		int object = (int) frame.getUnsigned(DataType.SHORT);
		int x = (int) frame.getUnsigned(DataType.SHORT, DataOrder.LITTLE, DataTransformation.ADD);
		int y = (int) frame.getUnsigned(DataType.SHORT, DataOrder.LITTLE);

		System.out.println("secondclick X: "+x+", Y:"+y+", type:"+type+" obj:"+object);
		return new ObjectClickEvent(3, object, x, y);
	}

}
