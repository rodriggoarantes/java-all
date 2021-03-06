package br.com.ras.java.leetcode.codechallenge.week3;

import br.com.ras.java.leetcode.codechallenge.shared.TreeNode;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearchTreeTest {
    private final BinarySearchTree binarySearchTree = new BinarySearchTree();

    @Test
    public void test_case1() {
        int[] order = new int[]{8,5,1,7,10,12};
        final TreeNode node = binarySearchTree.bstFromPreorder(order);
        assertThat(node, notNullValue());
        assertThat(node.val, equalTo(8));
        assertThat(node.left.val, equalTo(5));
        assertThat(node.right.val, equalTo(10));
    }

}