package lab3;
public class P12 {
    static int search(int arr[],int l,int h,int target){
            if(l>h) return -1;
            else{
                    int m=(l+h)/2;
                    if(arr[m]==target) return m;
                    else{
                            if(target>arr[m])
                                    return search(arr,m+1,h,target);
                            else
                                    return search(arr,l,m-1,target);
                            }
            }
    }
    public static void main(String[] args) {
                    int a[]={10,20,30,40,50};
                    int t=search(a,0,a.length,30);
                    if(t==-1)System.out.println("Not found");
                    else System.out.println("Found at "+t);
    
    }
}

