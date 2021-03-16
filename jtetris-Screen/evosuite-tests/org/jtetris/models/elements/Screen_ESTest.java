/*
 * This file was automatically generated by EvoSuite
 * Fri Jan 22 15:01:08 GMT 2021
 */

package org.jtetris.models.elements;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jtetris.models.elements.Grid;
import org.jtetris.models.elements.Screen;
import org.jtetris.models.game.Tetris;
import org.junit.runner.RunWith;

 
public class Screen_ESTest{

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      Grid grid0 = new Grid(1844, 8);
      // Undeclared exception!
      tetris0.screen.union(grid0, grid0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      // Undeclared exception!
      try { 
        tetris0.screen.union((Grid) tetris0.screen, (Grid) tetris0.block);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      tetris0.screen.occupied = null;
      // Undeclared exception!
      try { 
        tetris0.screen.removeBlock((Tetris) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jtetris.models.elements.Grid", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      tetris0.screen.occupied = null;
      // Undeclared exception!
      try { 
        tetris0.screen.addBlock(tetris0.screen);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      // Undeclared exception!
      try { 
        tetris0.screen.addBlock(tetris0.block);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      Screen screen0 = new Screen();
      Grid grid0 = tetris0.screen.union((Grid) tetris0.block, (Grid) tetris0.block);
      screen0.occupied = grid0.occupied;
      // Undeclared exception!
      try { 
        screen0.removeBlock(tetris0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2
         //
         verifyException("org.jtetris.models.elements.Grid", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      tetris0.screen.removeBlock(tetris0);
      assertFalse(tetris0.isGameOver());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Tetris tetris0 = new Tetris();
      tetris0.screen.addBlock(tetris0.screen);
      assertFalse(tetris0.isGameOver());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Screen screen0 = new Screen();
      // Undeclared exception!
      try { 
        screen0.union((Grid) null, (Grid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jtetris.models.elements.Screen", e);
      }
  }
}