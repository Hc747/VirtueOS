package com.sean.shared.network.game.event.encoders;

import io.netty.buffer.ByteBufAllocator;

import com.sean.game.model.player.inv.Item;
import com.sean.shared.network.game.DataOrder;
import com.sean.shared.network.game.DataTransformation;
import com.sean.shared.network.game.DataType;
import com.sean.shared.network.game.FrameType;
import com.sean.shared.network.game.GameFrame;
import com.sean.shared.network.game.GameFrameBuilder;
import com.sean.shared.network.game.event.EncoderOpcode;
import com.sean.shared.network.game.event.GameMessageEncoder;
import com.sean.shared.network.game.event.impl.ItemsUpdateEvent;

/**
 * 
 * @author Kyle Friz
 * @author Kayla Friz
 * @since May 27, 2015
 */
public class ItemsUpdateEventEncoder implements GameMessageEncoder<ItemsUpdateEvent> {

	@Override
	public GameFrame encode(ByteBufAllocator alloc, ItemsUpdateEvent event) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Override
//	public GameFrame encode(ByteBufAllocator alloc, ItemsUpdateEvent event) {
//		GameFrameBuilder builder = new GameFrameBuilder(alloc, EncoderOpcode.FULL_ITEMS, FrameType.VARIABLE_SHORT);
//		builder.put(DataType.INT, event.getInterfaceID());
//		builder.put(DataType.SHORT, event.getChannelID());
//		builder.put(DataType.SHORT, event.getItems().length);
//		
//		for (Item item : event.getItems()) {		
//			int id = item == null ? -1 : item.getId();
//			int amount = item == null ? 0 : item.getAmount();
//
//			builder.put(DataType.SHORT, id + 1);
//
//			if (amount > 254) {
//				builder.put(DataType.BYTE, DataTransformation.NEGATE, 255);
//				builder.put(DataType.INT, DataOrder.INVERSED_MIDDLE, amount);
//			} else {
//				builder.put(DataType.BYTE, DataTransformation.NEGATE, amount);
//			}
//		}
//		
//		return builder.toGameFrame();
//	}
}
