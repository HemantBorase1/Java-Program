class Problem24
{

       public static void main(String[] args)
       {
           int arr[]={1,2,3,5,6,7,8};
           int first=arr[0];
           int last=arr[arr.length-1];
           int sum=0;
           for(int i=0;i<arr.length;i++)
           {
                sum+=arr[i];
            }
           int missing=((first+last)*last)/2-sum;
           System.out.println(missing);
       }
}