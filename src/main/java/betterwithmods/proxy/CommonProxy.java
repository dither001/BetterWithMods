package betterwithmods.proxy;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class CommonProxy implements IGuiHandler
{


	public Item addItemBlockModel(Item item) {
		return item;
	}

	public void registerRenderInformation()
	{
		
	}
	
	public void registerEvents()
	{
		
	}
	
	public void initRenderers()
	{
		
	}

	public boolean isClientside()
	{
		return false;
	}

	public void registerColors()
	{

	}

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world,
			int x, int y, int z) {
		// TODO Auto-generated method stub
		return null;
	}
}
