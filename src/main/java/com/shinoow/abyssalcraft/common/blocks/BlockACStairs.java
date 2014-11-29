/**
 * AbyssalCraft
 * Copyright 2012-2014 Shinoow
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shinoow.abyssalcraft.common.blocks;

import net.minecraft.block.*;
import com.shinoow.abyssalcraft.AbyssalCraft;

public class BlockACStairs extends BlockStairs {

	public BlockACStairs(Block par1Block, String tooltype, int harvestlevel){
		super(par1Block, 0);
		setLightOpacity(0);
		setCreativeTab(AbyssalCraft.tabBlock);
		setHarvestLevel(tooltype, harvestlevel);
	}

	public BlockACStairs(Block par1Block){
		super(par1Block, 0);
		setLightOpacity(0);
		setCreativeTab(AbyssalCraft.tabBlock);
	}
}