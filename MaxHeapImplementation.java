/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pooja
 */
public class MaxHeapImplementation {
    
     int findRight(int index)
    {
        return 2*index+1;
    }
    
     int findLeft(int index)
    {
        return 2*index+2;
    }
     
    void buildHeap(int[] arr,int n)
     {
            for(int i=n/2-1;i>=0;i--)
            {
            heapify(arr,n,i);
            }
     }
      void heapify(int[] arr,int n,int pos)
    {
        int left=findLeft(pos);
        int right=findRight(pos);
        int temp=pos;
        if(left<n&&arr[pos]<arr[left]){
        temp=left;
        }
        if(right<n&&arr[temp]<arr[right]){
        temp=right;
        }
        swap(arr,pos,temp);
        if(pos!=temp)        
            heapify(arr,n,temp);
    }
  private void swap(int[] arr,int i,int j)
    {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
  void heapsort(int[] arr,int n){
  for(int i=n-1;i>=0;i--){
  swap(arr,arr[0],arr[i]);
  heapify(arr,i,0);
  }
  }
  
    public static void main(String args[])
    {
        MaxHeapImplementation mheap=new MaxHeapImplementation();
        int heapArray[]={20,7,8,10,15,5,6};
        int n=heapArray.length;
        mheap.buildHeap(heapArray,n);
        for(int i=0;i<n;i++)
        {
        System.out.println(heapArray[i]);
        }
}
}
