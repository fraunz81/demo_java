/*
 * test001.java
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


public class test001 {
	
	public static void main (String args[]) {
		test4();


	}
	
	private static void test1()
	{
		for(int j=0; j<5; j++) {
			for(int i=0; i<=j; i++) {
				System.out.print(((i+j)%2==0 ? "*" : "#"));
			}
			System.out.println();
		}
	}
	
	private static void test2()
	{
		int [] numbers = {1, 4, 3, 6, 8, 5, 3, 1, 9, 7};
		int result = 0;
		for(int i = 0; i < numbers.length; i++) {
			result += (numbers[i] % 2 == 0 ? 1 : 0);
		}
		System.out.println(result);
	}
	
	private static void test3()
	{
		int [] numbers = {1, 4, 3, 6, 8, 5, 3, 1, 9, 7};
		double result = 0.0;
		for(int i=0; i<numbers.length; i++) {
			result += numbers[i];
		}
		result /= numbers.length;
		System.out.println(result);
	}
	
	private static void test4()
	{
		int [] numbers = {1, 4, 3, 6, 8, 5, 3, 1, 9, 7};
		int result = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				result += (numbers[i]==numbers[j] ? 1 : 0);
			}
		}
		System.out.println(result);
	}
}

