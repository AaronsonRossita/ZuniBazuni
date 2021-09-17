package food;

enum EnumTypes{
    CUCUMBER, TOMATO, CARROT;
}

public class Store {



    public static void main(String[] args) {




    }



}


//  Single         A -> B        1 parent/super and 1 child/sub
//
//  Multiple       A -> B -> C
//
//                     B
//  Hierarchical   A <
//                     C
//
//
//                     B
//  Hybrid         A <
//                     C -> D
//
//                     B
// Diamond problem A <   > D   !
//                     C
//
//
// Default    the same as public
//
// Public     by any class in the same package
//
// Protected  to the class itself(parent) and to the subclasses (children)
//
// Private    ultimate protection, except for the class itself(parent)