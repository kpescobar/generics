/**
 * TODO Complete Javadoc comments.
 */
package edu.cnm.deepdive.generics;

/**
 * @author Kelly Escobar
 *
 */
public interface ShufflerSorter<T extends Comparable<T>> extends Iterable<T> {
  
  /**
   * 
   */
  void shuffle();
  
  /**
   * 
   */ 
  void sort();
  
}
