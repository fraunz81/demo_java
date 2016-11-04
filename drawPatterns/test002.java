/*
 * test002.java
 * 
 * Copyright 2016 Franz Habison <franz@raspberrypi>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */

import java.util.Arrays;

public class test002
{
	static int foo(int n)
	{
		if (n < 1){
			return 0;
		} else { 
			return 1 + foo(n / 10);
		}
	}
	
	
	static int foo(String x, int number, int[] array){
		number = array.length;
		x = x + "xAtfoo";
		for (int i=0; i < number; i++){
			array[i] = array[i] + x.length();
		}
		x = x + "Success";
		return x.length();
	}

	static void bar(){
		String s = new String("Hello");
		int num = 6;
		int [] array = {1, 2, 3, 4};
		int result = 0;
		System.out.println("Bevor: " + Arrays.toString(array));
		result = foo(s, num, array);
		System.out.println("After: " + Arrays.toString(array));
		System.out.println(result);
	}
	
	static int countSorted(int[] array)
	{
		int count = 1; 
		int max = 1;
		for (int k = 1; k < array.length; k++)
		{
			if (array[k-1] <= array[k])
			{
				count++;
			}
			else
			{
				if (count > max)
				{
					max = count;
				}
				
				count = 1;
			}
		}
		
		//System.out.println(count);
		if (count > max)
			max = count;
			
		return max;
	}
	
	public static void main (String args[])
	{
		/*
		System.out.println(foo(0));
		System.out.println(foo(1));
		System.out.println(foo(10));
		System.out.println(foo(100));
		System.out.println(foo(234));
		System.out.println(foo(1234));
		*/
		
		//bar();

		int [] arr = {25, 7, 7, 14, 14, 14, 21, 3, 3, 3, 5, 12, 12, 13, 13};
		System.out.println(countSorted(arr));
	}
}

