abstract class Sortable {
    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        // Shell sort body
        // int n = a.length;

        // for (int gap = n / 2; gap > 2; gap /= 2) {
        //     for (int i = gap; i < n; i += 1) {
        //         Sortable temp = a[i];
        //         int j;

        //         for (j = i; (j >= gap) && (a[j-gap].compare(temp) == -1); j -= gap) 
        //             a[j] = a[j - gap]; 

        //         a[j] = temp; 
        //     }
        // }

        int n = a.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j > i; j--)
            {
                if (a[j].compare(a[j-1]) == 1)
                {
                    Sortable temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }
    }
}