package practice;

public class BinarySearchPracticeQst {
    public static void main(String[] args){
        int[] arr= {2,3,5,9,14,16,18};
        int target=12;

        System.out.println(celling(arr,target));
        System.out.println(floor(arr,target));

    }

    public static int celling(int[] arr, int target) {
/* FIND THE CELING OF NO-
        Celling = smallest element in array that is greater or equal to target

         here if target=4 -> celling=5
                 target=14 ->celling=14  target=15 celling=16 etc
*/
        int start=0;
        int end = arr.length-1;

        while(start<=end){

            int mid=start+ (end-start)/2;
            if(arr[mid]==target)return mid;
            if(target< arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return start;               //  look at notes  :  here every time we find a target in array  its target= celling
        //but if not; a end of algo where target is not found the start is just right to target no(while condision where start <end, thus end of loop startgoes to right of target)
        //right of target is the required no which is smallest which is  greater than target.
    }


    public static int floor(int[] arr, int target) {
        /* FIND THE FLOOR OF NO-
                floor = the largest element in array smaller than or equal to target

        */
        int start=0;
        int end = arr.length-1;

        while(start<=end){

            int mid=start+ (end-start)/2;
            if(arr[mid]==target)return mid;
            if(target< arr[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        return end;
    }


}


