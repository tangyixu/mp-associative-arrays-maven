package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Tiffany Tang
 */
public class TestsFromStudent {
  /**
   * Tests if the set function works properly for setting a existed key in the list.
   */
  @Test
  public void doubleSetTest() throws Exception {
    AssociativeArray<String, String> test = 
    new AssociativeArray<String, String>();
    test.set("a", "aardvark");
    test.set("a", "apple");
    assertEquals("apple", test.get("a"), "Supposed to return the newest value we set (apple).");
  } // doubleSetTest()
} // class TestsFromSam
