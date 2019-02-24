import unittest
import math
#from memory_profiler import profile

class Node: 
    def __init__(self, value):
        self.value = value
        self.parent = None


#@profile
def setup():
    nodes = [11]
    for i in range(1, 10):
        nodes.append(Node(i))
        parent_value = int(math.floor(i/2))

        if parent_value >= 1:
            nodes[i].parent = nodes[parent_value]
    
    return nodes

#This solution use for finds LCA in O(n) time
#using single traversal of Binary Tree and without extra storage for path arrays.
@profile
def lca(node1, node2):
    #if it has no parent then it is root node.
    #it no needs to do anything more just return the root.
    if node1.parent is None:
        return node1.value
    elif node2.parent is None:
        return node2.value

    #if they are equal then return any one of them
    #because each of them is LCA itself.
    if node1.value == node2.value:
        return node1.value

    #if they have same root then the root is LCA
    #but if it is not then we need to tracking from lowest node.
    #the lowest node is the node that has maximum value
    #example node1.value > node2.value that means node1 is in the same or lower level than node2
    if node1.parent.value == node2.parent.value:
        return node1.parent.value
    elif node1.value > node2.value:
        return lca(node1.parent, node2)
    elif node1.value < node2.value:
        return lca(node1, node2.parent)

nodes = setup()
print "LCA(6, 7) = ", lca(nodes[6], nodes[7])
print "LCA(3, 7) = ", lca(nodes[3], nodes[7])
print "LCA(8, 5) = ", lca(nodes[8], nodes[5])

class TestNode(unittest.TestCase):
    def test(self):
        nodes = setup()

        # Test node setup
        self.assertEqual(nodes[9].value, 9)
        self.assertEqual(nodes[9].parent.value, 4)
        self.assertEqual(nodes[9].parent.parent.value, 2)
        self.assertEqual(nodes[9].parent.parent.parent.value, 1)
        self.assertIsNone(nodes[9].parent.parent.parent.parent)

        self.assertEqual(nodes[6].value, 6)
        self.assertEqual(nodes[6].parent.value, 3)
        self.assertEqual(nodes[6].parent.parent.value, 1)
        self.assertIsNone(nodes[6].parent.parent.parent)

        self.assertEqual(lca(nodes[9], nodes[1]), 1)
        self.assertEqual(lca(nodes[9], nodes[8]), 4)
        self.assertEqual(lca(nodes[6], nodes[7]), 3)
        self.assertEqual(lca(nodes[3], nodes[7]), 3)

if __name__ == '__main__':
    unittest.main()
