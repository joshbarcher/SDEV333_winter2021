package test;

import trees.BinarySearchTree;

import java.util.List;

public class TestOurTree
{
    public static void main(String[] args)
    {
        //add a tree with elements to add
        BinarySearchTree<Integer> numTree = new BinarySearchTree<>();
        int[] elemsToAdd = {13, 7, 15, 2, 8, 21, 11, 9};

        //add them
        for (int elem : elemsToAdd)
        {
            numTree.add(elem);
        }

        /*System.out.println(numTree.remove(7));
        System.out.println(numTree.remove(13));
        System.out.println(numTree.remove(9));
        System.out.println(numTree.remove(0));
        System.out.println(numTree.size());*/

        /*List<Integer> traversal = numTree.preOrder();
        for (int num : traversal)
        {
            System.out.println(num);
        }*/

        for (int num : numTree)
        {
            System.out.println(num);
        }
    }
}












