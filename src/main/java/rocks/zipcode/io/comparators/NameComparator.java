package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class NameComparator implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        return o1.getName().compareTo(o2.getName());

//        public int compareTo(String anotherString){
//            int len1 = value.length;
//            int len2 = anotherString.value.length;
//            int lim = Math.min(len1, len2);
//            char v1[] = value;
//            char v2[] = anotherString.value;
//
//            int k = 0;
//            while (k < lim) {
//                char c1 = v1[k];
//                char c2 = v2[k];
//                if (c1 != c2) {
//                    return c1 - c2;
//                }
//                k++;
//            }
//            return len1 - len2;
//        }
    }
}
