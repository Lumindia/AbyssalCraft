/*******************************************************************************
 * AbyssalCraft
 * Copyright (c) 2012 - 2016 Shinoow.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v3
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * 
 * Contributors:
 *     Shinoow -  implementation
 ******************************************************************************/
package com.shinoow.abyssalcraft.common.items;

import java.util.List;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import com.shinoow.abyssalcraft.api.AbyssalCraftAPI;
import com.shinoow.abyssalcraft.api.entity.IAntiEntity;
import com.shinoow.abyssalcraft.api.entity.ICoraliumEntity;
import com.shinoow.abyssalcraft.api.entity.IDreadEntity;
import com.shinoow.abyssalcraft.api.item.ACItems;
import com.shinoow.abyssalcraft.lib.ACLib;
import com.shinoow.abyssalcraft.lib.ACTabs;

public class ItemDrainStaff extends Item {

	public ItemDrainStaff(){
		super();
		setUnlocalizedName("drainstaff");
		setCreativeTab(ACTabs.tabTools);
		setMaxStackSize(1);
	}

	@Override
	public boolean isFull3D(){
		return true;
	}

	public void increaseEnergy(ItemStack stack, String type){
		if(!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());
		stack.getTagCompound().setInteger("energy"+type, getEnergy(stack, type) + 1);
	}

	public void setEnergy(int amount, ItemStack stack, String type){
		stack.getTagCompound().setInteger("energy"+type, amount);
	}

	public int getEnergy(ItemStack par1ItemStack, String type)
	{
		return par1ItemStack.hasTagCompound() && par1ItemStack.getTagCompound().hasKey("energy"+type) ? (int)par1ItemStack.getTagCompound().getInteger("energy"+type) : 0;
	}

	@Override
	@SuppressWarnings("rawtypes")
	public ActionResult<ItemStack> onItemRightClick(ItemStack stack, World world, EntityPlayer player, EnumHand hand) {

		int range = 50;
		Vec3d v = player.getLookVec().normalize();
		for(int i = 1;i<range;i++){

			AxisAlignedBB aabb = new AxisAlignedBB(player.posX + v.xCoord * i, player.posY + v.yCoord * i, player.posZ + v.zCoord * i, player.posX + v.xCoord * i, player.posY + v.yCoord * i, player.posZ + v.zCoord * i);
			List list = world.getEntitiesWithinAABB(EntityLiving.class, aabb);
			if(list.iterator().hasNext()){
				EntityLiving target = (EntityLiving)list.get(0);

				if(target.getCreatureAttribute() == AbyssalCraftAPI.SHADOW && target.isNonBoss()){
					if(!target.isDead)
						if(target.attackEntityFrom(DamageSource.causePlayerDamage(player), 1))
							increaseEnergy(stack, "Shadow");
				} else if(world.provider.getDimension() == ACLib.abyssal_wasteland_id && target instanceof ICoraliumEntity &&
						target.isNonBoss()){
					if(!target.isDead)
						if(target.attackEntityFrom(DamageSource.causePlayerDamage(player), 1))
							increaseEnergy(stack, "Abyssal");
				} else if(world.provider.getDimension() == ACLib.dreadlands_id && target instanceof IDreadEntity &&
						target.isNonBoss()){
					if(!target.isDead)
						if(target.attackEntityFrom(DamageSource.causePlayerDamage(player), 1))
							increaseEnergy(stack, "Dread");
				} else if(world.provider.getDimension() == ACLib.omothol_id && target instanceof ICoraliumEntity
						&& target instanceof IDreadEntity && target instanceof IAntiEntity &&
						target.getCreatureAttribute() != AbyssalCraftAPI.SHADOW && target.isNonBoss())
					if(!target.isDead)
						if(target.attackEntityFrom(DamageSource.causePlayerDamage(player), 1))
							increaseEnergy(stack, "Omothol");
			}

		}

		if(getEnergy(stack, "Shadow") >= 200){
			setEnergy(0, stack, "Shadow");
			player.inventory.addItemStackToInventory(new ItemStack(ACItems.shadow_gem));
		}
		if(getEnergy(stack, "Abyssal") >= 100){
			setEnergy(0, stack, "Abyssal");
			player.inventory.addItemStackToInventory(new ItemStack(ACItems.essence, 1, 0));
		}
		if(getEnergy(stack, "Dread") >= 100){
			setEnergy(0, stack, "Dread");
			player.inventory.addItemStackToInventory(new ItemStack(ACItems.essence, 1, 1));
		}
		if(getEnergy(stack, "Omothol") >= 100){
			setEnergy(0, stack, "Omothol");
			player.inventory.addItemStackToInventory(new ItemStack(ACItems.essence, 1, 2));
		}

		return new ActionResult(EnumActionResult.PASS, stack);
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void addInformation(ItemStack is, EntityPlayer player, List l, boolean B){
		int abyssal = getEnergy(is, "Abyssal");
		int dread = getEnergy(is, "Dread");
		int omothol = getEnergy(is, "Omothol");
		int shadow = getEnergy(is, "Shadow");
		l.add(I18n.translateToLocal("tooltip.drainstaff.energy.1")+": " + abyssal + "/100");
		l.add(I18n.translateToLocal("tooltip.drainstaff.energy.2")+": " + dread + "/100");
		l.add(I18n.translateToLocal("tooltip.drainstaff.energy.3")+": " + omothol + "/100");
		l.add(I18n.translateToLocal("tooltip.drainstaff.energy.4")+": " + shadow + "/200");
	}
}