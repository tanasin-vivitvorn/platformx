import unittest
import math
from memory_profiler import profile

class Node: 
    def __init__(self, value):
        self.value = value
        self.parent = None


@profile
def setup():
    nodes = [11]
    for i in range(1, 10):
        nodes.append(Node(i))
        parent_value = int(math.floor(i/2))

        if parent_value >= 1:
            nodes[i].parent = nodes[parent_value]
    
    return nodes

# @profile
def find_path(node):
    path = []
    parent = node

    while parent is not None:
        path.append(parent.value)
        parent = parent.parent

    return path

# @profile
def lca(node1, node2):
    path1 = find_path(node1)
    path2 = find_path(node2)

    size1 = len(path1)
    size2 = len(path2)

    index = size1 if size1 <= size2 else size2
    while index > 0 and path1[size1 - index] != path2[size2 - index]:
        index -= 1
    
    return path1[size1 - index]

nodes = setup()
lca(nodes[8], nodes[5])
print "LCA(6, 7) = ", lca(nodes[6], nodes[7])
print "LCA(3, 7) = ", lca(nodes[3], nodes[7])

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
