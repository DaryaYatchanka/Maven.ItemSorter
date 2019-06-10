package rocks.zipcode.io.comparators;


import rocks.zipcode.io.Item;

import java.util.Comparator;


/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {


  public int compare(Item o1, Item o2) {
    return Long.compare(o1.getId(), o2.getId());
            //o1.getId().compareTo(o2.getId());
//or if else statment with 0 if equals, 1 if greater and -1 if less;
  }

}
