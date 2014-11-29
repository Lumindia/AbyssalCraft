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
package com.shinoow.abyssalcraft.client.render.entity;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.shinoow.abyssalcraft.client.model.entity.ModelDG;
import com.shinoow.abyssalcraft.common.entity.anti.EntityAntiGhoul;

import cpw.mods.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public class RenderAntiGhoul extends RenderLiving {

	protected ModelDG model;

	private static final ResourceLocation ghoulResource = new ResourceLocation("abyssalcraft:textures/model/anti/depths_ghoul.png");

	public RenderAntiGhoul ()
	{
		super(new ModelDG(), 0.5F);
		model = (ModelDG)mainModel;
	}

	public void doRender(EntityAntiGhoul entity, double par2, double par4, double par6, float par8, float par9)
	{
		super.doRender(entity, par2, par4, par6, par8, par9);
	}

	protected ResourceLocation getGhoulTexture(EntityAntiGhoul par1EntityLiving)
	{
		return ghoulResource;
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {

		return getGhoulTexture((EntityAntiGhoul)entity);
	}
}