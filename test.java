import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Attributes.Name;

/*Notes:
 * 	Memory Management;
 * 		Heap Memory:
 * 				When JAVA programs starts, it is allocated some memory(space) from the operating system.Some of it is called Heap Memory.
 * 				There are two parameter to define Heap Size: -Xms : minimum Starting memory allocated, -Xmx : Max size of heap. another one is 
 * 					-Xmn : new generation object heap size.
 * 				Heap is divided into three main regions named as New Generation, Old or Tenured Generation and 
 * 					Perm space:store class and method objects(Deprecated in Java8, Replaced by MetaSpace)
 * 				Whenever, an object is created then it is allocated space in heap memory.				
 *		MetaSpace: 					
 *			First, it is NOT part of Heap Memory but native Memory. So any class loader leak will not only cause application to exit but Entire Server.
 *			So, Must limit the size of MetaSpace by  -XX:MetaspaceSize 
 *
 *
 *		GC Logs:
 *			//TO-DO
 *
 *	Core Java;
 *		//TO-Do
 *
 *	Struts;
 *		//TO-DO
 *
 *	Alogithms;
 *		//To-DO
 *
 *
 * 
 * 
 * 


 */
class Test
{
	public static void main(String args[]) throws Exception
	{

		Test test = new Test();

		/* Integer is final no pass by value in a sense */
		/*
		 * Integer i = new Integer(2); test.intTest(i); System.out.println(i);
		 * 
		 * 
		 * ArrayList<String> list = new ArrayList<String>();
		 * 
		 * list.add("Added in Main"); test.collectionTest(list); for(String
		 * str:list) System.out.println(str);
		 */
		int[] a = { 1, 3, 4, 11, 12 };
		System.out.println(Test.cadbury(5,6,3,4));

	}

	public static int cadbury(int input1, int input2, int input3, int input4)
	{

		// input1,input2> range of length
		// input3,input4> range of breadth
		int numberOfStudent = 0;
		while (input1 <= input2)
		{
			int temp33 = input3;
			while (temp33 <= input4)
			{
				int temp1 = input1;
				int temp3 = temp33;

				while (true)
				{
					if (temp1 < temp3)
					{
						temp3 = temp3 - temp1;
					}
					else if (temp1 > temp3)
					{
						temp1 = temp1 - temp3;
					}
					else
					{
						numberOfStudent++;
						break;
					}
					numberOfStudent++;
				}
				System.out.println(numberOfStudent);
				temp33++;
			}

			input1++;

		}
		return numberOfStudent;
	}

	public void collectionTest(ArrayList<String> list)
	{
		list.add("Added in method");
		for (String str : list)
			System.out.println(str);

	}

	public void intTest(Integer i)
	{
		i = 3;
		System.out.println(i);

	}

}
