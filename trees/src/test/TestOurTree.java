package test;

import trees.BinarySearchTree;

public class TestOurTree
{
    public static void main(String[] args)
    {
        //add a tree with elements to add
        BinarySearchTree<Integer> numTree = new BinarySearchTree<>();
        int[] elemsToAdd = {25, 11, 77, 69, 3, 50, 39, 55, 99, 42};

        //add them
        for (int elem : elemsToAdd)
        {
            numTree.add(elem);
        }
    }
}
