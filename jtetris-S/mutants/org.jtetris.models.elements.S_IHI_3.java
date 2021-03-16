package org.jtetris.models.elements;


/**
 * A kind of Polygon class the shape is like a S character.
 */
public class S extends Polygon
{
    //=== begin-bug-seed
    public boolean[][] occupied;
    //=== end-bug-seed

    public S() {
        occupied[0][1] = true;
        occupied[1][1] = true;
        occupied[1][2] = true;
        occupied[2][2] = true;
    }

}


