/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author LENOVO
 */
public class BinaryTreeApp {
    public class BinaryTreeApp {
    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        
        TreeNode node;
        
        node = new TreeNode(20);
        tree.insert(node);
        
        node = new TreeNode(30);
        tree.insert(node);
    
        node = new TreeNode(40);
        tree.insert(node);
    
        node = new TreeNode(50);
        tree.insert(node);
    
        node = new TreeNode(70);
        tree.insert(node);
    
        System.out.print("Traversal dengan preorder :");
        tree.preOrder();
        
        System.out.print("\nTraversal dengan Postorder :");
        tree.postOrder();
        
        System.out.print("\nTraversal dengan InOrder :");
        tree.inOrder();
        System.out.println();
    }
    }
}

