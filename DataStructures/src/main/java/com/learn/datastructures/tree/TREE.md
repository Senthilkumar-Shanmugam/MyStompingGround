Node,Leaf(node with no children)
Edge - connection between two nodes
Path - sequence of nodes and edges connecting a node with its decendent

Height/size/depth/level of a Tree
==================================

The height of a node is the largest number of edges in a path from that node to a leaf node.
No. of edges on longest path from that node to the farthest leaf.
Depth - No. of edges on the path from that node to the root.

Height of tree is, Height of ROOT. ->top to bottom
Depth of tree is, maximum depth in the tree. --> botom up 



The height of a binary tree is the largest number of edges in a path from the root node to a leaf node. Essentially, it is the height of the root node. Note that if a tree has only one node, then that node is at the same time the root node and the only leaf node, so the height of the tree is 0. On the other hand, if the tree has no nodes, it’s height is -1.

The size of a binary tree is the total number of nodes in that tree.

The depth of a node is the number of edges in the path from the root node to that node.

The depth of a binary tree is usually used to refer to the height of the tree.




WIDTH/Diameter of a tree
=========================

And Width of tree is nothing but the level of the tree with maximum number of nodes.

The diameter of a tree (sometimes called the width) is the number of nodes on the longest path between two leaves in the tree.

Width of a tree is maximum of widths of all levels.

HEIGHT - TOP DOWN
DEPTH = BOTTOM UP
LEVEL = DEPTH +1
