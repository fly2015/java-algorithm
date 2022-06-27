/*
 * SumArrayElem.java
 *
 * Copyright by CRIF AG
 * Zürich
 * All rights reserved.
 */
package practices;

/**
 * 
 *
 * @author nhqhien
 * @version $Revision:  $
 */
public class SumArrayElem
{
    public static void main(String[] args)
    {
        int [] numbers  = new int[] {1, 2, 3, 4, 5, 7, 1001};
        
        System.out.println(sumOddElems2(numbers));
        
    }
    
    static int sumOddElems(int [] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
            while(nums[i] % 2 != 0)
            {
                sum += nums[i];
                break; 
            }
        }
        
        return sum;
    }
    
    static int sumOddElems1(int [] nums)
    {
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
        {
             sum += (nums[i] % 2) != 0 ? nums[i] : 0;
        }
        
        return sum;
    }
    
    
    static int sumOddElems2(int [] nums)
    {
        int sum = 0;
        int [] tmp  = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++)
        {
             int j = nums[i] % 2; 
             tmp[j] = tmp[j] + nums[i];
        }
        
        for (int i = 1; i < tmp.length; i++)
        {
            sum += tmp[i];
        }
        
        return sum;
    }
}



/*
 * Changes:
 * $Log: $
 */