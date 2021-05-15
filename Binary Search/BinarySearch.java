public class BinarySearch {
    public static int binarySearch(int arr[], int left, int right, int value){
        int mid = (left + right) / 2;
        
        //Không tìm thấy
        if(right - left < 0){
            return -1;
        }
        
        if(arr[mid] == value){
            //Trả về vị trí của value trong mảng
            return mid;
        } else if(value >= arr[mid]){
            //Tìm value nửa bên phải mảng
            return binarySearch(arr, mid + 1, right, value);
        }
        else{
            //Tìm value nửa bên trái mảng
            return binarySearch(arr, left, mid - 1, value);
        }
    }
    
    //Khử đệ quy
    public static int binarySearch2(int arr[], int value){
        int left = 0;
        int right = arr.length - 1;
        int mid;
        
        while(left <= right){
            mid = (left + right) / 2;
            
            if(arr[mid] > value)
                right = mid - 1;
            else if(arr[mid] < value)
                left = mid + 1;
            else
                return mid;
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 8, 10, 15};
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
        System.out.println("");
        
        System.out.println(binarySearch2(arr, 11));
    }
    
}
