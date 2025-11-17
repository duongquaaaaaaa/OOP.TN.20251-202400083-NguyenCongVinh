package com.hust.kstn.models;

public class Store {
	private static final int  MAX_NUMBER_ORDERED = 100;
	private DigitalVideoDisc[] itemsInStore= new DigitalVideoDisc[105];
	private int qtyOrdered=0;
	
	public void removeDVD(DigitalVideoDisc disc)
	{
		if(qtyOrdered==0)
		{
			System.out.println("The store is empty");
			return ;
		}

		for(int i=0;i<qtyOrdered;i++)
		{
			if(itemsInStore[i].equals(disc))
			{
				itemsInStore[i]=itemsInStore[--qtyOrdered];
				System.out.println("The disc has been removed sucessfully");
				return;
			}
		}

		System.out.println("The disc does not exist");
		return;
	}

	public void addDVD(DigitalVideoDisc disc)
	{
		if(qtyOrdered==MAX_NUMBER_ORDERED)
		{
			 System.out.println("The store is almost full");
	         return;
		}
		itemsInStore[qtyOrdered++]=disc;
		System.out.println("The disc has been added sucessfully");
	}
}
