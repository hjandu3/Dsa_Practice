public class MergeSort {

    public void mergeSort(int[] a, int l, int r){
        int mid = (l+r)/2;
        if(l<r){
            mergeSort(a,l,mid);
            mergeSort(a,mid+1,r);
            merge(a,l,r,mid);


        }

    }

    public void merge(int[] a, int l, int r,int mid){
        int i =l;
        int j=mid+1;
        int k =l;
        int[] b = new int[a.length];
        while(i<=mid && j<=r){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else {
                b[k]=a[j];
                j++;
            }
            k++;
        }
        if(i>mid){
            while(j<=r) {
                b[k] = a[j];
                k++;
                j++;
            }
        }
        else{
            while (i<=mid) {
                b[k] = a[i];
                k++;
                i++;
            }
        }

        for(k=l;k<=r;k++){
            a[k]=b[k];
        }
    }
        }
