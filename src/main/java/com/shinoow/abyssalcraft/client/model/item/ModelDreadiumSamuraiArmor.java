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
package com.shinoow.abyssalcraft.client.model.item;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelDreadiumSamuraiArmor extends ModelBiped {

	ModelRenderer headpiece1;
	ModelRenderer headpiece2;
	ModelRenderer headpiece3;
	ModelRenderer headside1;
	ModelRenderer headside2;
	ModelRenderer leftshoulder1;
	ModelRenderer leftshoulder2;
	ModelRenderer leftshoulder3;
	ModelRenderer leftshoulder4;
	ModelRenderer chestplate1;
	ModelRenderer chestplate2;
	ModelRenderer chestplate3;
	ModelRenderer rightshoulder1;
	ModelRenderer rightshoulder2;
	ModelRenderer rightshoulder3;
	ModelRenderer rightshoulder4;
	ModelRenderer legpiece;
	ModelRenderer leftlegpiece1;
	ModelRenderer leftlegpiece2;
	ModelRenderer rightlegpiece1;
	ModelRenderer rightlegpiece2;

	public ModelDreadiumSamuraiArmor(float f)
	{
		super(f, 0, 64, 64);
		textureWidth = 64;
		textureHeight = 64;

		headpiece1 = new ModelRenderer(this, 0, 32);
		headpiece1.addBox(-2F, -7F, -6F, 4, 1, 1);
		headpiece1.setRotationPoint(0,0,0);
		headpiece1.setTextureSize(64, 64);
		headpiece1.mirror = true;
		setRotation(headpiece1, 0F, 0F, 0F);
		headpiece2 = new ModelRenderer(this, 10, 32);
		headpiece2.addBox(1F, -10F, -6F, 1, 3, 1);
		headpiece2.setRotationPoint(0,0,0);
		headpiece2.setTextureSize(64, 64);
		headpiece2.mirror = true;
		setRotation(headpiece2, 0F, 0F, 0F);
		headpiece3 = new ModelRenderer(this, 14, 32);
		headpiece3.addBox(-2F, -10F, -6F, 1, 3, 1);
		headpiece3.setRotationPoint(0,0,0);
		headpiece3.setTextureSize(64, 64);
		headpiece3.mirror = true;
		setRotation(headpiece3, 0F, 0F, 0F);
		headside1 = new ModelRenderer(this, 18, 32);
		headside1.addBox(2F, -6F, -7F, 3, 3, 1);
		headside1.setRotationPoint(0,0,0);
		headside1.setTextureSize(64, 64);
		headside1.mirror = true;
		setRotation(headside1, 0F, -0.5576792F, -0.185895F);
		headside2 = new ModelRenderer(this, 18, 32);
		headside2.addBox(-5F, -6F, -7F, 3, 3, 1);
		headside2.setRotationPoint(0,0,0);
		headside2.setTextureSize(64, 64);
		headside2.mirror = true;
		setRotation(headside2, 0F, 0.5576851F, 0.1858931F);
		leftshoulder1 = new ModelRenderer(this, 0, 34);
		leftshoulder1.addBox(4F, -2F, -2F, 1, 2, 4);
		leftshoulder1.setRotationPoint(0,0,0);
		leftshoulder1.setTextureSize(64, 64);
		leftshoulder1.mirror = true;
		setRotation(leftshoulder1, 0F, 0F, -0.4461433F);
		leftshoulder2 = new ModelRenderer(this, 0, 34);
		leftshoulder2.addBox(3.5F, -0.5F, -2F, 1, 2, 4);
		leftshoulder2.setRotationPoint(0,0,0);
		leftshoulder2.setTextureSize(64, 64);
		leftshoulder2.mirror = true;
		setRotation(leftshoulder2, 0F, 0F, -0.4461411F);
		leftshoulder3 = new ModelRenderer(this, 0, 34);
		leftshoulder3.addBox(3F, 1.0F, -2F, 1, 2, 4);
		leftshoulder3.setRotationPoint(0,0,0);
		leftshoulder3.setTextureSize(64, 64);
		leftshoulder3.mirror = true;
		setRotation(leftshoulder3, 0F, 0F, -0.4461411F);
		leftshoulder4 = new ModelRenderer(this, 0, 34);
		leftshoulder4.addBox(2.5F, 2.5F, -2F, 1, 2, 4);
		leftshoulder4.setRotationPoint(0,0,0);
		leftshoulder4.setTextureSize(64, 64);
		leftshoulder4.mirror = true;
		setRotation(leftshoulder4, 0F, 0F, -0.4461411F);
		chestplate1 = new ModelRenderer(this, 26, 32);
		chestplate1.addBox(-3F, 1F, -4F, 6, 9, 1);
		chestplate1.setRotationPoint(0,0,0);
		chestplate1.setTextureSize(64, 64);
		chestplate1.mirror = true;
		setRotation(chestplate1, 0F, 0F, 0F);
		chestplate2 = new ModelRenderer(this, 22, 36);
		chestplate2.addBox(2F, 0F, -4F, 1, 1, 1);
		chestplate2.setRotationPoint(0,0,0);
		chestplate2.setTextureSize(64, 64);
		chestplate2.mirror = true;
		setRotation(chestplate2, 0F, 0F, 0F);
		chestplate3 = new ModelRenderer(this, 22, 36);
		chestplate3.addBox(-3F, 0F, -4F, 1, 1, 1);
		chestplate3.setRotationPoint(0,0,0);
		chestplate3.setTextureSize(64, 64);
		chestplate3.mirror = true;
		setRotation(chestplate3, 0F, 0F, 0F);
		rightshoulder1 = new ModelRenderer(this, 0, 34);
		rightshoulder1.addBox(-5F, -2F, -2F, 1, 2, 4);
		rightshoulder1.setRotationPoint(0,0,0);
		rightshoulder1.setTextureSize(64, 64);
		rightshoulder1.mirror = true;
		setRotation(rightshoulder1, 0F, 0F, 0.4461411F);
		rightshoulder2 = new ModelRenderer(this, 0, 34);
		rightshoulder2.addBox(-4.5F, -0.5F, -2F, 1, 2, 4);
		rightshoulder2.setRotationPoint(0,0,0);
		rightshoulder2.setTextureSize(64, 64);
		rightshoulder2.mirror = true;
		setRotation(rightshoulder2, 0F, 0F, 0.4461411F);
		rightshoulder3 = new ModelRenderer(this, 0, 34);
		rightshoulder3.addBox(-4F, 1.0F, -2F, 1, 2, 4);
		rightshoulder3.setRotationPoint(0,0,0);
		rightshoulder3.setTextureSize(64, 64);
		rightshoulder3.mirror = true;
		setRotation(rightshoulder3, 0F, 0F, 0.4461411F);
		rightshoulder4 = new ModelRenderer(this, 0, 34);
		rightshoulder4.addBox(-3.5F, 2.5F, -2F, 1, 2, 4);
		rightshoulder4.setRotationPoint(0,0,0);
		rightshoulder4.setTextureSize(64, 64);
		rightshoulder4.mirror = true;
		setRotation(rightshoulder4, 0F, 0F, 0.4461411F);
		legpiece = new ModelRenderer(this, 0, 40);
		legpiece.addBox(-4F, 12F, -3.5F, 8, 5, 1);
		legpiece.setRotationPoint(0,0,0);
		legpiece.setTextureSize(64, 64);
		legpiece.mirror = true;
		setRotation(legpiece, 0F, 0F, 0F);
		leftlegpiece1 = new ModelRenderer(this, 18, 38);
		leftlegpiece1.addBox(2.5F, 0F, -2F, 1, 8, 4);
		leftlegpiece1.setRotationPoint(0,0,0);
		leftlegpiece1.setTextureSize(64, 64);
		leftlegpiece1.mirror = true;
		setRotation(leftlegpiece1, 0F, 0F, 0F);
		leftlegpiece2 = new ModelRenderer(this, 0, 46);
		leftlegpiece2.addBox(-2F, 0F, 2.5F, 4, 5, 1);
		leftlegpiece2.setRotationPoint(0,0,0);
		leftlegpiece2.setTextureSize(64, 64);
		leftlegpiece2.mirror = true;
		setRotation(leftlegpiece2, 0F, 0F, 0F);
		rightlegpiece1 = new ModelRenderer(this, 18, 38);
		rightlegpiece1.addBox(-3.5F, 0F, -2F, 1, 8, 4);
		rightlegpiece1.setRotationPoint(0,0,0);
		rightlegpiece1.setTextureSize(64, 64);
		rightlegpiece1.mirror = true;
		setRotation(rightlegpiece1, 0F, 0F, 0F);
		rightlegpiece2 = new ModelRenderer(this, 0, 46);
		rightlegpiece2.addBox(-2F, 0F, 2.5F, 4, 5, 1);
		rightlegpiece2.setRotationPoint(0,0,0);
		rightlegpiece2.setTextureSize(64, 64);
		rightlegpiece2.mirror = true;
		setRotation(rightlegpiece2, 0F, 0F, 0F);

		bipedHead.addChild(headpiece1);
		bipedHead.addChild(headpiece2);
		bipedHead.addChild(headpiece3);
		bipedHead.addChild(headside1);
		bipedHead.addChild(headside2);
		bipedBody.addChild(chestplate1);
		bipedBody.addChild(chestplate2);
		bipedBody.addChild(chestplate3);
		bipedBody.addChild(legpiece);
		bipedLeftArm.addChild(leftshoulder1);
		bipedLeftArm.addChild(leftshoulder2);
		bipedLeftArm.addChild(leftshoulder3);
		bipedLeftArm.addChild(leftshoulder4);
		bipedRightArm.addChild(rightshoulder1);
		bipedRightArm.addChild(rightshoulder2);
		bipedRightArm.addChild(rightshoulder3);
		bipedRightArm.addChild(rightshoulder4);
		bipedLeftLeg.addChild(leftlegpiece1);
		bipedLeftLeg.addChild(leftlegpiece2);
		bipedRightLeg.addChild(rightlegpiece1);
		bipedRightLeg.addChild(rightlegpiece2);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
